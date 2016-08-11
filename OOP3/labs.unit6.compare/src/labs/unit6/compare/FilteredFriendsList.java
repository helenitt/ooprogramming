package labs.unit6.compare;

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

        //Remove the everyone aged less than 20
        //and display again: note the use of an Iterator
        Iterator<Person> it = friends.iterator();
		while (it.hasNext()){
		  person = it.next();
			if (person.getAge() < 20)
				it.remove();
		}
				
        System.out.println("\nList with the under-20s removed");
        System.out.println(friends);
    }
}