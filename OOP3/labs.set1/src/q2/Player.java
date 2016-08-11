package q2;


/** models a game player, with name and score*/
public class Player extends Person {
  private String name;
  private int score;
  BankAccount bankAcc;
  private boolean online;
    
  /** default player has attributes "Name Unknown" and score 0 */
  public Player() {
   	name = "Unknown";
   	score = 0;
   	bankAcc = new BankAccount();
   	online = false;
  }
  
  /** all attributes known
   *@param name Full Name
   *@param score Score
   */
  public Player(String name, int score, BankAccount bAcc, boolean onl){
  	setName(name);
  	setScore(score);
  	this.bankAcc = bAcc;  //direct
  	//setBankAccount(bAcc); //mutator not written
  	online = onl;
  	}
  
  /** returns the player's full name */
  public String getName(){
  	return name;
  }
  
  /** returns the player's current score */
  public int getScore() {
  	return score;
  }
  
  public boolean isOnline() {
	  return true;
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
  
 public void setOnline(boolean onl) {
	online = onl;  
  }
 
  /** 
   *@return all attributes on one line separated by spaces */
  public String toString(){
	String message = (online) ? " is online." : " is not online.";
  	return "Name: " + getName() + ", Score: " + getScore() + "\n" + message + "\n\n";
  }
    
    
}