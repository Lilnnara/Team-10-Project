public class Car {
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
    public Car(){}
    public Car(String idIn, String carTypeIn, String modelIn, String conditionIn, String colorIn, int capacityIn, int mileageIn, String fuelTypeIn, String transmissionIn, String vinIn, double priceIn, int carsAvailableIn){
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

    //Getters and Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCarsAvailable() {
        return carsAvailable;
    }
    public void setCarsAvailable(int carsAvailable) {
        this.carsAvailable = carsAvailable;
    }
    
    /**
     * method to generate a clean String value for Car for printing and comparisons.
     * @return String value of Car object 
     */
    public String toString(){
        return id+","+carType+","+model+","+condition+","+color+","+capacity+","+mileage+","+fuelType+","+transmission+","+vin+","+price+","+carsAvailable;
    }
}