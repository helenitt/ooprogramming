package labs.set4Add.q1;

public class Q1Lorry extends Q1Vehicle {
	//String makeModel;  // Can it be in the constructor without being an attribute?  YES
	//String name;
	//int num;

	public Q1Lorry(String makeModel, String name, int num) {
		super(makeModel, num, name);
	}
	
	
	public void setRoadTax(double tax) {
		roadTax += (0.1 * roadTax);
	}
	public double calcTax() {
		return roadTax;
	}
	
	public String toString() {
		return "\nLorry:- " + super.toString() + "\n";
	}
}
