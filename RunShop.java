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
    public static void main(String[] args) {
        // Display a welcome message
        System.out.println("Welcome to Mine Cars Dealership System!");
        
        // Initialize necessary classes and variables here
        // For example, this could include initializing the inventory, user management, etc.
        
        // TODO: Implement the menu-driven system here
        boolean running = true;
        while (running) {
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
