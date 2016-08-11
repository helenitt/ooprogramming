package q67and8;

public class HourlyWorker extends Employee {
	private double hours;
	private double wageRate;
	
	public HourlyWorker(String fn, String ln, double hr, double wr) {
		super(fn,ln);
		hours = hr;
		wageRate = wr;
	}
	
	public void setHours(double h) {
		if(h>0 && h<168) {
			hours = h;
		}
		else {
			hours = 0;
		}
	}
	public void setWageRate(double r) {
		if(r>0) {
			wageRate = r;
		}
		else {
			wageRate = 0;
		}
	}
	
	public double earnings() {
		return hours * wageRate;
	}
	
	public String toString() {
		return "Staff's Name: " + super.toString();
	}
}