public class Log {
    //attributes
    private String timestamp; 
    private String eventDescription; 
    private String Username;

    /** Constructs a new Log entry with the supplied eventDescriptionIn and UsernameIn using the current timre and date value. */
    public Log(String eventDescriptionIn, String UsernameIn){
        //generate current date and time and assign as a string to timestamp
        timestamp = "temp";
        eventDescription = eventDescriptionIn;
        Username = UsernameIn;
    }

    //insert Getters and Setters here

    /** 
     * This method generates a String value of all the concatenated attributes of the Log file.
     * 
     * @return String value of all Log attributes
     */
    public String toString(){
        return timestamp+eventDescription+Username;
    }
}