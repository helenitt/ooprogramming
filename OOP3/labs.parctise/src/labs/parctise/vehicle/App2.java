package labs.parctise.vehicle;
/* Exam Question answer */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App2 {
	public static void main(String[] args) {
		ArrayList<Vehicle> buses = new ArrayList<Vehicle>();
		Bus bus;
		String make, name;
		int num, maxPass;
		
		while(JOptionPane.showConfirmDialog(null, "Enter Vehcicle?") == JOptionPane.YES_OPTION) {
			make = JOptionPane.showInputDialog("Make: ");
			name = JOptionPane.showInputDialog("Drivers Name: ");
			num = Integer.parseInt(JOptionPane.showInputDialog("Driver Num: "));
			maxPass = Integer.parseInt(JOptionPane.showInputDialog("Max Pass: "));
			
			bus = new Bus(make, num, name, maxPass);
			buses.add(bus);
		}
		
		String message = "Buses:- \n\n";
		
		for(Vehicle v: buses) {
			message += v.toString();
		}
		
		JOptionPane.showMessageDialog(null, message);
	}
}
