package q4;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class GameApp extends JFrame {
	JButton goodButton, badButton;
	JTextArea jta;
	String message = "\n Player Details:- \n\n";
	GoodGuy gG = new GoodGuy("SuperGoo", 5, 5, true);
	BadGuy  bG = new BadGuy("DooDoo", 4, 4, true);
	
	public static void main(String[] args) {
				
		GameApp window = new GameApp();
		window.setVisible(true);

	}
	
	public GameApp() {
		setTitle("GoodGuy v BadGuy");
		setSize(240,350);
		setLocation(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		goodButton = new JButton("GoodGuy shoots BadGuy");
		badButton = new JButton("BadGuy shoots GoodGuy");
		pane.add(goodButton);
		pane.add(badButton);
		
		goodButton.addActionListener(new goodButtonHandler());
		badButton.addActionListener(new badButtonHandler());
		
		jta = new JTextArea();
		pane.add(jta);
		
		message += gG.toString() + "\n" + bG.toString();
		jta.append(message);
	}
	
	private class goodButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			gG.reduceAmmo();
			bG.reduceStrength();
			
			message = "\n Player Details:- \n\n";
			jta.setText("");
			message += gG.toString() + "\n" + bG.toString();
			jta.append(message);
		}
	}
	
	private class badButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			bG.reduceAmmo();
			gG.reduceStrength();
			
			message = "\n Player Details:- \n\n";
			jta.setText("");
			message += gG.toString() + "\n" + bG.toString();
			jta.append(message);
		}
	}
}
