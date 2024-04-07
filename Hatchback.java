public class Hatchback extends Car{
    /**
     * Constructor for Hatchback.  That extends Car class.
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
    protected Hatchback(String idIn, String carTypeIn, String modelIn, String conditionIn, String colorIn, int capacityIn, int mileageIn, String fuelTypeIn, String transmissionIn, String vinIn, double priceIn, int carsAvailableIn){
        super(idIn, carTypeIn, modelIn, conditionIn, colorIn, capacityIn, mileageIn, fuelTypeIn, transmissionIn, vinIn, priceIn, carsAvailableIn);
    }
}
