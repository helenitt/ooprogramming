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
		System.out.println(map.values());
		// get a unique list of lecturers
		Set<String> lecturerNames = new HashSet<String>(map.values());
		System.out.println(lecturerNames);
		// iterate through the set nicely to display all modules with lecturer
	 //   Iterator<Map.Entry> it = map.entrySet().iterator();
		Set<Map.Entry<String,String>> mapset= map.entrySet();

		Iterator<Map.Entry<String,String>> it=mapset.iterator();

		while (it.hasNext()){
			Map.Entry entry =  it.next();
			System.out.println(entry.getValue()+ " will teach " + entry.getKey());
		}
		System.out.println("\nreset list " +map);
		// Change the lecturer for Networks
		map.put("Network Basics", "Genie"); // erases the previous entry with the same key
		System.out.println(map);
		// who teaches OOP2?
		if (map.containsKey("OOP2"))
		    System.out.println(map.get("OOP2")+ " will teach OOP2 ");
		else
		    System.out.println("No-one assigned to OOP2");
	}
}