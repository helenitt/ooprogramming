package labs.set4Add.q2;

import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;
import java.util.Iterator;

public class AppComp {
	public static void main(String[] args) {

		Set<Computer> computers = new TreeSet<Computer>();
		
		while(JOptionPane.showConfirmDialog(null,"Add Computer?: ") == JOptionPane.YES_OPTION) {
			String answer = JOptionPane.showInputDialog("Computer(c) or Laptop(l): ");
			
			if (answer.charAt(0) == 'c') {
				Computer computer = makeComputer();
				computers.add(computer);
			}
			else if (answer.charAt(0) == 'l') {
				Laptop laptop = makeLaptop();
				computers.add(laptop);
			}
		}
		
		String message = "Computers:-\n\n";
		
		for(Computer c:computers) {
			message += c.toString();
		}
		JOptionPane.showMessageDialog(null, message);
		
		//Sort all computers over 2GB memory
		computersgreater2(computers);
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
		boolean touchScreen;
		
		id = JOptionPane.showInputDialog("Laptop Id: ");
		make = JOptionPane.showInputDialog("Laptop Make: ");
		type = JOptionPane.showInputDialog("Memory Type: ");
		size = Integer.parseInt(JOptionPane.showInputDialog("Memory Size: "));
		touchScreen = Boolean.parseBoolean(JOptionPane.showInputDialog("Touchscreen true/false: "));
		
		Laptop laptop = new Laptop(id, make, type, size, touchScreen);
		return laptop;
	}
	public static void computersgreater2(Set<Computer> computers) {
		TreeSet<Computer> sorted2GB = new TreeSet<Computer>();
		
		for(Computer c:computers) {
			if(c.memory.getSize() > 2) {
				sorted2GB.add(c);
			}
		}
		String message = "Computers with memory over 2GB: \n";
		
		Iterator<Computer> it = sorted2GB.iterator();
		
		while(it.hasNext()) {
			message += it.next().toString(); 
		}
		JOptionPane.showMessageDialog(null, message);
	}
}
