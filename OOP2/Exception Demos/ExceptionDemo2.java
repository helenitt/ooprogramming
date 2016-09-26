import javax.swing.*;
public class ExceptionDemo2{
	public static void main (String args[]) {
		String inputStr;
        int    age;
                
		inputStr = JOptionPane.showInputDialog(null, "Age:");

         try {

	         age = Integer.parseInt(inputStr);
            
			 JOptionPane.showMessageDialog(null,"Next year you will be " + (age + 1));
         } 
        catch (NumberFormatException e){
     
	       JOptionPane.showMessageDialog(null, "’" + inputStr 
		   +  "‘ is invalid\n" 
		   +  "Please enter digits only");
		    e.printStackTrace();
         }
        

	}
}