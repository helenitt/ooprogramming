package labs.set5.q3;

import java.util.*;

/* 
 * Demonstrates Set and SortedSet via a list of names
 */
public class NameSet {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Liz");
		names.add("Bernie");
		names.add("Jean");
		names.add("Liz");
		names.add("Theresa");
		
		System.out.println(names);
		
		// Transfer all the names to a sorted TreeSet
		TreeSet<String> sortedNames = new TreeSet<String>(names);
		
		System.out.println(sortedNames);
		System.out.println("First person is " + sortedNames.first());
	}
}
