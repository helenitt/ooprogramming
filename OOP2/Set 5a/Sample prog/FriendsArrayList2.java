import java.util.*;  // note the import statement
/** uses an iterator to display a list */
public class FriendsArrayList2 {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends; // declare a list of Persons

        //Create the list, then add members to it
        // details are hard-coded, to speed up the running of it
        friends = new ArrayList<Person>( );

        person = new Person("jane", 10, 'F');
        friends.add( person );

        person = new Person("jack",  6, 'M');
        friends.add( person );

        person = new Person("jill",  8, 'F');
        friends.add( person );

        person = new Person("john", 14, 'M');
        friends.add( person );

        // display the list, using an iterator
        Iterator<Person> iterator = friends.iterator();
        while (iterator.hasNext()) {
            person = iterator.next();
            System.out.println( person.getName( ) );
        } // end while
    } // end main
} // end class
