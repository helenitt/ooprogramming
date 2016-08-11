package labs.set9and10.q1;

import javax.swing.*;

/** example of catching a NumberFormatException without the option to re-enter
 *@author Wu */
public class AgeInput2 {
  public static void main (String args[]){
        String inputStr = JOptionPane.showInputDialog(null, "Enter age ");
        int age;
      
        try {

	       age = Integer.parseInt(inputStr);
			System.out.println("age " + age);
        } 
        catch (ArithmeticException e){
	      JOptionPane.showMessageDialog(null, "’" + inputStr 
		        +  "‘ is invalid\n" 
		        +  "Please enter digits only");
		// e.printStackTrace();
		  
        }
        finally {
        	JOptionPane.showMessageDialog(null,"Finally always executes");
        }
        
        System.out.println("Program hasn't crashed");
        
    }
}
/*
* Q1 c. When a letter is entered instead of a digit the program goes to the catch
* 		displays the message box, the finally always exectutes and then does the 
* 		Sys.out 
*		If you use IllegalArgumentException it doesn't seem to make any difference.
*		If you use Exception it doesn't seem to make any difference.
*
*		Explain is it cos they are all related and comes under the same umbrella????	CHECK WITH JOHN!!!!!
*
*		If you use ArithmeticException it skips the catch does the finally then 
*		throws an NumberFormatException.
*
*/