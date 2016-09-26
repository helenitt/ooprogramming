import java.util.*;
/** tests the two Player comparator classes
 *  Needs Player, ComparePlayerNames and ComparePlayerScores to run */
public class ComparePlayerTester1 {
  public static void main (String args[]){
  	// create a hash set (unordered) of players and add some players to it
  	Set<Player1> gamers = new HashSet<Player1>();
  	gamers.add( new Player1("Tom", 5));
  	gamers.add( new Player1 ("Harry", 8));
  	gamers.add( new Player1("Nora",4));
  	// display the original set
  	System.out.println("Original set of players");
  	System.out.println(gamers);


  	//Set <Player1> rankedGamers = new TreeSet<Player1>();
  	//rankedGamers.addAll(gamers);
  	
  	Set <Player1> rankedGamers = new TreeSet<Player1>(gamers);
  	
  	System.out.println("\nSorted by score " +rankedGamers);
  }

}