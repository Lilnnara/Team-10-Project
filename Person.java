public abstract class Person {
    // Attributes
    protected String firstName;
    protected String lastName;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    public abstract String getFirstName() {
        return firstName;
    }

    public abstract void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public abstract String getLastName() {
        return lastName;
    }

    public abstract void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
