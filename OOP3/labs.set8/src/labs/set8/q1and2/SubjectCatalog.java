package labs.set8.q1and2;

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
		catalog.put("CS401", "Intro Java Programming");
		catalog.put("CS301", "Database Design");
		catalog.put("CS113", "Software Design for Mobile Devices");
		// check whether the map contains a particular key
		if (catalog.containsKey("CS101")) {
			System.out.println("We teach Java this semester");
		} 
		else {
			System.out.println("No Java courses this semester");
		}
		
		//CREATE SECOND MAP AND ADD  BS COURSES TO IT
		Map<String, String> bsCatalog = new TreeMap<String, String>();
		bsCatalog.put("BS301", "Marketing");
		bsCatalog.put("BS202", "Accounting");
		bsCatalog.put("BS103", "Business");
		
		//CREATE THIRD MAP TO HOLD ALL THE COURSES
		Map<String, String> allCourses = new TreeMap<String, String>();
		allCourses.putAll(bsCatalog);
		allCourses.putAll(catalog);
		
		System.out.println("First map: " + catalog);
		System.out.println("\nSecond map: " + bsCatalog);
		System.out.println("\nThird map: " + allCourses);
		
		//Arrange to have the contents of this map sorted by course code
		//Arranged already because its a TreeSet
		//If it was in a hashSet you would put it in a TreeSet
		
		//Check by using the containsAll() method that this new map has 
		//all the computing courses
		
		//DOESN'T WORK containsAll() BELONGS TO COLLECTIONS/SETS
		//allCourses.containsAll(catalog);  
		//allCourses.containsAll(bsCatalog);
		
		Set<String> compCodes = new HashSet<String>(catalog.keySet());
		System.out.println("\nSet of codes from first map: " + compCodes);
		Set<String> allCodes = new HashSet<String>(allCourses.keySet());
		System.out.println("\nSet of all course codes: " + allCodes);
		System.out.println("\nDoes allCourses contain CS: " + allCodes.containsAll(compCodes));
		
		//CHECK WITH JOHN
		allCourses.remove("CS401");
		allCourses.remove("CS301");
		allCourses.remove("CS113");
		System.out.println("\nAfter removing all computer courses: " + allCourses);
	}
}
/**
 * Q1 a. A TreeMap object is being used to hold the codes and 
 * 		 names of the courses.
 * 
 *    b. The types of the keys are Strings.
 *    
 *    c. The keys represent subject codes.
 *    
 *    d. The types of the values are Strings.
 *    
 *    e. The values represent  the subjects.
 *    
 *    f. The put() method is being used to add a key-value pair 
 *    		to the collection.
 *    
 *    g. The containsKey() method is being used to check whether a 
 *    		particular key is within the collection.
 */

