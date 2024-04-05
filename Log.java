import java.time.*;
import java.time.format.DateTimeFormatter;

public class Log {
    //attributes
    private String timestamp; 
    private String eventDescription; 
    private String Username;


    // Log test = new Log("Jenna","test");
    // System.out.println(test);
    //Output: "17:30:04 05-04-2024 - Jenna test"

    /** Constructs a new Log entry with the supplied eventDescriptionIn and UsernameIn using the current timre and date value. */
    public Log(String UsernameIn, String eventDescriptionIn){
        //generate current date and time and assign as a string to timestamp
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        
        timestamp = myDateObj.format(myFormatObj);
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
        return timestamp+" - "+Username+" "+eventDescription;
    }
}