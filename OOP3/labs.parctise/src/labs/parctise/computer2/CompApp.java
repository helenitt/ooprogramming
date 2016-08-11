package labs.parctise.computer2;

import java.util.*;

import javax.swing.JOptionPane;

import labs.parctise.computer.Computer;
import labs.parctise.computer.Laptop;

public class CompApp {
	public static void main(String[] args) {
		Set<Computer> computers = new TreeSet<Computer>();
		
		while(JOptionPane.showConfirmDialog(null, "Add Computer? ") == JOptionPane.YES_OPTION) {
			if(JOptionPane.showConfirmDialog(null, "Is the computer a Laptop? ") == JOptionPane.YES_OPTION) {
				Laptop laptop = makeLaptop();
				computers.add(laptop);
			}
			else {
				Computer computer = makeComputer();
				computers.add(computer);
			}
		}
		
		String message = "Computer Collection:\n";		
		for(Computer c: computers) {
			message += c.toString();
		}
		JOptionPane.showMessageDialog(null, message);
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
}
