import java.util.*;
import javax.swing.*;
/** creates a typed ArrayList of persons */
public class GenericFriendsList1 {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;

        //Add members to a list
        friends = new ArrayList<Person>( );
        JTextArea output = new JTextArea();

        person = new Person("Jane", 10, 'F');
        friends.add( person );

        person = new Person("Jack",  6, 'M');
        friends.add( person );

        person = new Person("Jill",  8, 'F');
        friends.add( person );

        person = new Person("John", 14, 'M');
        friends.add( person );

        // display the names of all the friends : note no typecast needed
        output.setText("These are my friends, got using a for loop\n");
        for (int i = 0; i<friends.size(); i++){
            person =  friends.get( i);
            output.append( person.getName( ) + "\n");
        } 
        JOptionPane.showMessageDialog(null,output);
        	
        // display the names again, using for-each:
        output.setText("Here's the same output, got using for-each\n");
        for (Person pp : friends)
        	output.append(pp.getName()+ "\n");	
        JOptionPane.showMessageDialog(null,output);	
        // Now display use the Collection toString() method	
        output.setText("Here's the result of using the toString() method for the whole list\n");
        output.append(friends.toString());
		JOptionPane.showMessageDialog(null,output);	
       }
}