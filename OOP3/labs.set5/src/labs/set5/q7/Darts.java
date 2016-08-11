package labs.set5.q7;

import java.util.HashSet;
import java.util.Set;
import javax.swing.*;

public class Darts {
	public static void main(String[] args) {
		Set<Player> players = new HashSet<Player>();
		Player p;
		String name, message = "Players: \n\n";
		int num, score;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("How many Players? "));
		
		for(int i=1; i<=num; i++) {
			name = JOptionPane.showInputDialog("Players Name: ");
			score = Integer.parseInt(JOptionPane.showInputDialog("Players Score: "));
			p = new Player(name,score);
			players.add(p);
		}
		
		for(Player pl: players) {
			message += pl + "\n";
		}
		
		JOptionPane.showMessageDialog(null, message);
	}
}
