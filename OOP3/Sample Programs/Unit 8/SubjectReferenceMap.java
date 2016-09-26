import java.util.*;
import javax.swing.*;
/** uses a map to manipulate a collection of 'topic, reference site' pairs
 */
public class SubjectReferenceMap {
  public static void main (String args[]){
  	// use a sorted TreeMap to hold the information: it will be sorted by key
  	Map<String,String> subjectsBySite = new TreeMap<String,String>();

	// add subject-and-site pairs to the TreeMap: nb duplicate keys not allowed
	subjectsBySite.put("Linux News","newsforge.com");
	subjectsBySite.put("PHP","devchannel.org");
	subjectsBySite.put("Java","devchannel.org");
	subjectsBySite.put("XML","devchannel.org");
	subjectsBySite.put("Perl","linux.com");
	subjectsBySite.put("Linux Development","linux.com");
	subjectsBySite.put("PHP","linux.com");
	subjectsBySite.put("XML","devchannel.org");
	subjectsBySite.put("Web-Services","devchannel.org");
	subjectsBySite.put("Linux Tools","linux.com");
	subjectsBySite.put("IT Management","itmanagersjournal.com");
	subjectsBySite.put("Security","devchannel.org");
	subjectsBySite.put("Java","devchannel.org");
	subjectsBySite.put("J2EE","devchannel.org");
	subjectsBySite.put("XML","devchannel.org");

    // Count the key-value pairs:  only 11 unique keys
    System.out.println(subjectsBySite.size());
    // print out all the pairs in unstructured manner
    System.out.println(subjectsBySite);
    
    // Find all the sites for Linux
    // Define a Map.Entry Set over the Map, to get keys and values separately
    Set <Map.Entry<String,String>> subjectAndSite = subjectsBySite.entrySet();

    // Define a place-holder for Linux related Sites
    // Use Set to avoid duplicates
	Set<String> linuxSites = new HashSet<String>();

	// Define an Iterator, and go thru the set picking out the linux sites
	Iterator<Map.Entry<String,String>> it = subjectAndSite.iterator();
	while ( it.hasNext() ) {
    	Map.Entry<String,String> sAndSEntry = (Map.Entry<String,String>) it.next();
    	String theme = sAndSEntry.getKey();

		// Selecting any subjects that contains Linux
    	if (theme.startsWith("Linux")) {
			// Placing the Linux related site in the Linux Set
			linuxSites.add(sAndSEntry.getValue());
        } // end if theme
	}// end while

	// Now generate a list of sites, excluding all the linux sites
	// Extracting values (sites) from original Map
	Collection<String>  allSites = subjectsBySite.values();

	// Filtering values (sites)
	Set<String> nonLinuxSites = new HashSet<String>(allSites);
	nonLinuxSites.removeAll(linuxSites);

	System.out.println("If Linux is your cup of tea then you will like : " + linuxSites);
	System.out.println("If you're weary of the penguin, then you can visit : " + nonLinuxSites);

  }
}