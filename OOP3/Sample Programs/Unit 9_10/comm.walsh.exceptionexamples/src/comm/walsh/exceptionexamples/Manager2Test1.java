//package comm.walsh.exceptionexamples;
import javax.swing.*;
/** tests the validation of manager salaries by creating a Manager2 with a low salary
 */
public class Manager2Test1 {
	public static void main (String args[]){
	  Manager2 m1, m2;
	  m2 = new Manager2("Mary","Green",1300.00);
	  JOptionPane.showMessageDialog(null,"Manager created successfully:\n " +
	                      m2.toString() + " and salary is " + m2.earnings()) ; 
	  m1 = new Manager2("Joe","Soap",300.00);
	  JOptionPane.showMessageDialog(null,"Manager created successfully:\n " +
	                      m1.toString() + " and salary is " + m1.earnings()) ; 
	  
	}
}