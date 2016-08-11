package labs.parctise.footballer;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class FootballerDriver {
	public static void main(String[] args) {
		Footballer footballer;
		HashSet<Footballer> team = new HashSet<Footballer>();
		String name;
		int age;
		
		while(JOptionPane.showConfirmDialog(null, "Enter Player?") == JOptionPane.YES_OPTION) {
			name = JOptionPane.showInputDialog("Name: ");
			age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
			footballer = new Footballer(name, age);
			team.add(footballer);
		} 
		
		String message = "Team:- \n";
		
		Iterator<Footballer> it = team.iterator();
		while(it.hasNext()) {
			message += it.next().toString() + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, message);
		
		over30(team);
		
		TreeSet<Footballer> byName = new TreeSet<Footballer>(new ComparebyName());
		byName.addAll(team);
		JOptionPane.showMessageDialog(null, byName);
		
		TreeSet<Footballer> byAge = new TreeSet<Footballer>(new CompareByAge());
		byAge.addAll(team);
		JOptionPane.showMessageDialog(null, byAge);
	}
	
	private static void over30(HashSet<Footballer> team) {
		String message = "Team Members over 30:- \n\n";
		
		for(Footballer f: team) {		
			if(f.getAge() > 30) {				
				message += f.toString() + "\n\n";
			}
		JOptionPane.showMessageDialog(null, message);		
		
		}
	}
}

