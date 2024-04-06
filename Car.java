import java.lang.Number;

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

    //carInformation.split(",")[*] to use the userInfo values as arrays 
    //or temp = carInformation.split(","); temp[*]
    public Car(String carInformationIn){
        String[] temp = carInformationIn.split(","); 
        if(temp.length != 12){
            System.out.println("Not enough information to create Car: " + carInformationIn);
            return;
        }
        id = temp[0];
        carType = temp[1];
        model = temp[2];
        condition = temp[3];
        color = temp[4];
        capacity = Integer.parseInt(temp[5]);
        mileage = Integer.parseInt(temp[6]);
        fuelType = temp[7];
        transmission = temp[8];
        vin = temp[9];
        price = Double.parseDouble(temp[10]);
        carsAvailable = Integer.parseInt(temp[11]);
    }
    public Car(String idIn, String carTypeIn, String modelIn, String conditionIn, String colorIn, int capacityIn, int mileageIn, String fuelTypeIn, String transmissionIn, String vinIn, double priceIn, int carsAvailableIn){

    }

    //toString() method:
    public String toString(){
        return id+","+carType+","+model+","+condition+","+color+","+capacity+","+mileage+","+fuelType+","+transmission+","+vin+","+price+","+carsAvailable;
    }
}