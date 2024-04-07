public class Admin extends Person {
    // Attributes specific to Admin
    private String username;
    private String password;

    /**
     * Constructor for Admin.  That extends Person class.
     * @param firstName
     * @param lastName
     * @param username
     * @param password
     */
    protected Admin(String firstName, String lastName, String username, String password) {
        super(firstName, lastName);
        this.username = username;
        this.password = password;
    }

    
    /**
     * Getter for username 
     * @return String
     */
    protected String getUsername() {
        return username;
    }

    /**
     * Setter for username
     * @param username
     */
    protected void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for password
     * @return
     */
    protected String getPassword() {
        return password;
    }

    /**
     * Setter for password
     * @param password
     */
    protected void setPassword(String password) {
        this.password = password;
    }

    /**
     * Method to generate a clean String value for Admin for printing and comparisons.
     * @return String value of Admin object 
     */
    public String toString(){
        return super.getFirstName()+","+super.getLastName()+","+username+","+password;
    }
}