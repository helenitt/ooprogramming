import java.util.*;
/** class which creates and displays an ArrayList of Persons
 * the ArrayList is not typed
 * Pre-Java 1.5 version causes compiler warnings, but program will run
 */
public class PreJava5FriendsList {
    public static void main(String[] arg) {
        Person   person;
        List     friends;

        //Create the list
        friends = new ArrayList( );
		// populate the list
        person = new Person("Jane", 10, 'F');
        friends.add( person );

        person = new Person("Jack",  6, 'M');
        friends.add( person );

        person = new Person("Jill",  8, 'F');
        friends.add( person );

        person = new Person("John", 14, 'M');
        friends.add( person );

        // display the names of my friends, using a 'for' loop
        for (int i = 0; i<friends.size(); i++){
            person = (Person) friends.get( i);
            System.out.println( person.getName( ) );
        } 
        // display all the details, using a for-each loop
        // need to make pp an Object to avoid complicated typecasts	
        for (Object pp : friends)
        	System.out.println(pp);
    }
}