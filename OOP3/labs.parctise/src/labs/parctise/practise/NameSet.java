package labs.parctise.practise;

import java.util.*;

public class NameSet {
	public static void main(String[] args) {
		// Declare the set generically
		Set<String> names = new HashSet<String>();
		
		// Populate the set
		names.add("Helen");
		names.add("Sean");
		names.add("Jean");
		names.add("Anne");
		names.add("Helen");
		
		// Display the set
		System.out.println(names);
	}
}
