/** models a game player, with name and score*/
public class Player1 implements Comparable <Player1> {
  protected String name;
  protected int score;

  /** default player has attributes "Name Unknown" and score 0 */
  public Player1() {
   	this("name unknown",0);
  }

  public Player1(String name){
  	this(name,0);
  }

  /** all attributes known
   *@param name Full Name
   *@param score Score
   */
  public Player1(String name, int score){
  	setName(name);
  	setScore(score);
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
  	return getName() + " " + getScore();
  }

/*public int compareTo(Object p){
	Player1 p1=(Player1)p;
	if (this.getScore()< p1.getScore()) return -1;
	else if (this.getScore()> p1.getScore()) return +1;
	else return 0;
}*/

public int compareTo(Player1 p1){
	if (this.getScore()< p1.getScore()) return -1;
	else if (this.getScore()> p1.getScore()) return +1;
	else return 0;
}

}