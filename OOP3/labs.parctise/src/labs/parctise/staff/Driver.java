package labs.parctise.staff;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Driver {
	public static void main(String[] args) {
		Employee emp;
		HashSet<Employee> staff = new HashSet<Employee>();;
		String name, type;
		double salary, rate;
		int hours;
		
		while(JOptionPane.showConfirmDialog(null, "Enter Employee?") == JOptionPane.YES_OPTION) {
			name = JOptionPane.showInputDialog("Name: ");
			type = JOptionPane.showInputDialog("Manager or Sales: m/s ");
			if(type.equals("m")) {
				salary = Double.parseDouble(JOptionPane.showInputDialog("Salary: "));
				emp = new Manager(name, salary);
				staff.add(emp);
			}
			else if(type.equals("s")) {
				rate = Double.parseDouble(JOptionPane.showInputDialog("Rate: "));
				hours = Integer.parseInt(JOptionPane.showInputDialog("Hours: "));
				emp = new SalesPerson(name, hours, rate);
				staff.add(emp);
			}
			else {
				JOptionPane.showMessageDialog(null, "Invalid Input!");
			}
		}
		
		String mess = "Employees: \n\n";
		
		for(Employee e: staff) {
			mess += e.toString() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, mess);
		
		Iterator<Employee> it = staff.iterator();
		//String message = "Over 500: \n\n";
		while(it.hasNext()) {
			emp = it.next();
			//if(emp.getEarnings() > 500.00)     getEarnings() NOT AVILABLE IN EMPLOYEE
		}
	}

}
