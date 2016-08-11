package labs.set9and10.q1;
import javax.swing.*;
/** exception thrown by parseInt() within getAge() is propagated back to main()
 * main doesn't catch the exception
 *@author Wu
 */
public class AgeInput4 {
	static int    age;
  public static void main (String args[]){ 
	  age = getAge("Please enter your age: ");
      JOptionPane.showMessageDialog(null,"Your age is " + age);
        
    }// end main
    
    /** asks the user to enter a value and returns it
     * doesn't attempt to handle problems itself
     *@param prompt the prompt to display
     */
    public static int getAge(String prompt) throws NumberFormatException {
        String inputStr;
        
        try {
	        inputStr  = JOptionPane.showInputDialog(null, prompt);
	        age = Integer.parseInt(inputStr);
	         //input okay so return the value & exit
	        
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Entry\n"
                                        + "Please enter digits only");
        } // end catch
        return age;
    }// end getAge()

}
/*
*Q1 e.
*
*	f.
*
*/