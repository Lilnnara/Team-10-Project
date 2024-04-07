public abstract class Car {
    private String id;
    private String carType;
    private String model;
    private String condition;
    private String color;
    private int capacity;
    private int mileage;
    private String fuelType;
    private String transmission;
    private String vin;
    private double price;
    private int carsAvailable;

    //Constructors
    protected Car(){}

    /**
     * Constructor for Car.  An abstract class.
     * @param idIn
     * @param carTypeIn
     * @param modelIn
     * @param conditionIn
     * @param colorIn
     * @param capacityIn
     * @param mileageIn
     * @param fuelTypeIn
     * @param transmissionIn
     * @param vinIn
     * @param priceIn
     * @param carsAvailableIn
     */
    protected Car(String idIn, String carTypeIn, String modelIn, String conditionIn, String colorIn, int capacityIn, int mileageIn, String fuelTypeIn, String transmissionIn, String vinIn, double priceIn, int carsAvailableIn){
        id = idIn;
        carType = carTypeIn;
        model = modelIn;
        condition = conditionIn;
        color = colorIn;
        capacity = capacityIn;
        mileage = mileageIn;
        fuelType = fuelTypeIn;
        transmission = transmissionIn;
        vin = vinIn;
        price = priceIn;
        carsAvailable = carsAvailableIn;
    }

    /**
     * Getter for id
     * @return
     */
    protected String getId() {
        return id;
    }

    /**
     * Setter for id
     * @param id
     */
    protected void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for carType
     * @return
     */
    protected String getCarType() {
        return carType;
    }

    /**
     * Setter for carType
     * @param carType
     */
    protected void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * Getter for model
     * @return
     */
    protected String getModel() {
        return model;
    }

    /**
     * Setter for model
     * @param model
     */
    protected void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter for condition
     * @return
     */
    protected String getCondition() {
        return condition;
    }

    /**
     * Setter for condition
     * @param condition
     */
    protected void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * Getter for color
     * @return
     */
    protected String getColor() {
        return color;
    }

    /**
     * Setter for color
     * @param color
     */
    protected void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for capacity
     * @return
     */
    protected int getCapacity() {
        return capacity;
    }

    /**
     * Setter for capacity
     * @param capacity
     */
    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Getter for mileage
     * @return
     */
    protected int getMileage() {
        return mileage;
    }

    /**
     * Setter for mileage
     * @param mileage
     */
    protected void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * Getter for fuelType
     * @return
     */
    protected String getFuelType() {
        return fuelType;
    }
    
    /**
     * Setter for fuelType
     * @param fuelType
     */
    protected void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Getter for transmission
     * @return
     */
    protected String getTransmission() {
        return transmission;
    }

    /**
     * Setter for transmission
     * @param transmission
     */
    protected void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /**
     * Getter for vin
     * @return
     */
    protected String getVin() {
        return vin;
    }

    /**
     * Setter for vin
     * @param vin
     */
    protected void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * Getter for price
     * @return
     */
    protected double getPrice() {
        return price;
    }

    /**
     * Setter for price
     * @param price
     */
    protected void setPrice(double price) {
        this.price = price;
    }

    /**
     * Getter for carsAvailable
     * @return
     */
    protected int getCarsAvailable() {
        return carsAvailable;
    }

    /**
     * Setter for carsAvailable
     * @param carsAvailable
     */
    protected void setCarsAvailable(int carsAvailable) {
        this.carsAvailable = carsAvailable;
    }
    
    /**
     * method to generate a clean String value for Car for printing and comparisons.
     * @return String value of Car object 
     */
    public String toString(){
        return id+","+carType+","+model+","+condition+","+color+","+capacity+","+mileage+","+fuelType+","+transmission+","+vin+","+price+","+carsAvailable;
    }

    /**
     * Updates the carsAvailable.  Adds the "amount" value if isIncrease is True, 
     * and subtracts the "amount" value if isIncrease is false as it would then be a decrease.
     * @param isIncrease boolean value, true if the number of carsAvailable is increasing.
     * @param amount the amount the carsAvailable is being increased or decreased by.
     */
    protected void updateCarsAvailable(boolean isIncrease, int amount){
        //add the amount to the balance
        if(isIncrease){
            setCarsAvailable(getCarsAvailable() + amount);;
        }
        //if deposit is false then the transaction is a withdrawl and the amount should be subtracted
        else{
            setCarsAvailable(getCarsAvailable() - amount);
        }
    }
}