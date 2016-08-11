package q1;
/* The driver for this system*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Person("Tom",21,'m');
		Player pl = new Player("Sparky",100);
		BankAccount bacc = new BankAccount("123",500.00);
		
		JTextArea jta = new JTextArea("Player Details\n\n");
		jta.append("Person: " + p.toString());
		jta.append("\nPlayer: " + pl.toString());
		jta.append("\nBank Account: " + bacc.toString() + "\n");
		
		JOptionPane.showMessageDialog(null, jta);

	}

}
