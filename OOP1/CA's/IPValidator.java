//IPValidator.java
/*IP address Validator*/

import javax.swing.JOptionPane;

public class IPValidator {
	public static void main(String args[])
		{
			String address;
			
			address = JOptionPane.showInputDialog("Please enter an octet value");
			
			validOctet(address);
			System.exit(0);
		}
	public static boolean validOctet(String a)
		{
			
		}	
}
