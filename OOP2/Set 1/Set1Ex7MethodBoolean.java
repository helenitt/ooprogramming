//Set1Ex7MethodBoolean.java
/*This program asks the user to input an arbitrary number of integer values (terminated by –1) and 
 *passes them one at a time to a user-defined method to determine if an integer is even. 
 *User-written method.*/

import javax.swing.*;

public class Set1Ex7MethodBoolean {
	public static void main(String[] args) {
		
		int number;
		boolean result;
			
		number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number (-1 to exit)"));
		
		while(number != -1) {
			result = isEven(number);
			if(result == true) {
				JOptionPane.showMessageDialog(null, number + " is even");		
			}
			else {
				JOptionPane.showMessageDialog(null, number + " is odd");	
			}
			number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number (-1 to exit)"));
		}
		System.exit(0);
	}
	public static boolean isEven(int n) {
		boolean result;
		n = n%2;
		if(n == 0) {
			result = true;
		}
		else {
			result = false;
		}
		return result;
	}
}