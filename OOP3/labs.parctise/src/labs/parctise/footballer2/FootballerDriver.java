package labs.parctise.footballer2;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class FootballerDriver {
	public static void main(String[] args) {
		HashSet<Footballer> team = new HashSet<Footballer>();
		Footballer footballer;
		String name;
		int age;
		
		while(JOptionPane.showConfirmDialog(null, "Enter Player?") == JOptionPane.YES_OPTION) {
			name = JOptionPane.showInputDialog(null, "Name: ");
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Age: "));
			footballer = new Footballer(name, age);
			team.add(footballer);
		}
		
		
	}
}
