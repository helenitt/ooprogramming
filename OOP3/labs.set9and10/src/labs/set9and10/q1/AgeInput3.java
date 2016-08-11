package labs.set9and10.q1;
import javax.swing.*;
/** catches NumberFormatException and forces user to re-enter
 */
public class AgeInput3 {
  public static void main (String args[]){
        String inputStr;
        int    age;
		boolean valid = false;
		
 /*     while (!valid) {

            inputStr  = JOptionPane.showInputDialog(null, "Please enter your age:");

            try {
                age = Integer.parseInt(inputStr);
                JOptionPane.showMessageDialog(null,"Your age is " + age);
                valid = true;
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n"
                                            + "Please enter digits only");
            } // end catch
        } // end valid            */
		
		do {
			inputStr  = JOptionPane.showInputDialog(null, "Please enter your age:");

            try {
                age = Integer.parseInt(inputStr);
                JOptionPane.showMessageDialog(null,"Your age is " + age);
                valid = true;
            } 
            catch (NumberFormatException e) 
            {
                JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n"
                                            + "Please enter digits only");
            } // end catch
		}while(!valid);
    }

}
/*
*Q1 d. If you put text in it will loop until you enter digits
*
*/