package labs.set5.q9;

/*a. List is a raw type. References to generic type List<E> should be parameterized
 * 	 Type mismatch: cannot convert from Object to Person
 * 
 * b.
 */

import java.util.*;
import javax.swing.*;
/** creates a typed ArrayList of persons */
public class GenericFriendsList1 {
    public static void main(String[] arg) {
        Person   person;
        List<Person>     friends;
        char gen;
        int female=0, male=0;

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
        
        person = new Person("Jack", 10, 'M');
        friends.add( person );

        // display the names of all the friends : note no typecast needed
        output.setText("These are my friends, using a for loop\n");
        
        for (int i = 0; i<friends.size(); i++){
            person =  friends.get( i);
            output.append( person.getName( ) + "\n");
        }
        
        JOptionPane.showMessageDialog(null,output);
        	
        // display the names again, using for-each:
        output.setText("Here's the same output, using for-each\n");
        
        for (Person pp : friends)
        	output.append(pp.getName()+ "\n");	
        
        JOptionPane.showMessageDialog(null,output);	
        
        // Now display use the Collection toString() method	
        output.setText("Here's the result of using the toString() method for the whole list\n");
        output.append(friends.toString());
		JOptionPane.showMessageDialog(null,output);	
		
		/* Add a block of code which will count the number of 
		*males and the number of females
		*
		*For Loop
		*	Get gender
		*	Count M & F
		*	Display count for each gender
		*/
		output.setText("Count for female and male\n\n");
        for (Person pp : friends) {
        	gen = pp.getGender();
        	
        	switch(gen) {
        		case 'F':
        			female++;
        			break;
        		case 'M':
        			male++;
        			break;
        	}
        }
        output.append("Female: " + female + "\nMale: " + male);
        JOptionPane.showMessageDialog(null,output);
        
        /*b. Get the program to check that number of males + the 
         * number of females is the same as the number of persons 
         * in the list. 
         */
        output.setText("Gender Totals same as No on List\n\n");
        output.append("List Count: " + friends.size());
        output.append("\nFemale plus Male: " + (female + male));
        JOptionPane.showMessageDialog(null,output);
        
        /*c. Displays all the ages and the average age
         */
        int age=0, total=0;
        float avg=0;
        
        output.setText("Ages are: ");
        
        for(Person pp: friends) {
        	age = pp.getAge();
        	output.append(age + ", ");
        	total += age;
        }
        avg = (float)total/friends.size();
        output.append("\nTotal: " + total + "\nAverage Age: " + avg);
        JOptionPane.showMessageDialog(null,output);
       }
}