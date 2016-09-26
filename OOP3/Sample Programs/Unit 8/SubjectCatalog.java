import java.util.*;
/** uses a map to hold details of subject codes and subject titles 
 @author Wu
 **/
public class SubjectCatalog {
	public static void main (String args[]){
		// declare a map with String keys and String values
		Map <String,String>    catalog;
		// create this map as a sorted TreeMap implementation
		catalog = new TreeMap<String,String>( );
		// add a number of entries to the map
		catalog.put("CS101", "Intro Java Programming");
		catalog.put("CS301", "Database Design");
		catalog.put("CS413", "Software Design for Mobile Devices");
		// check whether the map contains a particular key
		if (catalog.containsKey("CS101")) {
			System.out.println("We teach Java this semester");
		} 
		else {
			System.out.println("No Java courses this semester");
		}
	}
}