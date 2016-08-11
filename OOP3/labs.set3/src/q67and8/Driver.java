package q67and8;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		String fin="n", type="", firstName, lastName;
		double salary, hours, rate;
		
		Scanner input = new Scanner(System.in);
		
		Manager man;
		HourlyWorker hw;
		
		List<Employee> staff = new ArrayList<Employee>();
		
		while(fin.equals("n")) {
			System.out.print("Is this a Manager: y/n ");
			type = input.nextLine();
			System.out.print("First Name: ");
			firstName = input.nextLine();
			System.out.print("Last Name: ");
			lastName = input.nextLine();
			
			if(type.equals("y")) {
				System.out.print("Salary: ");
				salary = input.nextDouble();
				input.nextLine();
								
				man = new Manager(firstName, lastName, salary);
				staff.add(man);
				
				System.out.print("Finished? y/n: ");
				fin = input.nextLine();
			}
			else {
				System.out.print("Hours: ");
				hours= input.nextDouble();
				System.out.print("Hourly Rate: ");
				rate = input.nextDouble();
				input.nextLine();
				
				hw = new HourlyWorker(firstName, lastName, hours, rate);
				staff.add(hw);
				
				System.out.print("Finished? y/n: ");
				fin = input.nextLine();
			}			
		}
		
		for(Employee e: staff) {
				System.out.println("\n\n" + e.toString() + " - €" + e.earnings());
		}
		
		input.close();
	}
}
