package q67and8;

public final class Manager extends Employee {
	private double weeklySalary;
	
	public Manager(String fn, String ln, double ws) {
		super(fn,ln);
		weeklySalary = ws;
	}
	
	public void setWeeklySalary(double sal) {
		if(sal>0) {
			weeklySalary = sal;
		}
		else {
			weeklySalary = 0;
		}
	}
	
	public double earnings() {
		return weeklySalary;
	}
	
	public String toString() {
		return "Managers Name: " + super.toString();
	}
}