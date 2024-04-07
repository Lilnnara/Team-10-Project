import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.io.File;
import java.util.Scanner;

/**
 * Name(s): Jenna Murphree, Sofia Martinez, Nara Macias
 * Date: March 27, 2024
 * Course: Advanced Object-Oriented Programming CS-3331
 * Instructor: Dr. Gurijala
 * Project Part 1
 * Lab Description: This program is designed to simulate a car dealership system called Mine Cars. It offers both brand new and used cars with a variety of models to satisfy customer preferences. The system supports user login, car browsing, purchasing, and admin functionalities.
 * Honesty Statement: I hereby confirm that this work is my own and not derived from any outside sources except for the assistance provided by the instructor, TA, or IA.
 */

 public class RunShop {

    /** ArrayList structure to store cars when shop is running*/
    public static ArrayList<Car> carsArray = new ArrayList<Car>();

    /** Dictionary structure to store users when shop is running*/
    public static Dictionary<String, User>  userDictionary = new Hashtable<String,User>();


    /**
     * Program main method.
     * @param args
     */
    public static void main(String[] args) {
		//initialize the cars and users values
        initializeShop();
        // Display a welcome message
        System.out.println("Welcome to Mine Cars Dealership System!");
        //Prompt user to select to login as an Admin or User
        boolean running = true;
        while(running){
            System.out.println("Would you like to login as: \n 1) Admin \n 2) User \n 3) Exit Program");
            int input = readUserChoice();
            switch (input) {
                case 1:
                    //Handle admin login with the login(true) method which calls adminLogin. (typecast to Admin to use in adminPortal) Returns null if login unsuccessful.
                    Admin admin = (Admin)login(true);
                    adminPortal(admin);
                    break;
                case 2:
                    //Handle user login with the login(false) method which calls userLogin. (typecast to User to use in userPortal) Returns null if login unsuccessful.
                    User user = (User)login(false);
                    userPortal(user);
                    break;
                case 3:
                    // Exit the program by changing the running value to false
                    running = false;
                    break;
                default:
                    // Handle invalid options
                    System.out.print("Please enter a valid response.\n");
                    break;
            }
        }
        updateData();
        System.out.println("Thank you for using Mine Cars Dealership System. Have a good day!");
    }
    
    /** 
     *method to read a file and assign each line of text as a string element in order to an ArrayList
     * @param fileLocation String value of the file location in reference to the current folder or the exact location
     * @return ArrayList<String> of String lines of the text file in order
     */
    public static ArrayList<String> readFile(String fileLocation) {
        ArrayList<String> fileLines = new ArrayList<String>();
		// create new File
        File file = new File(fileLocation);
		try{
            //create new Scanner
			Scanner fileScanner = new Scanner(file);
            //scan first line with the headers and discard
            fileScanner.nextLine();
            //iterate through the whole file
			while(fileScanner.hasNextLine()){
                //add each line to the fileLines ArrayList
				fileLines.add(fileScanner.nextLine());
			}
            //close scanner
            fileScanner.close();
		}
		catch(Exception e){
			//adjust the exception here later to not end the program
			e.printStackTrace();
		}
        //return fileLines ArrayList
		return fileLines;
    }

     /** 
     *method to set up the shop with all the car and user values in the appropriate structures.
     * Has no inputs or outputs.
     */
    public static void initializeShop(){
		/*call readFile() to get each line of the csv text as a string that can be handled later in the method,
		 to create the appropriate Objects*/
        ArrayList<String> cars = readFile("car_data");
        ArrayList<String> users = readFile("user_data");
		//itterate through the ArrayLists using a for loop and the .size() method for both object types
		for(int i = 0; i < cars.size(); i++){
            //add a new car from the String of information to the Arraylist carsArray with the .add() method.
            String[] temp = cars.get(i).split(","); 
            String tempCarType = temp[1];
            //switch case to create a car object of the correct subclass from the CarType variable
            switch (tempCarType) {
                case "Sedan":
                    carsArray.add(new Sedan(temp[0], temp[1], temp[2], temp[3], temp[4], Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), temp[7], temp[8], temp[9], Double.parseDouble(temp[10]), Integer.parseInt(temp[11])));
                    break;
                case "SUV":
                    carsArray.add(new SUV(temp[0], temp[1], temp[2], temp[3], temp[4], Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), temp[7], temp[8], temp[9], Double.parseDouble(temp[10]), Integer.parseInt(temp[11])));
                    break;
                case "Hatchback":
                    carsArray.add(new Hatchback(temp[0], temp[1], temp[2], temp[3], temp[4], Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), temp[7], temp[8], temp[9], Double.parseDouble(temp[10]), Integer.parseInt(temp[11])));    
                    break;
                case "Pickup":
                    carsArray.add(new Pickup(temp[0], temp[1], temp[2], temp[3], temp[4], Integer.parseInt(temp[5]), Integer.parseInt(temp[6]), temp[7], temp[8], temp[9], Double.parseDouble(temp[10]), Integer.parseInt(temp[11])));
                    break;
                default:
                    System.out.println("The car below could not be added due to unsuported Car Type:");
                    System.out.println(cars.get(i));
                    break;
            }
        }
        for(int i = 0; i < users.size(); i++){
            //add a new user from the String of information to the Dictionary
            String[] temp = users.get(i).split(","); 
            //use tempUsername to hold the username value and then use it as the dictionary key when the User object is added with the put() method
            String tempUsername = temp[6];
            userDictionary.put(tempUsername, new User(Integer.parseInt(temp[0]), temp[1], temp[2], Double.parseDouble(temp[3]), Integer.parseInt(temp[4]), Boolean.parseBoolean(temp[5]), temp[6], temp[7]));
        }
    }
	
    /**
     * Method to read user's integer choice from console 
     * @return integer value of user input or default -1 value for non integer inputs
     */
    private static int readUserChoice() {
        int choice = -1;
        try{
            Scanner in = new Scanner(System.in);
            //check if the user has inputed an integer as the next value
            if (in.hasNextInt()){
                //collect the integer
                choice = in.nextInt();
            }
            //clear the scanner to the end of the line to avoid errors
            in.nextLine();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return choice; // return choice, integer value of user input or default -1 value for non integer inputs
    }
    
    /** 
     * Method to handle user or admin login. Uses a System.in Scanner to collect the Username and Password
     * then takes the credentials to the admin or user login depending on the isAdmin parameter.
     * @param isAdmin boolean value of whether the person trying to login is an Admin or a User
     * @return Returns a Person value of the User or Admin if the login was successful. Returns null if not.
     */
    private static Person login(boolean isAdmin) {
        Person person = null;
        //Ask for username and password
        Scanner in = new Scanner(System.in);
        System.out.print("Username:");
        String username = in.next();
        //clear the scanner to the end of the line to avoid errors
        in.nextLine();
        System.out.print("Password:");
        //clear the scanner to the end of the line to avoid errors
        String password = in.next();
        in.nextLine();
        //if input boolean value is true call adminLogin and assign generated admin to person
        if(isAdmin){
            person = adminLogin(username, password);
        }
        //if input boolean value is false call userLogin and assign generated User to person
        else{
            person = userLogin(username, password);
        }
        //return person collected
        return person;
    }

    /** 
     * Method to handle User login.
     * @param usernameIn provided username
     * @param passwordIn provided login
     * @return Returns the object for the specific User when login is successful, returns null if not.
    */
    private static User userLogin(String usernameIn, String passwordIn){
        //pull User object from dictionary, value will return null if user does not exist
        User user = userDictionary.get(usernameIn);
        //if user exists in system check the password is the same
        if(user!= null){
            //if the password is correct return the user object
            if(user.getPassword().equals(passwordIn)){
                return user;
            }
        }
        //if the username does not exist or the password does not match, return null
        return null;
    }

        /** 
     * Method to handle Admin login.
     * @param usernameIn provided username
     * @param passwordIn provided login
     * @return Returns the object for the specific Admin when login is successful, returns null if not.
    */
    private static Admin adminLogin(String usernameIn, String passwordIn){
        //default hardcoded admin login.
        Admin admin = new Admin("Stella", "Maeve", "Admin", "Pa$word");
        //if admin exists in system check the password is the same
        if(admin!= null){
            //if the password is correct return the admin object
            if(admin.getPassword().equals(passwordIn)){
                return admin;
            }
        }
        //if the username does not exist or the password does not match, return null
        return null;
    }

    /**
     * Portal for User controls. 
     * @param user Person object of the user 
     */
    private static void userPortal(User user){
        ArrayList<String> tickets = new ArrayList<String>();
        if(user == null){
            System.out.println("You do not have access to the user account.  The username or password may be incorrect.");
            return;
        }
        boolean running = true;
        while(running){
            System.out.println("\nHello "+ user.getFirstName() + " " + user.getLastName() +", what would you like to do today?");
            System.out.println(" 1) Display all cars.");
            System.out.println(" 2) Filter Cars");
            System.out.println(" 3) Purchase a car");
            System.out.println(" 4) View Tickets");
            System.out.println(" 5) Sign out");
            int input = readUserChoice();
            switch (input) {
                case 1:
                    browseCars(carsArray);
                    break;
                case 2:
                    filterCars(carsArray);
                    break;
                case 3:
                    String ticket = purchaseCar(user,carsArray);
                    if (ticket.length() > 0){
                        tickets.add(ticket);
                    }
                    break;
                case 4:
                    viewTickets(tickets);
                    break;
                case 5:
                    // Exit the program by changing the running value to false
                    running = false;
                    break;
                default:
                    // Handle invalid options
                    System.out.print("Please enter a valid response.\n");
                    break;
            }
        }
    }
    

    /**
     * Portal for Admin controls.  Currently allows Admin to test various code functionalities.
     * @param admin Person object of the admin 
     */
    private static void adminPortal(Admin admin){
        ArrayList<Car> testCarsArray = new ArrayList<Car>();
        testCarsArray.add(new Sedan("1","Sedan","Toyota Camry","New","Silver",5,3067,"Diesel","Automatic","61J7MKYN8AUG05XV3",20688.35,0));
        testCarsArray.add(new SUV("2","SUV","Toyota RAV4","Old","Green",5,2903,"Gasoline","Automatic","FVCRJHUHZCEX8LCDC",33050.65,0));
        testCarsArray.add(new Hatchback("3","Hatchback","Honda Fit","New","Yellow",5,3055,"Hybrid","Automatic","YNA6L2L65Z33P6C4O",23471.55,3));
        testCarsArray.add(new Pickup("4","Pickup","Ford F-150","Old","Black",5,339,"Gasoline","Automatic","9OV4OJ6SREVR4V2ZQ",21687.59,10));

        //Dictionary<String,User> testUserDictionary = new Hashtable<String,User>();
        ArrayList<String> testTicketsList = new ArrayList<String>();
        User testUserA = new User(1, "testUserA", "Customer", 0, 0, false, "testUserA" , "password");
        User testUserB = new User(2, "testUserB", "Customer", 0, 0, false, "testUserB", "password");
        
        if(admin == null){
            System.out.println("You do not have access to the admin portal.");
            return;
        }
        boolean running = true;
        while(running){
            System.out.println("\nWelcome to the Admin Portal, what would you like to test today?");
            System.out.println(" 1) Test Display all cars.");
            System.out.println(" 2) Test Filter Cars");
            System.out.println(" 3) Test Purchase a car");
            System.out.println(" 4) Test View Tickets");
            System.out.println(" 5) testCarsStringsAndConstructors(ArrayList<String> cars, ArrayList<Car> carsArray)");
            System.out.println(" 6) testUsersStringsAndConstructors(ArrayList<String> users, Dictionary<String,User> userDictionary)");
            //System.out.println(" #) ");
            System.out.println(" -1) Sign out");
            int input = readUserChoice();
            switch (input) {
                case 1:
                    browseCars(testCarsArray);
                    break;
                case 2:
                    filterCars(testCarsArray);
                    break;
                case 3:
                    String ticket = purchaseCar(testUserA,testCarsArray);
                    if (ticket.length() > 0){
                        testTicketsList.add(ticket);
                    }
                    break;
                case 4:
                    viewTickets(testTicketsList);
                    break;
                case 5:
                    TestCases.testCarsStringsAndConstructors(readFile("car_data"), carsArray);
                    break;
                case 6:
                    TestCases.testUsersStringsAndConstructors(readFile("user_data"), userDictionary);
                    break;

                // case #:
                    
                //     break;
                case -1:
                    // Exit the program by changing the running value to false
                    running = false;
                    break;
                default:
                    // Handle invalid options
                    System.out.print("Please enter a valid response.\n");
                    break;
            }
        }
    }

    /**
     * Prints the details of all cars from the provided ArrayList of Cars
     * @param ArrayList<Car> list of cars being browsed
     */
    public static void browseCars(ArrayList<Car> carsArrayList){
        System.out.println("browseCars");
    }
    
    /**
     * Takes ArrayList input and asks the user how they would like it filtered and then 
     * filters the cars by the CarType provided then prints the results.
     * @param ArrayList<Car> the ArrayList you want to filter.
     */
    public static void filterCars(ArrayList<Car> carsArrayList){
        System.out.println("\t How would you like to filter?");
        System.out.println("\t 1) Show New Cars");
        System.out.println("\t 2) Show Used Cars");
        int filterType = readUserChoice();
        switch (filterType) {
            case 1:
                ;
                break;
            case 2:
                ;
                break;
            default:
                System.out.print("\tPlease enter a valid response.\n");    
                break;
        }
        System.out.println("filterCars");
    }

    /**
     * Takes user input and ArrayList cars input, asks the user which car they would like to purchase from the list of cars, 
     * confirms that the car is available and within budget of the User's moneyAvailable.
     * If car is not available and/or out of budget returns an empty string ("").
     * Adjusts the moneyAvailable and carsAvailable to reflect the purchase, creates a ticket as a String and returns it.
     * @param user
     * @param ArrayList<Car>
     * @return String value of Ticket from purchase. Returns an empty string ("") if purchase is not successful.
     */
    public static String purchaseCar(User user, ArrayList<Car> carsArrayList){ 
        System.out.println("\t What car would you like to buy?");
        int carIndex = readUserChoice();
        if(carIndex < carsArray.size() && carIndex >= 0){
            //purchaseCar(carsArray.get(carIndex), user);
        }
        else{
            System.out.println("\t Car index out of range.  That car cannot be purchased at this time.");
        }
        System.out.println("purchaseCar");
        //create ticket: Car Type, Model, Color
        return "";
    }

    /**
     * Prints tickets when requested from the stored list in the user portal.  
     * Assumption, Tickets are not preserved after logging out.
     * @param ArrayList<String> An ArrayList Containing the Ticket being viewed.
     */
    public static void viewTickets(ArrayList<String> tickets){
        System.out.println("Here are all the purchased car tickets you generated since you logged in: ");
        for(int i = 0; i < tickets.size();i++){
            System.out.println(tickets.get(i));
        }
    }

    /**
     * Runs when the program is exited to overwrite the car_data and user_data.
     * with the updated values that were generated while the program was running.
     */
    private static void updateData(){
        System.out.println("updateData");
    }
}