/**Driver class for Student
 */ 

import javax.swing.*;

public class StudentTest {
   public static void main(String args[]){
      	
      	Student s1 = new Student();
		JOptionPane.showMessageDialog(null,"s1: \n" + s1.toString());
		// you can use methods from Person in connection with a Student: 
		JOptionPane.showMessageDialog(null,"Gender is : " + s1.getGender());
	
	// create a Student object s2 via arguments to the Student copy constructor
		Student s2 = new Student("t00012345","Ag Eng 3","Joe Soap", 21,'m');
		JOptionPane.showMessageDialog(null, "s2: \n" + s2.toString());
	// test the 'get' methods separately
		JOptionPane.showMessageDialog(null,"Testing the 'get' methods:\n" +
			"Course: " + s2.getCourse() +
			"\nStudent Name: " + s2.getName() +
			"\nAge: " + s2.getAge());
	// test the 'set' methods (some of them) 
	    s2.setAge(40);
	    s2.setCourse("Ag Eng 4");
		JOptionPane.showMessageDialog(null,"Testing the 'set' methods:\n" +
			"Course now: " + s2.getCourse() +
			"\nStudent Name: " + s2.getName() +
			"\nAge now: " + s2.getAge());
	  }
}