package labs.ca1;

/* The driver class which will create a set of footballers and the 
 * filter and sort them in various ways*/

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Driver {
	public static void main(String[] args) {
		Footballer footballer;
		HashSet<Footballer> team = new HashSet<Footballer>();
		String name, message = "Your Players:- \n";
		int age;
		
		while(JOptionPane.showConfirmDialog(null, "Add Player?") == JOptionPane.YES_OPTION) {
			name = JOptionPane.showInputDialog("Players Name: ");
			age = Integer.parseInt(JOptionPane.showInputDialog("Players Age: "));
			footballer = new Footballer(name, age); 
			team.add(footballer);
		}
		
		Iterator<Footballer> it = team.iterator();
		while(it.hasNext()) {
			message += it.next().toString() + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, message);
		
		over30(team);
	
		String option = JOptionPane.showInputDialog("Sort by name or age? n or a");
		if(option.equals("n")) {
			TreeSet<Footballer> byName = new TreeSet<Footballer>(new CompareByName());
			byName.addAll(team);
			JOptionPane.showMessageDialog(null, byName);
		}			
		else if(option.equals("a")) {
			TreeSet<Footballer> byAge = new TreeSet<Footballer>(new CompareByAge());
			byAge.addAll(team);
			JOptionPane.showMessageDialog(null, byAge);
		}				
		else
			JOptionPane.showMessageDialog(null, "Erronious Input, Goodbye!");

	}
	private static void over30(HashSet<Footballer> team) {
		String message = "Team:-\n\n";
		for(Footballer f: team) {
			if(f.getAge() > 30) {
				message += f.toString() + "\n\n";
			}
		}
		
		JOptionPane.showMessageDialog(null, message);	
	}
}
