package q1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
	
@SuppressWarnings("serial")
public class PacmanApp extends JFrame {
	JTextArea jta;
	JButton loseLifeButton, queryStatusButton;
		
	PacmanPlayer p1 = new PacmanPlayer("Jim",100);
	PacmanPlayer p2 = new PacmanPlayer("Bob",100);
	PacmanPlayer p3 = new PacmanPlayer("Tom",100);
	
	String message = "\n Player's Details:- \n\n";
	
	public static void main(String[] args) {
		
	PacmanApp win = new PacmanApp();
	win.setVisible(true);
		
	}
	
	public PacmanApp() {
		setTitle("Pacman");
		setSize(150,200);
		setLocation(200,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		loseLifeButton = new JButton("Lose a Life");
		queryStatusButton = new JButton("Query Status");
		pane.add(loseLifeButton);
		pane.add(queryStatusButton);
		
		loseLifeButton.addActionListener(new loseLifeButtonHandler());
		queryStatusButton.addActionListener(new queryStatusButtonHandler());
		
		jta = new JTextArea();
		pane.add(jta);
		jta.append(message);
	}
	
	private class loseLifeButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int lives = p1.getLives();
			if(lives>=2) {
				p1.loseALife();
			}
			else {
				p1.isDead();
			}
			message = "";
			jta.setText("");
			message += p1.toString();
			jta.append(message);
		}
	}
	
	private class queryStatusButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			message = "";
			jta.setText("");
			message += p1.toString();
			jta.append(message);
		}   
	}
}