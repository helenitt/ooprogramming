import java.util.Set;
import java.util.TreeSet;

import javax.swing.JOptionPane;
	
public class VehicleApp2 {

	public static void main(String[] args) {
		
		//example of using a lambda expression, new in java 8
		//lambda expression is a java mechanism for functional programming
		//Lambda expressions let you express instances of single-method classes more compactly.
		//syntax (paramter(s))-> statement(s)
		
		//Set<Vehicle> fleet = new TreeSet<Vehicle>(
		//	(Vehicle v1,Vehicle v2)-> {return v1.toString().compareTo(v2.toString());});
		
		//or
		
		Set<Vehicle> fleet = new TreeSet<Vehicle>(
			(Vehicle v1,Vehicle v2)-> v1.toString().compareTo(v2.toString()));
		
			
			
		while (JOptionPane.showConfirmDialog(null,"Make a Vehicle ?")==JOptionPane.YES_OPTION){
		
		String answer=JOptionPane.showInputDialog("Bus(B)orLorry(L)");
			if (answer.charAt(0)=='B'){
				Bus bus=makeBus();
				fleet.add(bus);
			}
			else if (answer.charAt(0)=='L'){
				Lorry lorry= makeLorry();		
				fleet.add(lorry);
			}
		}//end make computers
		
		String message="";
		for (Vehicle v:fleet){
			message+=v.toString();
		}
		JOptionPane.showMessageDialog(null,message);
		

	}

	private static Lorry makeLorry() {
		String makeModel,name;
		int num;
		makeModel=JOptionPane.showInputDialog("Enter Make of Bus");
		name=JOptionPane.showInputDialog("Enter Driver of Bus");
		num=Integer.parseInt(JOptionPane.showInputDialog("Enter Driver Number"));
		Lorry lorry=new Lorry(makeModel,name,num);
		return lorry;
	}

	private static Bus makeBus() {
		String makeModel,name;
		int num,numPassengers;
		makeModel=JOptionPane.showInputDialog("Enter Make of Bus");
		name=JOptionPane.showInputDialog("Enter Driver of Bus");
		num=Integer.parseInt(JOptionPane.showInputDialog("Enter Driver Number"));
		numPassengers=Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Passengers"));
		Bus bus=new Bus(makeModel,name,num, numPassengers);
		
		return bus;
	}

}
