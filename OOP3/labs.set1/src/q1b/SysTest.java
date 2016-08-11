package q1b;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import q1b.BankAccount;
import q1b.Player;

public class SysTest {
	public static void main(String[] args) {
		String name;
		int score, numPlayers;
		double balance;		
		Player[] players;
		Player p;
		BankAccount bankAccount;		
		
		numPlayers = Integer.parseInt(JOptionPane.showInputDialog("Number of players: "));
		
		players = new Player[numPlayers];
		
		for(int i=0;i<players.length;i++) {		
			name = JOptionPane.showInputDialog("Name: ");
			//gameName = JOptionPane.showInputDialog("Game Name: ");
			//age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
			score = Integer.parseInt(JOptionPane.showInputDialog("Score: "));
			//genderAsString = JOptionPane.showInputDialog("m/f: ");
			//gender = genderAsString.charAt(0);
			balance = Float.parseFloat(JOptionPane.showInputDialog("Starting Balance: "));
			
			bankAccount = new BankAccount(balance);
			p = new Player(name, score, bankAccount);
			players[i] = p;
		}
		
		JTextArea jta = new JTextArea("List of Players");
		
		for(Player pep : players) {
			jta.append(pep.toString());
		}
		
		JOptionPane.showMessageDialog(null, jta);

	}

}
