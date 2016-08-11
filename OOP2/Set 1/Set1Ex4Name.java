//Set1Ex4Name.java
/*This program asks the user to enter their full name, including first name, middle name if any, 
 *and surname, as one String. The program processes and then outputs the information.
 *Methods from the String class*/

import javax.swing.*;

public class Set1Ex4Name {
	public static void main(String[] args) {
		
		String name, surname;
		int num, spacePosition;
		char initial;
		
		name = JOptionPane.showInputDialog("Please ente your first and last name:-");
		
		num = name.length();
		initial = name.charAt(0);
		spacePosition = name.lastIndexOf(" ");
		surname = name.substring(spacePosition,num);
		
		JOptionPane.showMessageDialog(null,"The number of characters in your full name is: " + num +
									  "\nThe inital of your first name is: " + initial +
									  "\nYour full name capitalised is: " + name.toUpperCase() +
									  "\nYour last name is: " + surname);
		
		System.exit(0);
	}
}
/*(i) Variables - name, surname, num, spacePosition, initial
 *    Objects - 
 *(ii)showInputDialog - JOptionPane
 *    .length() - String
 *    .charAt() - String
 *    .lastIndexOf() - String
 *    .substring() - String
 *    .toUpperCase() - String*/