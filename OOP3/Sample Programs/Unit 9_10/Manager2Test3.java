import javax.swing.*;
/** uses a loop to force correct input
 */
public class Manager2Test3 {
	public static void main (String args[]){
	  Manager2 m1, m2;
	  String fname = JOptionPane.showInputDialog("First name: ");
	  String sname = JOptionPane.showInputDialog("Surname: ");
	  boolean valid; // added
	  do {   // added
	    valid = false; // added
	    try {
		  double salary = Double.parseDouble(JOptionPane.showInputDialog(
			"Weekly Salary: must be at least 600"));
		  m2 = new Manager2(fname,sname,salary);
		  JOptionPane.showMessageDialog(null,"Manager2 created successfully:\n " +
	                      m2.toString() + " and salary is " + m2.earnings());
		  valid = true; // added
	    } // try
	    catch (NumberFormatException e){
	  	  JOptionPane.showMessageDialog(null,"Salary must be a number");
	    }	// catch 1 
	    catch (IllegalArgumentException e){
	  	  JOptionPane.showMessageDialog(null,e.getMessage());
	    } // catch 2
	  } while (!valid);  // added
	}
}