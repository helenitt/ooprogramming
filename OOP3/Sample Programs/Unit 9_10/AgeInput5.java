import javax.swing.*;
/** uses a range-checked method to get an age from a user
 * method throws a user-written exception if value outside range
 * needs AgeInputException class in the same folder
 *@author Wu 
 */
public class AgeInput5 {
  public static void main (String args[]){
        int    age;
        try {
              age = getAge("Please enter your age: ", 18,50);
              JOptionPane.showMessageDialog(null,"Your age is " + age);
            } 
        catch (AgeInputException e) 
        {
                JOptionPane.showMessageDialog(null, e.getMessage());
        } // end catch	
		
    }
    /** method to get an int value from the user and check that it is within a specific range
     * contains a loop to check for number format exceptions
     *@param prompt the prompt to display
     *@param lowerBound the lower bound of the allowed range
     *@param upperBound the upper bound of the allowed range
     *@return the age: invalid ages throw an exception
     */
    public static int getAge(String prompt,int lowerBound,int upperBound) throws AgeInputException {
        String inputStr;
        int  age = 0;;
        boolean valid = false;
        while (!valid) {
            inputStr  = JOptionPane.showInputDialog(null, prompt + " it should be between " + lowerBound
             + " and " + upperBound);
            try {
                age = Integer.parseInt(inputStr);

                if (age < lowerBound || age > upperBound) 
                    throw new AgeInputException("Input out of bound",
                                                lowerBound, upperBound, age);
                
                valid = true;
            } // end try 
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "'" + inputStr
                                        + "' is invalid\n"
                                        + "Please enter digits only");
            }// end catch
        }// end while
        return age;
   }// end getAge
} // end class