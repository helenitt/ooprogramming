package labs.set5.q10q11;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class LinearSearch {
	public static void main(String[] args) {
		Set<Player> players = new HashSet<Player>();
		Player p;
		String name, message = "Players: \n\n";
		int score;
		
		//num = Integer.parseInt(JOptionPane.showInputDialog("How many Players? "));
		//Don't need num don't need to know size use while loop
		//for(int i=1; i<=num; i++) {
		
		while(JOptionPane.showConfirmDialog(null, "Another Player?") == JOptionPane.YES_OPTION) {
			name = JOptionPane.showInputDialog("Players Name: ");
			score = Integer.parseInt(JOptionPane.showInputDialog("Players Score: "));
			p = new Player(name,score);
			players.add(p);
		}
		
		for(Player pl: players) {
			message += pl + "\n";  
		}
		
		JOptionPane.showMessageDialog(null, message);
		
		//Linear Search
		String searchName = JOptionPane.showInputDialog("Enter Name: ");
		Player hold;
		Player searchedPlayer = null;
		boolean found = false;
		
		Iterator<Player> it = players.iterator();
		while(it.hasNext()) {
			hold = it.next();
			if(hold.getName().equalsIgnoreCase(searchName)) {
				searchedPlayer = hold;
				found = true;
			}
		}
		
		//Print Result
		if(found)
			JOptionPane.showMessageDialog(null, "Result: " + searchedPlayer.toString());
		else
			JOptionPane.showMessageDialog(null, "Result: Player not found!");
	}
}
