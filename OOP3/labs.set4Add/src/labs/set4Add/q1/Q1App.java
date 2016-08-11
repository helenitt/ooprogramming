package labs.set4Add.q1;

import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class Q1App {
	public static void main(String[] args) {

		Set<Q1Vehicle> fleet = new TreeSet<Q1Vehicle> (new VehicleComparator()); 
		
		while(JOptionPane.showConfirmDialog(null, "Add Vehicle?") == JOptionPane.YES_OPTION) {
			String answer = JOptionPane.showInputDialog("Bus(b) or Lorry(l): ");
			
			if(answer.charAt(0) == 'b') {
				Q1Bus bus = makeBus();
				fleet.add(bus);
			}
			else if(answer.charAt(0) == 'l') {
				Q1Lorry lorry = makeLorry();
				fleet.add(lorry);
			}
		}
		
		String message = "";
		
		for (Q1Vehicle v:fleet) {
			message += v.toString();
		}
		JOptionPane.showMessageDialog(null,message);
	}
	
	public static Q1Bus makeBus() {
		String makeModel, name;
		int num, maxPassengers;
		
		makeModel = JOptionPane.showInputDialog("Make of Bus: ");
		name = JOptionPane.showInputDialog("Driver Name: ");
		num = Integer.parseInt(JOptionPane.showInputDialog("Driver Number: "));
		maxPassengers = Integer.parseInt(JOptionPane.showInputDialog("Max Passengers: "));
		
		Q1Bus bus = new Q1Bus(makeModel, num, name, maxPassengers);
		
		return bus;
	}
	
	public static Q1Lorry makeLorry() {
		String makeModel, name;
		int num;
		
		makeModel = JOptionPane.showInputDialog("Make of Lorry: ");
		name = JOptionPane.showInputDialog("Drivers Name: ");
		num = Integer.parseInt(JOptionPane.showInputDialog("Driver Number: "));
		
		Q1Lorry lorry = new Q1Lorry(makeModel, name, num);
		return lorry;
	}
}
