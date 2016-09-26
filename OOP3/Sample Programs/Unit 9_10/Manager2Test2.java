import javax.swing.*;
/** tests the validation of salary in Manager2 class
 *  doesn't let the user retry the data entry
 */
public class Manager2Test2 {
	public static void main (String args[]){
	  Manager2 m1, m2;
	  String fname = JOptionPane.showInputDialog("First name: ");
	  String sname = JOptionPane.showInputDialog("Surname: ");
	  try {
		double salary = Double.parseDouble(JOptionPane.showInputDialog(
			"Weekly Salary: must be at least 600"));
		m2 = new Manager2(fname,sname,salary);
		JOptionPane.showMessageDialog(null,"Manager2 created successfully:\n " +
	                      m2.toString() + " and salary is " + m2.earnings());
	  }
	  catch (NumberFormatException e){
	  	JOptionPane.showMessageDialog(null,"Salary must be a number");
	  }	 
	  catch (IllegalArgumentException e){
	  	JOptionPane.showMessageDialog(null,e.getMessage());
	  }
	  
	}
}