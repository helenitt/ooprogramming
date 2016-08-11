package labs.set6.q8;

import java.util.Comparator;

/** Comparator which compares players by case-sensitive alphabetic order of name */
public class CompareOwnerNames implements Comparator<Bicycle> {
   /** method which compares two players by name, alphabetically, case-sensitive
    *@param p1 the first player
    *@param p2 the second player
    */
   public int compare(Bicycle bike1, Bicycle bike2){
	   return bike1.getOwner().compareTo(bike2.getOwner());
   }
}