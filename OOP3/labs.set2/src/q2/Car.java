package q2;

public class Car extends Vehicle {
	private String regNumber;
	private int maxPassengers;
	
	public Car() {
		super();
		setRegNumber("");
		setMaxPassengers(0);
	}
	public Car(String mod, double pr, double lth, double wg, String regNum, int maxPass) {
		super(mod, pr, lth, wg);
		setRegNumber(regNum);
		setMaxPassengers(maxPass);
	}
	
	//Accessors
	public String getRegNumber() {
		return regNumber;
	}
	public int getMaxPassengers() {
		return maxPassengers;
	}
	
	//Mutators
	public void setRegNumber(String regN) {
		regNumber = regN;
	}
	public void setMaxPassengers(int maxP) {
		maxPassengers = maxP;
	}
	
	//toString
	public String toString() {
		return super.toString() + "\n" + getRegNumber() + "\n" + getMaxPassengers();
	}
}
