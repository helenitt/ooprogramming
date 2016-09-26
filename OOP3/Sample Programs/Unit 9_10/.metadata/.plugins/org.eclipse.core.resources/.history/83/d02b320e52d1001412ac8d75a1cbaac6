package comm.walsh.exceptionexamples;
import javax.swing.*;
/** exception thrown by parseInt() within getAge() is propagated back to main()
 * main doesn't catch the exception
 *@author Wu
 */
public class AgeInput4 {
  public static void main (String args[]){
        int    age;
        
        try {
              age = getAge("Please enter your age: ");
              JOptionPane.showMessageDialog(null,"Your age is " + age);
            } 
        catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid Entry\n"
                                            + "Please enter digits only");
        } // end catch	
    }// end main
    
    /** asks the user to enter a value and returns it
     * doesn't attempt to handle problems itself
     *@param prompt the prompt to display
     */
    public static int getAge(String prompt) throws NumberFormatException {
        String inputStr;
        int    age;
        inputStr  = JOptionPane.showInputDialog(null, prompt);
        age = Integer.parseInt(inputStr);
        return age; //input okay so return the value & exit
    }// end getAge()

}