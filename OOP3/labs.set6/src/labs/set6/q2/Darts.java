package labs.set6.q2;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
import javax.swing.*;

public class Darts {
	public static void main(String[] args) {
		Set<Player> players = new HashSet<Player>();
		Player p;
		String name, message = "Players: \n\n";
		int score;
		
		//num = Integer.parseInt(JOptionPane.showInputDialog("How many Players? "));
		//Don't need num don't need to know size use while loop
		//for(int i=1; i<=num; i++) {
		
		while(JOptionPane.showConfirmDialog(null, "Enter Player?") == JOptionPane.YES_OPTION) {
			name = JOptionPane.showInputDialog("Players Name: ");
			score = Integer.parseInt(JOptionPane.showInputDialog("Players Score: "));
			p = new Player(name,score);
			players.add(p);
		}
		
		for(Player pl: players) {
			message += pl + "\n";  
		}
		
		JOptionPane.showMessageDialog(null, message);
		
		/* Q 10 Find and display the player with the highest score
		 * For loop
		 * 	set first player to player with maxScore
		 * 	compare scores
		 * 		if score greater than maxScore 
		 * 			save player/name
		 * 	Display player with max score 
		*/
		
		Player highScPlayer = null;
		int highScore = 0;
		Player player;
		
		Iterator<Player> pit = players.iterator();
				
		while (pit.hasNext()) {
			//System.out.println(pit.next().toString()); TO PRINT OFF ALL THE PLAYERS
			
			player = pit.next();
			
			if(player.getScore()>highScore) {
				highScPlayer = player;
				highScore = player.getScore();
			}			
		}
		
		JOptionPane.showMessageDialog(null,"Player with highest score is: " + highScPlayer.toString());
		
		// Q11 LINEAR SEARCH TO FIND A PLAYER 
		String searchName = JOptionPane.showInputDialog("Enter the name you wish to find: ");
		Player hold;
		Player searchedPlayer = null;
		boolean found = false;

		Iterator<Player> nit = players.iterator();
			
		while(nit.hasNext()) {
			hold = nit.next();
			if (hold.getName().equalsIgnoreCase(searchName)) {
				searchedPlayer = hold;
				found = true;
			}
		}

		if(found)
			JOptionPane.showMessageDialog(null,"Search Result: " + searchedPlayer.toString());

		else
			JOptionPane.showMessageDialog(null,"Player not found");
		
		
	}
}
