//L4Ex3DigitTest.java
/*This program will determine whether the character entered by the user was a digit*/

import javax.swing.JOptionPane;

public class L4Ex3DigitTest {
	public static void main(String args[])
		{
			String character;
			char digit;
			
			character = JOptionPane.showInputDialog("Please enter any character");
			digit = character.charAt(0);				
			if(Character.isDigit(digit))
				{
					JOptionPane.showMessageDialog(null,"You entered a digit","Digit Test",JOptionPane.PLAIN_MESSAGE);
				}
			else
				JOptionPane.showMessageDialog(null,"You did not enter a digit","Digit Test",JOptionPane.PLAIN_MESSAGE);
			
			System.exit(0);
		}
}