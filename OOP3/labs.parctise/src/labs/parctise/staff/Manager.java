package labs.parctise.staff;

public class Manager extends Employee {
	private double salary;
	
	public Manager() {
		super();
		this.salary = 0.0;
	}
	public Manager(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public double getEarnings() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calcPay() {
		return salary;
	}
	
	public String toString() {
		return super.toString() + "\nSalary: " + getEarnings();
	}
}
