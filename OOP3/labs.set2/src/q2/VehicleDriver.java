package q2;

import javax.swing.*;

/* PSEUDOCODE
 *  Declare and create an array of vehicles
 *  Declare a car object
 *  Declare a tank object
 *  Using a for loop
 *  	Prompt user for vehicle type
 *  	Using an if else statement
 *  		Create appropriate object
 *  		Prompt user for vehicle details
 *  	Add object to array
 *  End for loop
 *  Using for loop
 *  	Output details
 *  	use getClass() to determine class
 *  End for loop
 *  End class
 */

public class VehicleDriver {
	public static void main(String[] args) {
		String model, regNum, type, arm, message = "Fleet Details:-\n\n";
		double price, length, weight;
		int maxPassenger;
		boolean armoured = false;
		Vehicle[] fleet = new Vehicle[3];
		Car car;
		Tank tank;
		
		for(int i=0;i<fleet.length;i++) {  
			type = JOptionPane.showInputDialog("Vehicle Type c or t: ");
			model = JOptionPane.showInputDialog("Model");
			price = Double.parseDouble(JOptionPane.showInputDialog("Price: "));
			length = Double.parseDouble(JOptionPane.showInputDialog("Length: "));
			weight = Double.parseDouble(JOptionPane.showInputDialog("Weight: "));
			
			if(type.equals("c")) {
				regNum = JOptionPane.showInputDialog("Registration: ");
				maxPassenger = Integer.parseInt(JOptionPane.showInputDialog("Max Passengers: "));
				
				car = new Car(model, price, length, weight, regNum, maxPassenger);
				fleet[i] = car;
			}
			else if (type.equals("t")) {
				arm = JOptionPane.showInputDialog("Armoured? y/n: ");

				armoured = (arm.equals("y")) ? true : false;
				
			/*	if(arm.equals("y"))
					armoured = true;  */
					
				tank = new Tank(model, price, length, weight, armoured);
				fleet[i] = tank;
			}
			else {
				JOptionPane.showMessageDialog(null, "Vehicle Type not recognised");
			}  
			
			
		}
		
		for(Vehicle f: fleet) {
				message += f.toString() + "\n";
			}
			
			JOptionPane.showMessageDialog(null, message);
	}

}
