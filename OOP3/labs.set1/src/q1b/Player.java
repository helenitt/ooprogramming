package q1b;



/** models a game player, with name and score*/
public class Player extends Person {
  private String name;
  private int score;
  BankAccount bankAcc;
    
  /** default player has attributes "Name Unknown" and score 0 */
  public Player() {
   	name = "Unknown";
   	score = 0;
   	bankAcc = new BankAccount();
  }
  
  public Player(String name){
  	this.name = name;
  	score = 0;
  	bankAcc = new BankAccount();
  }
  
  /** all attributes known
   *@param name Full Name
   *@param score Score
   */
  public Player(String name, int score, BankAccount bAcc){
  	setName(name);
  	setScore(score);
  	this.bankAcc = bAcc;
  	//setBankAccount(bAcc); //mutator not written
  	}

/** returns the player's full name */
  public String getName(){
  	return name;
  }
  
  /** returns the player's current score */
  public int getScore() {
  	return score;
  }
  
  public void setName(String name){
  	this.name = name;
  }
  
  /** changes the score
   *@param score The new score, should be >= 0
   */
  public void setScore(int score){
  	if (score >=0)
  		this.score = score;
  }
  
  /** 
   *@return all attributes on one line separated by spaces */
  public String toString(){
  	return "Name: " + getName() + ", Score: " + getScore() + "\n";
  }
    
    
}