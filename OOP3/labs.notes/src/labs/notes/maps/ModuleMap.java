package labs.notes.maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class ModuleMap {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Declare a map to hold the names of modules and lecturers
		// Modules are the keys and lecturers are the values
		Map<String, String> modMap = new HashMap<String, String>();
		
		//Populate the map and display it
		modMap.put("OOP3", "John");
		modMap.put("OOP2", "Johnny B");
		modMap.put("DB1", "Catherine");
		modMap.put("PHP", "Anne");
		modMap.put("NF", "Fergus");
		
		System.out.println(modMap);
		
		Set<String> modList = modMap.keySet();
		System.out.println(modList);
		// lecturer names, allowing duplicates
		System.out.println(modMap.values());
		// get a unique list of lecturers
		Set<String> lecturerNames = new HashSet<String>(modMap.values());
		System.out.println(lecturerNames);
		
		Iterator<?> it = modMap.entrySet().iterator();
		while(it.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry<String, String> entry = (Map.Entry)it.next();
			System.out.println(entry.getValue() + " will teach " + entry.getKey());
		}
		
		// Changing the value associated with a key
		System.out.println("\nPre Resetting list " + modMap);
		modMap.put("NF", "Gene");   // erases the previous entry with the same key
		System.out.println("\nPost Resetting list " + modMap);
		
		// Dropping a key-value pair
		modMap.remove("PHP");
		
		// Queries: do we have a lecturer for OOP2?
		if(modMap.containsKey("OOP3"))
			System.out.println(modMap.get("OOP3") + " will teach OOP3");
		else
			System.out.println("No-one assigned to OOP3");
		
		// Queries: do we have a lecturer for DMD?
				if(modMap.containsKey("DMD"))
					System.out.println(modMap.get("DMD") + " will teach DMD");
				else
					System.out.println("No-one assigned to DMD");
	}
}
