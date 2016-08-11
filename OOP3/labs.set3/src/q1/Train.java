package q1;

public class Train extends Vehicle {
	private int numCarriage;
	
	public Train() {
		super();
		numCarriage = 0;
	}
	public Train(String mod, double pr, double lth, double wg, int numCar) {
		super(mod, pr, lth, wg);
		setNumCarriage(numCar);
	}
	
	public int getNumCarriage() {
		return numCarriage;
	}
	public void setNumCarriage(int numCar) {
		numCarriage = numCar;
	}
	public String toString() {
		return super.toString() + "\nCarrages: " + getNumCarriage();
	}
}
