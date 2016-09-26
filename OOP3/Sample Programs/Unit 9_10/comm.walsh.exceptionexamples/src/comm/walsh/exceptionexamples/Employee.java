//package comm.walsh.exceptionexamples;
/** Abstract class that acts as the top-level class in an inheritance hierarchy*/
public abstract class Employee {
  private String firstName;
  private String lastName;
		
  /** constructor requires first and last name 
   @param fn First name
   @param ln Surname
   */		
  public Employee(String fn, String ln) {
	    firstName = fn;
	    lastName = ln;
    }

  /**
   @return first name
   */
  public String getFirstName(){
	     return firstName;
    }

  /**
   @return last name
   */
  public String getLastName(){
	     return lastName;
    }

  /** 
   @return the employee's full name
   */
  public String toString() {
	     return firstName + " " + lastName;
   }
	
/** must be implemented by each subclass*/
  public abstract double earnings();									
}