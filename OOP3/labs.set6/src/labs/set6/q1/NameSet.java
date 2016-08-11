package labs.set6.q1;

import java.util.*;

/** demonstrates Set and SortedSet via a list of names
 */
public class NameSet {
  public static void main (String args[]){
	
	
  	Set<String> names = new HashSet<String>();
  	
  	names.add("Bernadine");
  	names.add("Elizabeth");
  	names.add("Gene");
  	names.add("Elizabeth");
  	names.add("Clara");
  	
  	Iterator<String> it = names.iterator();
  	
  	String longestName = "";
  	int biggest = 0;
  	
  	while(it.hasNext()) {
  		String tempName = it.next();  		
  		int nameLength = tempName.length();
  				
  		System.out.print(tempName.toString() + " " + nameLength + ", ");
  		
  		if(nameLength>biggest) {
  			biggest = nameLength;
  			longestName = tempName;
  		}
  		else if(nameLength == biggest) {
  			longestName += ", " + tempName;
  		}
  	}
  	
  	System.out.println("\n\nLongest Name: " + longestName);
  	
  	// transfer all the names to a (sorted) TreeSet
  	TreeSet<String> sortedNames = new TreeSet<String>(names);
  	System.out.println("\nSorted Names: " + sortedNames);
  	System.out.println("\nFirst person is " +sortedNames.first());

  	
  }
}