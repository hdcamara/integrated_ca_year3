
package Greetings;
import java.util.Calendar;
import java.util.GregorianCalendar;
import Enums.EnumContainer.Hour;
import Enums.EnumContainer.Greetings;

/**
 * Student Name: Franklin Arruda Cirino
 * Student No.: 2021368
 */

public class GreetUser {
    /**
     * Import Enum container
     * Call enum Hour of the day to be validaded inside the if statement
     * Call enum greetings toString method and print it out
     */
    public void greetUser(){
        
        // getting current time to greeting the user
            GregorianCalendar time = new GregorianCalendar();
            int hour = time.get(Calendar.HOUR_OF_DAY);
             
            
                // if hour is less than 12 , display good morning
                if (hour < Hour.TWELVE.getHour()){
                    System.out.println(Greetings.MORNING.toString()); 
                }
                
                
                // if hour is equal to 12 , display noon, midday(lunch time :-)
                 else if (hour == Hour.TWELVE.getHour()){
                    System.out.println(Greetings.NOON.toString());
                 }
                
                 
                 // if hour is less than 12 and not greater than 17, display good afternoon
                 else if (hour < Hour.SEVENTEEN.getHour() && !(hour == Hour.TWELVE.getHour())){
                    System.out.println(Greetings.AFTERNOON.toString());
                 }
                 
                 
                 // if hour is greater than 17, display evening 
                 else{
                     System.out.println(Greetings.EVENING.toString());
                 }
        }   
}
