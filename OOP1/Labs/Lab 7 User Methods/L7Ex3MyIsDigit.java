//L7Ex3MyIsDigit.java
/*This program will call the method myIsDigit() and, like isDigit() 
 *it should return a boolean value of true or false depending on 
 *the outcome of the test*/
 
 import javax.swing.JOptionPane;
 
 public class L7Ex3MyIsDigit {
 	public static void main(String args[])
	 	{
	 		String charAsString;
	 		char ch;
	 		
	 		charAsString = JOptionPane.showInputDialog("Please enter a keyboard character");
	 		ch = charAsString.charAt(0);
	 			 		
	 		if(myIsDigit(ch))
	 			JOptionPane.showMessageDialog(null,"You entered a digit","Digit Test",JOptionPane.PLAIN_MESSAGE);
	 		else
	 			JOptionPane.showMessageDialog(null,"You did not enter a digit","Digit Test",JOptionPane.PLAIN_MESSAGE);	
	 		
	 		System.exit(0);
	 	}
	 public static boolean myIsDigit(char c)
		 {
		 	boolean result = false;
		 	
		 	if(c>='0' && c<='9')
		 		result = true;
		 		
		 	return result;
		 } 
 }