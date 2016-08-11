package labs.set7.q1;

import java.util.*;

/*
 *a.  The list used is An ArrayList
 *b.  There are 2 Elizabeths in the ArrayList but only 1 is displayed
 *c.  Names are not displayed in the order they were entered
 *
 */

/** demonstrates ArrayList of names. The same code will work for a LinkedList.
 */
public class NameList {
  public static void main (String args[]){
  	// create an ArrayList of strings
  	List<String> names = new ArrayList<String>();
  	// add some names to it
  	names.add("Bernadine");
  	names.add("Elizabeth");
  	names.add("Gene");
  	names.add("Elizabeth");
  	names.add("Clara");
  	// display the whole lot
  	System.out.println(names);
  	// Display the name in position 2
  	System.out.println("2: " + names.get(2));
  	
  	Set<String> nameTreeSet = new TreeSet<String>(names);
  	System.out.println(nameTreeSet);
  	
  	// Q1 part d.
  	int count = names.size();
  	System.out.println("Number of names in the ArrayList: " + count);
  	
  	System.out.println("First Name in the ArrayList: " + names.get(0));
  	System.out.println("Last Name in the ArrayList: " + names.get(count-1));
  }
}