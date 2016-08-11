import java.util.*;  // note the import statement
/** from Wu: creates a LinkedList of persons */
public class FriendsLinkedList1 {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends; // declare a list of Persons

        //Create the list, then add members to it
        // details are hard-coded, to speed up the running of it
        friends = new LinkedList<Person>( );

        person = new Person("jane", 10, 'F');
        friends.add( person );

        person = new Person("jack",  6, 'M');
        friends.add( person );

        person = new Person("jill",  8, 'F');
        friends.add( person );

        person = new Person("john", 14, 'M');
        friends.add( person );

        // display the list
        for (int i = 0; i<friends.size(); i++){
            person = friends.get( i);
            System.out.println( person.getName( ) );
        }

        //Remove the second person
        //and display again
        friends.remove(1);

        System.out.println("\nList with second person removed");
        for (int i = 0; i<friends.size(); i++){
            person =  friends.get(i );
            System.out.println( person.getName( ) );
        }
    }
}