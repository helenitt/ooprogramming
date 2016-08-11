//JOptionPaneInput.java
/*This program reads in some user-supplied value s from
 *JOptionPane input dialog using a GUI window component
 *and displays the values of the variables to a message
 *dialog*/
 
 import javax.swing.JOptionPane;
 
 public class JOptionPaneInput {
 	public static void main(String args[])
	 	{
	 		String name, address, ageAsString, heightAsString;
	 		int age;
	 		float height;
	 		
	 		name = JOptionPane.showInputDialog("Please enter your name: ");
	 		address = JOptionPane.showInputDialog("Please enter your address: ");
	 		ageAsString = JOptionPane.showInputDialog("Please enter you age: ");
	 		heightAsString = JOptionPane.showInputDialog("Please enter your height: ");
	 		
	 		age = Integer.parseInt(ageAsString);
	 		height = Float.parseFloat(heightAsString);
	 		
	 		JOptionPane.showMessageDialog(null,"Name: " + name + "\nAddress: " +
	 		address + "\nAge: " + age + "\nHeight: " + height + "m", "Results",
	 		JOptionPane.PLAIN_MESSAGE);
	 		
	 		System.exit(0);
	 		 
	 	} 		
 }