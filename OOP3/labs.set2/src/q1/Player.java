package q1;

public class Player {
	private String name;
	private int score;
	
	public Player() {
		this("Unknown",0);
	}
	
	public Player(String name) {
		this(name,0);
	}
	
	public Player(String name, int score) {
		setName(name);
		setScore(score);
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	//toString
	public String toString() {
		return "Name: " + getName() + "\nScore: " + getScore();
	}
}
