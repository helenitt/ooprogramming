package samplePrograms;

/** Models a worker paid per hour actually worked*/
public class HourlyWorker extends Employee{
  private double wageRate;
  private double hours;
  		
  /** all information known
   @param fn Worker's first name
   @param ln Worker's last name
   @param w Wage Rate per hour
   @param h Number of hours worked this week
   */
  public HourlyWorker(String fn, String ln, double w, double h) {
	    super(fn,ln);
	    setWageRate(w);
	    setHours(h);
  }

  /** sets the wage rate
   @param w Wage Rate in euro per hour
   */
  public void setWageRate(double w){
	     if (w>0)
	     	  wageRate=w;
	     else
	        wageRate=0;
  }
    
  /** sets the hours worked, assuming a valid value entered
   @param h the number of hours actually worked this week
   */
  public void setHours(double h){
	     if (h>=0 && h<168)
	     	  hours=h;
	     else
	        hours=0;
  }

  /** calculates  the earnings
   @return the amount earned this week
   */
  public double earnings(){
	     return wageRate*hours;
  }

  /** minimal toString method
   @return the worker's full name
   */
  public String toString() {
	     return "Hourly worker: name is " + super.toString();
  } 							
}