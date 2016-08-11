package labs.set7.q2;

import java.util.*;

/*
 * a. List implementation is a LinkedList
 * b. LinkedList methods not available for List addAll(), addFirst(),
 *    addLast(), getFirst(), getLast()
 * c. See below
 * d. The method used to process the first person and remove this person 
 *    from the queue is poll()
 * e. See below
 */

/** demonstrates a linked list and a queue of Strings
 */
public class NameQueue {
	public static void main (String args[]){
		// Create a LinkedList of Strings to model a queue
  		LinkedList<String> nameQueue = new LinkedList<String>();
  		// Add some names to it, adding each one at the head of the queue
    	nameQueue.addFirst("Bernadine");
  		nameQueue.addFirst("Elizabeth");
  		nameQueue.addFirst("Gene");
  		nameQueue.addFirst("Elizabeth");
  		nameQueue.addFirst("Clara");
  		// display them in order: note the last one is at the top
  		System.out.println("People in the QL \n" + nameQueue);
  		// remove the last two
  		nameQueue.removeLast();
    	nameQueue.removeLast();
    	// display them again
    	System.out.println("\nLast two leave: \nPeople left in the Q: " + nameQueue);
    	// process the person at the top of the Q
    	System.out.println("\nServing the first person, who is " + nameQueue.poll());
    	System.out.println("People still in the Q: " + nameQueue);
    	
    	//Q2 c.
    	
    	//Get first name
    	System.out.println("\nGet first name in the Q: " + nameQueue.getFirst());
    	//Get last name
    	System.out.println("Get last name in the Q: " + nameQueue.getLast());
    	System.out.println("People still in the Q: " + nameQueue);
    	
    	//Q2 e.
    	//Add two people to the queue
    	nameQueue.add("Helen");
    	nameQueue.addLast("Sean");
    	nameQueue.addFirst("Sonia");
    	System.out.println("\nThree people added\nPeople still in the Q: " + nameQueue);
    	System.out.println("Process First Person in the Q: " + nameQueue.pollFirst());
    	System.out.println("People still in the Q: " + nameQueue);
	}
}