package labs.parctise.comparable;

import java.util.*;
/** demonstrates Set and SortedSet via a list of persons
 * needs the Person class in the same folder
 */
public class PersonSet {
  public static void main (String args[]){
  	Set<Person> friends = new HashSet<Person>();
  	Person person;
  	    person = new Person("Jane", 10, 'F');
        friends.add( person );

        person = new Person("Ed",  6, 'M');
        friends.add( person );

        person = new Person("William",  8, 'F');
        friends.add( person );

        person = new Person("Emma", 14, 'F');
        friends.add( person );
        
    System.out.println(friends);
    
    Set<Person> sortedSet = new TreeSet<Person>(friends);      	
    System.out.println(sortedSet);
    
    //Filter
    Iterator<Person> it = sortedSet.iterator();
    while(it.hasNext()) {    	
    	if(it.next().getAge() < 10) {
    		it.remove();
    	}
    }
    
    //Print
    System.out.println("\nFriends over 10: ");
    Iterator<Person> pit = sortedSet.iterator();
    while(pit.hasNext()) {
    	System.out.print(pit.next().getName() + ", ");
    }
  }
}