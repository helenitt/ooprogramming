package samplePrograms;

/** Employee paid a weekly salary*/
public final class Manager extends Employee{
  private double weeklySalary;
  		
  /** all attributes known
   @param fn Firstname
   @param ln Surname
   @param sal Salary, per week
   */
  public Manager(String fn, String ln, double sal) {
	    super(fn,ln);
	    setWeeklySalary(sal);
   }
   
  /*
   @param sal The weekly Salary
   **/
  public void setWeeklySalary(double sal){
	     if (sal>0)
	     	weeklySalary=sal;
	     else
	        weeklySalary=0;
  }

  /* calculates the earnings
   @return the weekly earnings, which is the salary
   */
  public double earnings(){
	     return weeklySalary;
    }

  /*
   @return the manager's full name
   */
  public String toString() {
	     return "Manager name: " + super.toString();
  } 							
}