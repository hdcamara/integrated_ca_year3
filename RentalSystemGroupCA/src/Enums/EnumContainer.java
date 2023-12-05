
//USED this as reference to assign ENUMS with String values
//https://www.programiz.com/java-programming/enum-string
//https://stackoverflow.com/questions/3978654/best-way-to-create-enum-of-strings

package Enums;
/**
 * Student Name: Franklin Arruda Cirino
 * Student No.: 2021368
 */
   
public class EnumContainer {
    
    // greetings class message 
    // call toString method and return message in real time when run program
    public enum Greetings {
   
        MORNING {
             
        @Override
        public String toString(){
        return "Good morning!";
      }
    },
        
        AFTERNOON {
             
        @Override
        public String toString(){
        return "Good afternoon!";
      }
    },
          
        NOON {
             
        @Override
        public String toString(){
        return "Good noon!";
      }
    },
            
        EVENING {    
        @Override
        public String toString(){
        return "Good evening!";
      }
    },
  }
    
    
    //============================================================
    // get hour and return TO be validated in the greeting method
    public enum Hour {
    
    TWELVE(12),
    SEVENTEEN(17);
    
    final int hour;
    
    Hour (int hour){
    this.hour = hour;
    }
    
    public int getHour(){
    return hour;
    }
    }
}










