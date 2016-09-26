import javax.swing.*;
/** example of catching a NumberFormatException without the option to re-enter
 *@author Wu */
public class AgeInput2 {
  public static void main (String args[]){
        String inputStr
                 = JOptionPane.showInputDialog(null, "Enter age ");
        int age ;
        try {

	       age = Integer.parseInt(inputStr);
			System.out.println("age " + age);
        } 
        catch (NumberFormatException e){
	      JOptionPane.showMessageDialog(null, "’" + inputStr 
		        +  "‘ is invalid\n" 
		        +  "Please enter digits only");
		// e.printStackTrace();
		  
        }
        finally {
        	JOptionPane.showMessageDialog(null,"Finall always executes");
        }
        
        System.out.println("Program hasnt crashed");
        
    }

}