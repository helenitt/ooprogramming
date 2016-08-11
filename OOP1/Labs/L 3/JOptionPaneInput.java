//JOptionPaneInput.java
/*This program will read in some user-supplied values using a GUI 
 *window component*/
 
 import javax.swing.JOptionPane;
 
 public class JOptionPaneInput {
 	public static void main(String args[])
	 	{
	 		String name, address, ageAsString, heightAsString;
	 		int age;
	 		float height;
	 		
	 		name = JOptionPane.showInputDialog("Please enter your name: ");
	 		address = JOptionPane.showInputDialog("Please enter your address: ");
	 		ageAsString = JOptionPane.showInputDialog("Please enter your age: ");
	 		heightAsString = JOptionPane.showInputDialog("Please enter your height: ");
	 		
	 		age = Integer.parseInt(ageAsString);
	 		height = Float.parseFloat(heightAsString);
	 		
	 		JOptionPane.showMessageDialog(null,"Name: " + name + "\nAddreas: " +
	 		address + "\nAge: " + age + "\nHeight: " + height + "m","Results", 
	 		JOptionPane.PLAIN_MESSAGE);
	 		
	 		System.exit(0);		
	 	}
 }