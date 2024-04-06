/**
 * Represents a user of the Mine Cars dealership system. Users can view, filter, and purchase cars.
 * This class includes methods for user authentication, displaying cars, and handling car purchases.
 * 
 * @author Nara Macias, Jenna Murphree, Sofia Martinez
 * @version 1.0
 * @since 2024-03-29
 */
public class User {
    // User attributes
    private int id;
    private String firstName;
    private String lastName;
    private double moneyAvailable;
    private int carsPurchased;
    private boolean minecarsMembership;
    private String username;
    private String password;

    // Constructor
    public User(int id, String firstName, String lastName, double moneyAvailable, int carsPurchased, boolean minecarsMembership, String username, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.moneyAvailable = moneyAvailable;
        this.carsPurchased = carsPurchased;
        this.minecarsMembership = minecarsMembership;
        this.username = username;
        this.password = password;
    }

    // Getters and setters for each attribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public int getCarsPurchased() {
        return carsPurchased;
    }

    public void setCarsPurchased(int carsPurchased) {
        this.carsPurchased = carsPurchased;
    }

    public boolean isMinecarsMembership() {
        return minecarsMembership;
    }

    public void setMinecarsMembership(boolean minecarsMembership) {
        this.minecarsMembership = minecarsMembership;
    }

    public String getUsername() {
        return username;
    }

    // Username and password setters are already provided in your code

    public String getPassword() {
        return password;
    }

    // Method to update money available based on addition or subtraction
    public void updateMoneyAvailable(boolean isAddition, double amount) {
        if (isAddition) {
            this.moneyAvailable += amount;
        } else {
            this.moneyAvailable -= amount;
        }
    }

    // toString method to return user information as a String
    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", moneyAvailable=" + moneyAvailable +
               ", carsPurchased=" + carsPurchased +
               ", minecarsMembership=" + minecarsMembership +
               ", username='" + username + '\'' +
               ", password='" + password + '\'' +
               '}';
    }

    // Existing methods from the starter code can remain unchanged
}
