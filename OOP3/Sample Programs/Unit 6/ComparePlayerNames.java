import java.util.*;
/** Comparator which compares players by case-sensitive alphabetic order of name */
public class ComparePlayerNames implements Comparator<Player> {
   /** method which compares two players by name, alphabetically, case-sensitive
    *@param p1 the first player
    *@param p2 the second player
    */
   public int compare(Player p1, Player p2){
   	return p1.getName().compareTo(p2.getName());
   }
}