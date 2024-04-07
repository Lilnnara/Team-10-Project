import java.util.ArrayList;
import java.util.Dictionary;

public class TestCases {

    
    /** 
     * Method to test if reading the car_data file, the Car object constructor, and the Car toString method are all working correctly
     * @param cars ArrayList of Strings of car information from the car_data file
     * @param carsArray ArrayList of Cars used to hold Car data in RunShop
     */
    protected static void testCarsStringsAndConstructors(ArrayList<String> cars, ArrayList<Car> carsArray){
        System.out.println("Does car.toString() align with File input?");
        for(int i = 0; i < cars.size(); i++){
            if(!(cars.get(i).equals(carsArray.get(i).toString()))){
                System.out.println("Cars class and toString Error at line: " + (i+1));
                System.out.println(cars.get(i));
                System.out.println("Is not equal to:");
                System.out.println(carsArray.get(i).toString());
            }
        }
        System.out.println("\tcar.toString() test done");
    }
    
    /** 
     * Method to test if reading the user_data file, the User object constructor, and the User toString method are all working correctly
     * @param users ArrayList of Strings of user information from the user_data file
     * @param userDictionary Dictionary of Users with username as keywords used to hold User data in RunShop
     */
    protected static void testUsersStringsAndConstructors(ArrayList<String> users, Dictionary<String,User> userDictionary){
        System.out.println("Does user.toString() align with File input?");
        for(int i = 0; i < users.size(); i++){
            String tempUsername = users.get(i).split(",")[6];
            if(!(users.get(i).equals(userDictionary.get(tempUsername).toString()))){
                System.out.println("Users class and toString Error at line: " + (i+1));
                System.out.println(users.get(i));
                System.out.println("Is not equal to:");
                System.out.println(userDictionary.get(tempUsername).toString());
            }
        }
        System.out.println("\tuser.toString() test done");
    }
}
