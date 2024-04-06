class User extends Person {
    // Attributes specific to User
    private int id;
    private double moneyAvailable;
    private int carsPurchased;
    private boolean minecarsMembership;
    private String username;
    private String password;

    // Constructor for User
    public User(int id, String firstName, String lastName, double moneyAvailable, int carsPurchased, boolean minecarsMembership, String username, String password) {
        super(firstName, lastName); // Call to the superclass (Person) constructor
        this.id = id;
        this.moneyAvailable = moneyAvailable;
        this.carsPurchased = carsPurchased;
        this.minecarsMembership = minecarsMembership;
        this.username = username;
        this.password = password;
    }

    //userInformation.split(",")[*] to use the userInfo values as arrays 
    //or temp = userInformation.split(","); temp[*]
    public User(String userInformationIn){
        super("hi", "test");
        return;
    }


    // Getters and setters for User attributes
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setUsername(String username) {
        this.username = username;
    }

  
    public String getPassword() {
        return password;
    }

  
    public void setPassword(String password) {
        this.password = password;
    }


    public String toString(){
        return "hi";
    }
}