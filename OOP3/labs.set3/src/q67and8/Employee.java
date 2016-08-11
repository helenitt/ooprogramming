package q67and8;

public abstract class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String fn,String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public abstract double earnings();
	
	public String toString() {
		return firstName + " " + lastName;
	}
}