package labs.parctise.vehicle;

public class Lorry extends Vehicle {

	public Lorry(String mMod,  int num, String name, double tax) {
		super(mMod, num, name, tax);
	}
	
	public void setRoadTax(double tax) {
		roadTax += 0.1 * tax;
	}
	public double calcTax() {
		return roadTax;
	}
	
	public String toString() {
		return "Lorry: " + super.toString() + "\n";
	}
}
