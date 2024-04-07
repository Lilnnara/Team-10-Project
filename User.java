public class User extends Person {
    // Attributes specific to User
    private int id;
    private double moneyAvailable;
    private int carsPurchased;
    private boolean minecarsMembership;
    private String username;
    private String password;

    /**
     * Constructor for User.  That extends Person class.
     * @param id
     * @param firstName
     * @param lastName
     * @param moneyAvailable
     * @param carsPurchased
     * @param minecarsMembership
     * @param username
     * @param password
     */
    protected User(int id, String firstName, String lastName, double moneyAvailable, int carsPurchased, boolean minecarsMembership, String username, String password) {
        super(firstName, lastName); // Call to the superclass (Person) constructor
        this.id = id;
        this.moneyAvailable = moneyAvailable;
        this.carsPurchased = carsPurchased;
        this.minecarsMembership = minecarsMembership;
        this.username = username;
        this.password = password;
    }
     
    /** 
     * Getter for id
     * @return int
     */
    protected int getId() {
        return id;
    }
   
    /** 
     * Setter for id
     * @param id
     */
    protected void setId(int id) {
        this.id = id;
    }
    
    /**
     * Getter for moneyAvailable
     * @return
     */
    protected double getMoneyAvailable() {
        return moneyAvailable;
    }

    /**
     * Setter for moneyAvailable
     * @param moneyAvailable
     */
    protected void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    /**
     * Getter for carsPurchased
     * @return
     */
    protected int getCarsPurchased() {
        return carsPurchased;
    }

    /**
     * Setter for carsPurchased
     * @param carsPurchased
     */
    protected void setCarsPurchased(int carsPurchased) {
        this.carsPurchased = carsPurchased;
    }

    /**
     * Getter for minecarsMembership
     * @return
     */
    protected boolean isMinecarsMembership() {
        return minecarsMembership;
    }

    /**
     * Setter for minecarsMembership
     * @param minecarsMembership
     */
    protected void setMinecarsMembership(boolean minecarsMembership) {
        this.minecarsMembership = minecarsMembership;
    }

  
    /**
     * Getter for username
     * @return
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
     * Method to generate a clean String value for User for printing and comparisons.
     * @return String value of User object 
     */
    public String toString(){
        return ""+id+","+super.getFirstName()+","+super.getLastName()+","+moneyAvailable+","+carsPurchased+","+(minecarsMembership?"True":"False")+","+username+","+password;
    }

    /**
     * Updates the moneyAvailable.  Adds the "amount" value if isDeposit is True, 
     * and subtracts the "amount" value if isDeposit is false as it would then be a withdrawl.
     * @param isDeposit
     * @param amount
     */
    public void updateMoneyAvailable(boolean isDeposit, double amount){
        //add the amount to the balance
        if(isDeposit){
            setMoneyAvailable(getMoneyAvailable() + amount);
        }
        //if deposit is false then the transaction is a withdrawl and the amount should be subtracted
        else{
            setMoneyAvailable(getMoneyAvailable() - amount);
        }
    }
}