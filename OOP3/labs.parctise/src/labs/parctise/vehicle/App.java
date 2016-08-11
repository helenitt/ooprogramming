package labs.parctise.vehicle;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class App {
	static String makeModel, name;
	static int num, maxPassengers;
	static double tax;
	
	public static void main(String[] args) {
		Set<Vehicle> fleet = new HashSet<Vehicle>();
		
		while(JOptionPane.showConfirmDialog(null, "Enter Vehcicle?") == JOptionPane.YES_OPTION) {
			String type = JOptionPane.showInputDialog("Bus or Lorry: (b or l)");
			
			if(type.charAt(0) == 'b') {
				Bus bus = makeBus();
				fleet.add(bus);
			}
			else if(type.charAt(0) == 'l') {
				Lorry lorry = makeLorry();
				fleet.add(lorry);
			}
		}
		
		String message = "Vehicles:- \n\n";
		
		for(Vehicle v: fleet) {
			
			
			message += v.toString();
		}
		
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static Bus makeBus() {
		makeModel = JOptionPane.showInputDialog("Make of Bus: ");
		name = JOptionPane.showInputDialog("Drivers Name: ");
		num = Integer.parseInt(JOptionPane.showInputDialog("Drivers Number: "));
		maxPassengers = Integer.parseInt(JOptionPane.showInputDialog("Max Passengers: "));
		tax = Double.parseDouble(JOptionPane.showInputDialog("Tax: "));
		
		Bus bus = new Bus(makeModel, num, name, maxPassengers, tax);
		return bus;
	}
	public static Lorry makeLorry() {
		makeModel = JOptionPane.showInputDialog("Make of Lorry: ");
		name = JOptionPane.showInputDialog("Drivers Name: ");
		num = Integer.parseInt(JOptionPane.showInputDialog("Drivers Number: "));
		tax = Double.parseDouble(JOptionPane.showInputDialog("Tax: "));
		
		Lorry lorry = new Lorry(makeModel, num, name, tax);
		return lorry;
	}
}
