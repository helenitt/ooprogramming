//package comm.walsh.exceptionexamples;
/** Employee subclass: paid a weekly salary
 * 'setWeeklySalary' throws IllegalArgumentException
 *  if the salary is less than 600 euro*/
public class Manager2 extends Employee{
  private double weeklySalary;
  		
  /** all attributes known
   @param fn Firstname
   @param ln Surname
   @param sal Salary, per week
   */
  public Manager2(String fn, String ln, double sal) {
	    super(fn,ln);
	    setWeeklySalary(sal);
   }
   
  /** throws an IllegalArgumentException if salary too low
   @param sal The weekly Salary: must be at least 600
   */
  public void setWeeklySalary(double sal){
	  if (sal < 600)
	     throw new IllegalArgumentException (
	     	"Manager's salary must be at least 600 euro");
	  weeklySalary=sal;
    }

  /** calculates the earnings
   @return the weekly earnings, which is the salary
   */
  public double earnings(){
	     return weeklySalary;
    }

  /*
   *@return the manager's full name
   */
  public String toString() {
	     return "Manager's name is " + super.toString();
  } 							
}