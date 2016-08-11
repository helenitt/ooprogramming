package labs.parctise.vehicle;

public class Bus extends Vehicle {
	private int maxPassengers;
	
	public Bus() {
		maxPassengers = 0;
	}
	public Bus(String mMod, int num, String name, int maxPass) {
		super(mMod, num, name);
		maxPassengers = maxPass;
	}
	public Bus(String mMod, int num, String name, int maxPass, double tax) {
		super(mMod, num, name, tax);
		maxPassengers = maxPass;
	}
	
	public int getMaxPassengers() {
		return maxPassengers;
	}
	public void setMaxPassengers(int maxPass) {
		maxPassengers = maxPass;
	}
	
	public void setRoadTax(double tax) {
		roadTax += 0.1 * tax;
	}
	public double calcTax() {
		return roadTax;
	}
	
	public String toString() {
		return "Bus: " + super.toString() + "\nMax Passengers: " + getMaxPassengers();
	}
}
