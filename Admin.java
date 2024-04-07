public class Admin extends Person {
    // Attributes specific to Admin
    private String username;
    private String password;

    // Constructor
    public Admin(String firstName, String lastName, String username, String password) {
        super(firstName, lastName);
        this.username = username;
        this.password = password;
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * method to generate a clean String value for Admin for printing and comparisons.
     * @return String value of User object 
     */
    public String toString(){
        return firstName+","+lastName+","+username+","+password;
    }
}