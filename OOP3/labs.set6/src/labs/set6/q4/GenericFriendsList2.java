package labs.set6.q4;

import java.util.*;
/** traverses a list using an iterator */
public class GenericFriendsList2 {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;

        //Add members to a list
        friends = new ArrayList<Person>( );

        person = new Person("Jane", 10, 'F');
        friends.add( person );

        person = new Person("Jack",  6, 'M');
        friends.add( person );

        person = new Person("Jill",  8, 'F');
        friends.add( person );

        person = new Person("John", 14, 'M');
        friends.add( person );

        // display the list
        System.out.println("List of friends, using toString()" + friends.toString());

        //Get rid of the men
		Iterator<Person> pit = friends.iterator();
		
		while(pit.hasNext()) {
			if(pit.next().getGender() == 'M') {
				pit.remove();
			}
		}
		
        //display again, using an iterator this time
        System.out.println("\nNames of my friends, using iterator()");
        
        // Note the 'typed' Iterator
        Iterator<Person> it = friends.iterator();
        
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
    }
}