package labs.parctise.staff;

public abstract class Employee implements Payable {
	protected  String name;
	
	public Employee() {
		this.name = "U"; 
	}
	public Employee(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double calcPay();
	
	public String toString() {
		return "\nName: " + getName();
	}
}
