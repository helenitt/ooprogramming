//BicycleApp.java
/**/

import javax.swing.JOptionPane;

public class BicycleApp {
	public static void main(String[] args) {
		String owner, make;
		double value;
		
		owner = JOptionPane.showInputDialog("Owners Name: ");
		value = Double.parseDouble(JOptionPane.showInputDialog("Bicycle Value: "));
		make = JOptionPane.showInputDialog("Bicycle Make: ");
		
		Bicycle bike1 = new Bicycle(owner, value, make);
		Bicycle bike2 = new Bicycle();
		
		JOptionPane.showMessageDialog(null,"Bike Number 1: \n\n" + bike1.toString() + 
						              "\n\nNumber 2: \n\n" + bike2.toString());
		
		//User entered values for each attribute of bike2 and sets them accordingly
		owner = JOptionPane.showInputDialog("Bike 2:\n\nOwners Name: ");
		value = Double.parseDouble(JOptionPane.showInputDialog("Bicycle Value: "));
		make = JOptionPane.showInputDialog("Bicycle Make: ");
		//Can't use the same variables cocks up later calculations!
		//conpartmentalizing this stuff needs to be improved
		// use clear() slide 16 Objects and Classes
		
		bike2.addItems(owner, value, make);
		
		JOptionPane.showMessageDialog(null,"Bike Number 1: \n\n" + bike1.toString() + 
						              "\n\nNumber 2: \n\n" + bike2.toString());
		
		//Increase Bike 1 value
		bike1.setIncreasedValue(value);
		bike1.getBValue();
		
		JOptionPane.showMessageDialog(null,"Bike Number 1 with VAT: \n\n" + bike1.toString());
		
		//Outputs the owner names and values of the 2 Bicycles using the accessor methods
		JOptionPane.showMessageDialog(null,"Bike Owners: " + bike1.getBOwnerName() + ", " + 
								      bike2.getBOwnerName() + "\nThe value of bikes: " +
								      bike1.getBValue() + ", " + bike2.getBValue());
		
		//Calculates and displays the total value of the 2 Bicycles
		double total = bike1.getBValue() + bike2.getBValue();
		
		JOptionPane.showMessageDialog(null,"Total Bike Value: " + total);

	
		System.exit(0);
	}
}