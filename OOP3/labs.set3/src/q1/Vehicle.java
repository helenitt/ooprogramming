package q1;

public class Vehicle {
	private String model;
	private double price;
	private double length;
	private double weight;
	
	//Constructors
	public Vehicle() {
		setModel("Unknown");
		setPrice(0.00);
		setLength(0.0);
		setWeight(0.0);
	}
	public Vehicle(String mod, double pr, double lth, double wg) {
		model = mod;
		price = pr;
		length = lth;
		weight = wg;
	}
	
	//Accessor Methods
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public double getLength() {
		return length;
	}
	public double getWeight() {
		return weight;
	}
	
	//Mutator Methods
	public void setModel(String mod) {
		model = mod;
	}
	public void setPrice(double pr) {
		price = pr;
	}
	public void setLength(double lth) {
		length = lth;
	}
	public void setWeight(double wg) {
		weight = wg;
	}
	public String toString() {
		 return "\n Vehicles Details:- \n\nModel: " + getModel() + "\nPrice: " +
				getPrice() + "\nLength: " + getLength() + "\nWeight: " + 
				getWeight() + "\nClass: " + getClass();
	}
}