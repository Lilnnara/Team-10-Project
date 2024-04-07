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

    /**
     * method to generate a clean String value for Car for printing and comparisons.
     * @return String value of Car object 
     */
    public String toString(){
        return id+","+carType+","+model+","+condition+","+color+","+capacity+","+mileage+","+fuelType+","+transmission+","+vin+","+price+","+carsAvailable;
    }
}