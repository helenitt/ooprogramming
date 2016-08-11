package labs.set6.q7;

import java.util.*;
/** tests the two Player comparator classes
 *  Needs Player, ComparePlayerNames and ComparePlayerScores to run */
public class ComparePlayerTester {
  public static void main (String args[]){
  	// create a hash set (unordered) of players and add some players to it
  	Set<Player> gamers = new HashSet<Player>();
  	gamers.add( new Player("Tom", 10));
  	gamers.add( new Player ("Harry", 8));
  	gamers.add( new Player("Nora", 4));
  	// display the original set
  	System.out.println("Original set of players");
  	System.out.println(gamers);

  	// use the name comparator to construct a new TreeSet featuring the same players
  	// ordered by name, and display the sorted set
//  	Set <Player> alphaGamers = new TreeSet<Player>(new ComparePlayerNames());
//  	alphaGamers.addAll(gamers);
//  	System.out.println("\nSorted by name\n" +alphaGamers);

  	// use the score comparator to construct a TreeSet ordered by score, and display
  	// note: the tressSet constructor constructs a new, empty set, sorted according to the specified comparator.
  	Set <Player> rankedGamers = new TreeSet<Player>(new ComparePlayerScores());
  	rankedGamers.addAll(gamers);
  	System.out.println("\nSorted by score " + rankedGamers);
  	
  	Set <Player> rankedGamers1 = new TreeSet<Player>(new ComparePlayerNames());
  	rankedGamers1.addAll(gamers);
  	System.out.println("\nSorted by name " + rankedGamers1);
  	
  	
  	
  	
  	
  }

}