
package labs.parctise.computer;

import java.util.*;
import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) {
		Set<Computer> computers = new TreeSet<Computer>();
		
		while(JOptionPane.showConfirmDialog(null, "Add Computer? ") == JOptionPane.YES_OPTION) {
			String typeComp = JOptionPane.showInputDialog("Computer or Laptop (c or l): ");
			
			if(typeComp.charAt(0) == 'c') {
				Computer computer = makeComputer();
				computers.add(computer);
			}
			else if(typeComp.charAt(0) == 'l') {
				Laptop laptop = makeLaptop();
				computers.add(laptop);
			}
		}
		String message = "Computers:-\n\n";
		
		for(Computer c: computers) {
			message += c.toString();
		}
		
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static Computer makeComputer() {
		String id, make, type;
		int size;
		
		id = JOptionPane.showInputDialog("Computer Id: ");
		make = JOptionPane.showInputDialog("Computer Make: ");
		type = JOptionPane.showInputDialog("Memory Type: ");
		size = Integer.parseInt(JOptionPane.showInputDialog("Memory Size: "));
		
		Computer computer = new Computer(id, make, type, size);
		return computer;
	}
	
	public static Laptop makeLaptop() {
		String id, make, type;
		int size;
		boolean lTop = true;
		
		id = JOptionPane.showInputDialog("Computer Id: ");
		make = JOptionPane.showInputDialog("Computer Make: ");
		type = JOptionPane.showInputDialog("Memory Type: ");
		size = Integer.parseInt(JOptionPane.showInputDialog("Memory Size: "));
		
		Laptop laptop = new Laptop(id, make, type, size, lTop);
		return laptop;
	}
}
