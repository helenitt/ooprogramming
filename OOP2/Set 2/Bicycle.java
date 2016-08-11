//Bicycle.java
/**/

public class Bicycle {
	private String bOwnersName, bMake;
	private double bValue;
	
	//Constructors
	public Bicycle(String own, double val, String make) {
		bOwnersName = own;
		bValue = val;
		bMake = make;
	}
	public Bicycle() {
		this("Unknown",0.00,"Unknown");
	}
	
	//Accessors
	public String getBOwnerName() {
		return bOwnersName;
	}
	public double getBValue() {
		return bValue;
	}
	public String getBMake() {
		return bMake;
	}
	
	//Mutators
	public void setBOwnerName(String ownersName) {
		bOwnersName = ownersName;
	}
	public void setbValue(double value) {
		bValue = value;
	}
	public void setIncreasedValue(double value) {
		bValue = value + 10;
	}
	public void getBOwnerName(String make) {
		bMake = make;
	}
	public void addItems(String name, double value, String make) {
		bOwnersName = name;
		bValue = value;
		bMake = make;
	}
	
	//toString Method
	public String toString() {
		return String.format("Bicycle Owner: %s\nBicycle Value: %.2f\nBicycle Make: %s",
							 getBOwnerName(), getBValue(), getBMake());
	}
}