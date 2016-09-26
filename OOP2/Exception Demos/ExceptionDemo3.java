import javax.swing.*;
public class ExceptionDemo3{
	public static void main (String args[]) {
		String inputStr;
        int    age;
        boolean valid=false;
       do{
       
       try {
	         age = getAge();
			 JOptionPane.showMessageDialog(null,"Next year you will be " + (age + 1));
         	valid=true;
         } // end try
        catch (NumberFormatException e){
	    	JOptionPane.showMessageDialog(null, "The age you entered "
			+  "‘ is invalid\n" 
			+  "Please enter digits only");
        } // end catch
        
       } while(!valid);
        
	}// end main
//	public static int getAge() throws NumberFormatException {
	public static int getAge() {

		String inputStr = JOptionPane.showInputDialog("Age:");
	    int age = Integer.parseInt(inputStr);
	    return age;
	}
}