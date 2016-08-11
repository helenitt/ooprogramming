package labs.set8.q6;

import java.util.*;
/** traverses a list using an iterator */
public class GenericFriendsList2 {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;

        //Add members to a list
        friends = new ArrayList<Person>( );

        person = new Person("Jane", 40, 'F');
        friends.add( person );

        person = new Person("Sean",  6, 'M');
        friends.add( person );

        person = new Person("Helen",  21, 'F');
        friends.add( person );

        person = new Person("Betty", 14, 'F');
        friends.add( person );

        // display the list
        System.out.println("List of friends, using toString()\n" + friends);

        //display again, using an iterator this time
        System.out.println("\nList of friends, using iterator()");
        // Note the 'typed' Iterator
        Iterator<Person> it = friends.iterator();
		while (it.hasNext())
			System.out.println(it.next().getName());
		
		/*(a) Write a program like GenericFriendsList which sets up a 
		 * list of Players in arbitrary order, then use Collections.sort() 
		 * to sort it first by name, using the ComparePlayerNames 
		 * comparator (display the list to make sure it worked), then by 
		 * score using the ComparePlayerScore comparator (display again). 
		 */
		Collections.sort(friends, new ComparePersonNames());
		System.out.println("\nList of friends, after sorting by name");
		Iterator<Person> nit = friends.iterator();
		while(nit.hasNext()) {
			System.out.println(nit.next().getName());
		}
    }
}