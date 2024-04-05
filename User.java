/**
 * Represents a user of the Mine Cars dealership system. Users can view, filter, and purchase cars.
 * This class includes methods for user authentication, displaying cars, and handling car purchases.
 * 
 * @author  Nara Macias, Jenna Murphree, Sofia Martinez
 * @version 1.0
 * @since 2024-03-29
 */
public class User {
    // User attributes
    private String username;
    private String password; // Consider using a more secure way to store passwords
    private double budget; // User's budget for buying cars

    /**
     * Constructor to create a new User with the specified username, password, and budget.
     * 
     * @param username The user's username.
     * @param password The user's password.
     * @param budget The user's budget for purchasing cars.
     */
    public User(String username, String password, double budget) {
        this.username = username;
        this.password = password;
        this.budget = budget;
    }

    
    //userInformation.split(",")[*] to use the userInfo values as arrays 
    //or temp = userInformation.split(","); temp[*]
    public User(String userInformationIn){
        
    }

    /**
     * Gets the username of the user.
     * 
     * @return A string representing the user's username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the user's username.
     * 
     * @param username The new username for the user.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the user's budget.
     * 
     * @return The user's budget.
     */
    public double getBudget() {
        return budget;
    }

    /**
     * Sets the user's budget.
     * 
     * @param budget The new budget for the user.
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }

    /**
     * Method to simulate user login. This should be replaced or updated with real authentication logic.
     * 
     * @param username The username entered by the user.
     * @param password The password entered by the user.
     * @return true if the login is successful, false otherwise.
     */
    public boolean login(String username, String password) {
        // Dummy logic for login, replace with actual authentication logic
        return this.username.equals(username) && this.password.equals(password);
    }

    /**
     * Displays information about the user, including username and budget.
     */
    public void displayUserInfo() {
        System.out.println("Username: " + username);
        System.out.println("Budget: $" + budget);
    }

    // Add additional methods for user functionalities such as viewing cars, filtering cars, purchasing cars, etc.
}
