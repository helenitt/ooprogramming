//Set1Ex6bApplicationMethodCubed.java
/*This program will use a method to calculate the volume of a cube
 *and will output a message about whether you can take it on as 
 *carry on luggage*/

import javax.swing.*;

public class Set1Ex6bApplicationMethodCubed {
	public static void main(String[] args) {
		
		double length, cube;
		
		length = Double.parseDouble(JOptionPane.showInputDialog("Please enter the length of the cube: "));	
		
		cube = Set1Ex6bMyMethodsCube.cube(length);
		
		if(cube>100) {
			JOptionPane.showMessageDialog(null,"You can't take this on board, put it in your check-in luggage");		
		}
		else {
			JOptionPane.showMessageDialog(null,"Have a good flight");		
		}
		
		System.exit(0);
	}
}