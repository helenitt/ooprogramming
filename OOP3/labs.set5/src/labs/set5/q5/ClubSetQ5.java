package labs.set5.q5;

import java.util.TreeSet;
import javax.swing.JOptionPane;

/*This program lets you enter the names of the ITT clubs you might 
 * like to join, displays them in a clickable list within a message 
 * dialog so that you can click one to remove, then displays the clubs 
 * that are left when you have removed one
 */

public class ClubSetQ5 {
	
	public static void main(String[] args) {
		TreeSet<String> clubs = new TreeSet<>();
		String clubName;
		
		while(JOptionPane.showConfirmDialog(null, "Add Club? ") == JOptionPane.YES_OPTION) {
			clubName = JOptionPane.showInputDialog("Club Name: ");
			clubs.add(clubName);
		}
		
		JOptionPane.showMessageDialog(null, "Clubs: " + clubs);
	}
}
