package q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class SysTest3 implements Serializable  {
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
			
			online = Boolean.parseBoolean(JOptionPane.showInputDialog("Is player online? y/n: "));

			p = new Player(name, score, bankAccount, online);
			myPlayers.add(p);
			
			finished = JOptionPane.showInputDialog("Finished? y/n: ");
		}
		
		save(myPlayers);
		
		read(myPlayers);
		
		JTextArea jta = new JTextArea("List of Players\n\n");
		
		for(Player pep : myPlayers) {
			jta.append(pep.toString());
		}
		
		JOptionPane.showMessageDialog(null, jta);
 
	}

	public static void save(LinkedList<Player> myPlayers) {
		try {
			File f = new File("Players.dat");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(myPlayers);
			oos.close();
		} 
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "save: i/o exception");
			e.printStackTrace();
		}
	} 
	
	@SuppressWarnings("unchecked")
	public static void read(LinkedList<Player> myPlayers) {
		try {
			File f = new File("Players.dat");
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			myPlayers = (LinkedList<Player>)ois.readObject();
			ois.close();
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "read: I/O Exception");
			e.printStackTrace();
		}
		
	}  
}
