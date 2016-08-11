package labs.set6.q3;

import java.util.*;

/** Sets up a list of people, and filters out all under 20 years old using an Iterator*/
public class FilteredFriendsList {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;

        //Add members to a list
        friends = new ArrayList<Person>( );

        person = new Person("Bill", 21, 'F');
        friends.add( person );

        person = new Person("Alice",  18, 'M');
        friends.add( person );

        person = new Person("Emmeline",  17, 'F');
        friends.add( person );

        person = new Person("John", 42, 'M');
        friends.add( person );

        // display the list
        System.out.println("Original List: " + friends);

        //Remove everyone who's name begins with j
        //and display again: note the use of an Iterator
        
        Iterator<Person> it = friends.iterator();
        
		while (it.hasNext()) {
		  person = it.next();
			if (person.getName().startsWith("J"))
				it.remove();
		}
				
        System.out.println("\nList with the j names removed:");
        System.out.println(friends);
    }
}