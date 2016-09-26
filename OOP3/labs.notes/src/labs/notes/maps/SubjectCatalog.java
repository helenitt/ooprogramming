package labs.notes.maps;

import java.util.Map;
import java.util.TreeMap;

public class SubjectCatalog {
	public static void main(String[] args) {
		Map<String, String> catalog = new TreeMap<String, String>();
		
		catalog.put("cs101", "Java");
		catalog.put("cs201", "PHP");
		catalog.put("cs333", "SQL");
		
		if(catalog.containsKey("cs101")) 
			System.out.println("We teach Java this semester");
		else
			System.out.println("No Java this semester");
	}
}