package labs.parctise.staff;

public class SalesPerson extends Employee {
	private int hoursWorked;
	private double rateOfPay;
	
	public SalesPerson() {
		super();
		this.hoursWorked = 0;
		this.rateOfPay = 0.00;
	}
	public SalesPerson(String name, int hours, double rate) {
		super(name);
		hoursWorked = hours;
		rateOfPay = rate;
	}
	
	public double getEarnings() {
		return calcPay();
	}
	public double getRate() {
		return rateOfPay;
	}
	
	public void setHours(int hours) {
		hoursWorked = hours;
	}
	public void setRate(double rate) {
		this.rateOfPay = rate;
	}
	
	public double calcPay() {
		return hoursWorked * rateOfPay;
	}
	
	public String toString() {
		return super.toString() + "\nEarnings: " + calcPay();
	}
}
