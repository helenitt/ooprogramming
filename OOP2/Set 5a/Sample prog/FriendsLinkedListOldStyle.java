import java.util.*;  // note the import statement
/** from Wu: creates a LinkedList of persons */
public class FriendsLinkedListOldStyle {
    public static void main(String[] arg) {
        Person   person;
        /* declare the list: no type is declared for the objects in the list
         * so each one that's 'got' must be typecast
         * and compiler will issue a warning message */
        List     friends;  
        //Create the list: again, type is not mentioned
        friends = new LinkedList( );

        person = new Person("jane", 10, 'F');
        friends.add( person );

        person = new Person("jack",  6, 'M');
        friends.add( person );

        person = new Person("jill",  8, 'F');
        friends.add( person );

        person = new Person("john", 14, 'M');
        friends.add( person );

        // display the list
        System.out.println("List of friends");
        for (int i = 0; i<friends.size(); i++){
        	// we don't know what's in the list, so typecast it
            person =  (Person) friends.get( i);
            System.out.println( person.getName( ) );
        }

        //Remove the second person
        //and display again
        friends.remove(1);

        System.out.println("\nList with second person removed");
        for (int i = 0; i<friends.size(); i++){
            person = (Person) friends.get(i );
            System.out.println( person.getName( ) );
        }
    }
}