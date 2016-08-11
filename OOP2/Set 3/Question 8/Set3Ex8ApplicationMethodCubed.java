//Set3Ex8ApplicationMethodCubed.java
/*This program will use a method to calculate the volume of a cube
 *and will output a message aboout whether you can take it on as 
 *carry on luggage*/
 
 //Experimenting with the static reference!
 
 /*Question 8
  *(i)	error: non-static method cube(double) cannot be referenced from a static context
  *		Static and none-static methods are not compatible
  *  
  *(ii)	error: non-static method cube(double) cannot be referenced from a static context
  *		The main method is still static even when the word static is not in the 
  *		method header!*/

import javax.swing.*;

public class Set3Ex8ApplicationMethodCubed {
	public static void main(String[] args) {
		
		double length, cube;
		
		length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the cube: "));	
		
		cube = Set3Ex8MethodCubed.cube(length);
		
		if(cube>100) {
			JOptionPane.showMessageDialog(null,"You can't take this on board, put it in your carry-on luggage");		
		}
		else {
			JOptionPane.showMessageDialog(null,"Have a good flight");		
		}
		
		System.exit(0);
	}
}