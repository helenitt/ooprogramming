package q1;

import javax.swing.JOptionPane;

public class PacmanPlayer extends Player {
	private int lives;
	
	public PacmanPlayer() {
		super();
		this.lives = 3;
	}
	public PacmanPlayer(String name, int score) {
		super(name,score);
		this.lives = 3;
	}
	
	public int getLives() {
		return lives;
	}
	
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public void loseALife() {
		int lives = getLives();
		lives -= 1;
		setLives(lives);
		JOptionPane.showMessageDialog(null, "Lose a life Sucker!");
	}
	
	public void isDead() {
		int lives = getLives();
		lives -= 1;
		setLives(lives);
		JOptionPane.showMessageDialog(null, "Player Totally Dead!\nWant to buy more lives???");
	}
	
	public String toString() {
		return super.toString() + "\nLives Left: " + getLives();
	}
}
