
package UserValidation;

/**
 * Student Name: Franklin Arruda Cirino
 * Student No.: 2021368
 */

public interface UserValidationInterface {
    
    /**
     * It validates User Name 
     * @param userName gets the user name
     * @return validation
     */
    public boolean validateUserName(String userName);
    
    /**
     * It validates User Pass 
     * @param passWrod gets the user pass
     * @return pass if valid is ok
     */
    public boolean validatePassWord(String passWrod);
    
    /**
     * It validates User Email 
     * @param email gets the user name
     * @return email valid if true
     */
    public boolean validateEmail(String email);
    
    /**
     * Get name, email and password input from the user
     * @return the values validated if true
     * Store them within a hash map (temporarily while the program runs)
     */
    public boolean registerUser();
   
}
