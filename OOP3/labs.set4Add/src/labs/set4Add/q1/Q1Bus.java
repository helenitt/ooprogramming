package labs.set4Add.q1;

public class Q1Bus extends Q1Vehicle {
	private int maxPassenger;
	
	public Q1Bus() {
		maxPassenger = 0;
	}
	public Q1Bus(String makeModel, int num, String name, int maxPassenger) {
		super(makeModel, num, name);
		this.maxPassenger = maxPassenger;
	}
	
	public int getMaxPassenger() {
		return maxPassenger;
	}
	
	public void setMaxPassenger(int maxPass) {
		maxPassenger = maxPass;
	}

	public void setRoadTax(double tax) {
		this.roadTax = tax;
	}
	public double calcTax() {
		return roadTax;
	}
	
	public String toString() {
		return "\nBus:- " + super.toString() + "\nMax Passengers: " + getMaxPassenger() + "\n";
	}

}
