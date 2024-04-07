public abstract class Person {
    // Attributes
    private String firstName;
    private String lastName;

    // Constructors
    protected Person(){}

    /**
     * Constructor for Person.  An abstract class.
     * @param firstName
     * @param lastName
     */
    protected Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /** 
     * Getter for firstName
     * @return String
     */
    protected String getFirstName() {
        return firstName;
    }

    /** 
     * Setter for firstName
     * @param firstName
     */
    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Getter for lastName
     * @return String
     */
    protected String getLastName() {
        return lastName;
    }

    /** 
     * Setter for lastName
     * @param lastName
     */
    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
