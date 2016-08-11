package q2;

import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class SysTest2 {
	public static void main(String[] args) {
		String name, finished = "n";
		int score;
		double balance;		
		Player p;
		BankAccount bankAccount;
		boolean online;
		
		LinkedList<Player> myPlayers = new LinkedList<Player>();
		
		while(!finished.equals("y")) {		
			name = JOptionPane.showInputDialog("Name: ");
			score = Integer.parseInt(JOptionPane.showInputDialog("Score: "));
			balance = Float.parseFloat(JOptionPane.showInputDialog("Starting Balance: "));			
			bankAccount = new BankAccount(balance);
			
			online = Boolean.parseBoolean(JOptionPane.showInputDialog("Is player online? true/false: "));

			p = new Player(name, score, bankAccount, online);
			myPlayers.add(p);
			finished = JOptionPane.showInputDialog("Finished? y/n: ");
		}
		
		JTextArea jta = new JTextArea("List of Players\n");
		
		for(Player pep : myPlayers) {
			jta.append(pep.toString());
		}
		
		JOptionPane.showMessageDialog(null, jta);

	}

}
