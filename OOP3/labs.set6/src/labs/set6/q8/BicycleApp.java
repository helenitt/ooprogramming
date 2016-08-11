package labs.set6.q8;

//BicycleApp.java
/**/

import javax.swing.JOptionPane;
import java.util.*;

public class BicycleApp {
	public static void main(String[] args) {
		String choice;
		Set<Bicycle> bikes = new HashSet<Bicycle>();
		
		Bicycle bike1 = new Bicycle("Helen", "Raleigh", 20);
		Bicycle bike2 = new Bicycle("Sean", "Corberra", 300);
		bikes.add(bike1);
		bikes.add(bike2);
		
		while(JOptionPane.showConfirmDialog(null, "Choose sort method?") == JOptionPane.YES_OPTION) {
			choice = JOptionPane.showInputDialog("Display by name, make or value: n, m or v ");
			if(choice.equals("n")) {
				Set<Bicycle> byName = new TreeSet<Bicycle>(new CompareOwnerNames());
				byName.addAll(bikes);
				JOptionPane.showConfirmDialog(null, "Compared by Name: \n" + byName);
			}
			else if(choice.equals("m")) {
				Set<Bicycle> byMake = new TreeSet<Bicycle>(new CompareMake());
				byMake.addAll(bikes);
				JOptionPane.showConfirmDialog(null, "Compared by Name: \n" + byMake);
			}
			else if(choice.equals("v")) {
				Set<Bicycle> byValue = new TreeSet<Bicycle>(new CompareValue());
				byValue.addAll(bikes);
				JOptionPane.showConfirmDialog(null, "Compared by Name: \n" + byValue);
			}
			else
				JOptionPane.showConfirmDialog(null, "Invalid Input!");
		}
	}
}