//Set1Ex5MethodsMaths.java
/*This program will prompt for two values and then find the roots of the values of x 
 *which make the left hand side of the equation equal to zero. 
 *Methods from the Math class*/

import javax.swing.*;

public class Set1Ex5MethodsMaths {
	public static void main(String[] args) {
		
		double a, b, x, x1, x2;
		final double C = -16;
		
		a = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of a"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of b"));
				
		x1 = (-b + Math.sqrt((b*b)-(4*a*C)))/2*a;
		x2 = (-b - Math.sqrt((b*b)-(4*a*C)))/2*a;
			
		JOptionPane.showMessageDialog(null,String.format("The roots of the equation are: %.3f and %.3f", x1, x2)); 
			
		System.exit(0);
	}
}