package labs.set8.q3;

import java.util.*;
/** program to keep track of modules and lecturers: uses an unsorted HashMap
 */
public class ModuleMap{
	public static void main (String args[]){
		// declare a map to hold module names and lecturer names (both Strings)
	    Map<String, String> map = new HashMap<String, String>();
	    // populate the map, and display it
	   	map.put("OOP3","John");
	   	map.put("OOP2","John");
	   	map.put("Database 1","Catherine");
	   	map.put("Database 2","Peter");
	   	map.put("Network Basics", "Fergus");
		System.out.println(map);
		//  output all the module names, by extracting the key set
		Set<String> moduleList = map.keySet();
		System.out.println(moduleList);
		
		// output the lecturer names (with duplicates) by converting to a Set
		Set<String> lecturerNames = new HashSet<String>(map.values());
		System.out.println(map.values());
		System.out.println("Lecturers by Set: " + lecturerNames);
		
		// get a unique list of lecturers
		List<String> sortLecNames = new ArrayList<String>(map.values());

		Set<String> lecturerNamesAlphebetic = new TreeSet<String>(map.values());		
		System.out.println("Lecturers by List: " + sortLecNames);
		System.out.println("Lecturers by TreeSet: " + lecturerNamesAlphebetic);
		
		// iterate through the set nicely to display all modules with lecturer
	    // Iterator<Map.Entry> it = map.entrySet().iterator();
		Set<Map.Entry<String,String>> mapset= map.entrySet();

		Iterator<Map.Entry<String,String>> it=mapset.iterator();

		while (it.hasNext()){
			Map.Entry<String, String> entry =  it.next();
			System.out.println(entry.getValue()+ " will teach " + entry.getKey());
		}
		System.out.println("\nreset list " + map);
		
		// Change the lecturer for Networks
		map.put("Network Basics", "Genie"); // Overwrites the previous entry with the same key
		System.out.println(map);
		
		// who teaches OOP2?
		if (map.containsKey("OOP2"))
		    System.out.println(map.get("OOP2")+ " will teach OOP2 ");
		else
		    System.out.println("No-one assigned to OOP2");
		
		System.out.println("\nreset list " + map);
		
		// Use an iterator and the setValue() for the Map.Entry interface to 
		// change the names values
		Iterator<Map.Entry<String,String>> nit = mapset.iterator();
		
		while (nit.hasNext()){
			Map.Entry<String, String> entry =  nit.next();
			entry.setValue("Unknown");
			System.out.println(entry.getValue()+ " will teach " + entry.getKey());
		}
		
		map.put("Network Basics", "Genie");
		System.out.println("\nAfter adding Gene " + map);
		
		map.put("Survival Spanish", "Aine"); 
		System.out.println("\nAfter adding Aine " + map);
		
		System.out.println(map.get("Hill Walking"));
	}
}