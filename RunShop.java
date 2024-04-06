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
		//itterate through the ArrayList with the forEach command and add a new car from the String of information
		cars.forEach(carInfo -> carsArray.add(new Car(carInfo)));
		//itterate through the ArrayList with the forEach command and put a new user in the Dictionary from the String of information
		//later replace the "Dictionary Key" value with the username of User
		//userInfo.split(",")[6] to use the userInfo values as arrays 
		//and access the peice of information individually
		users.forEach(userInfo -> userDictionary.put(userInfo.split(",")[6], new User(userInfo)));
    }
	/** ArrayList structure to store cars when shop is running*/
    public static ArrayList<Car> carsArray = new ArrayList<Car>();

    /** Dictionary structure to store users when shop is running*/
	public static Dictionary<String, User>  userDictionary = new Hashtable<String,User>();

    public static void main(String[] args) {
		//initialize the cars and users values
        initializeShop();
        // Display a welcome message
        System.out.println("Welcome to Mine Cars Dealership System!");
        
        // Initialize necessary classes and variables here
        // For example, this could include initializing the inventory, user management, etc.
        
        // TODO: Implement the menu-driven system here
        boolean running = true;
        while (!running) {
            // Display the main menu options
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Please choose an option: ");

            // Read the user's choice
            int choice = readUserChoice();
            
            switch (choice) {
                case 1:
                    // Handle user login
                    handleLogin();
                    break;
                case 2:
                    // Exit the program
                    System.out.println("Thank you for using Mine Cars Dealership System!");
                    running = false;
                    break;
                default:
                    // Handle invalid options
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
    
    // Method to read user's choice from console
    private static int readUserChoice() {
        // This method should read the user's input and return the choice as an integer
        // Consider using Scanner for console input
        return 0; // Placeholder return value
    }
    
    // Method to handle user login
    private static void handleLogin() {
        // Implementation for handling user login
        // This may include asking for username/password, validating credentials, etc.
    }
    
}