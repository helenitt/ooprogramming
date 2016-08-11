package labs.set4Add.q1;

public abstract class Q1Vehicle implements Q1Taxable {
	private String makeModel;
	private Q1Driver driver;
	protected double roadTax;
	
	public Q1Vehicle() {
		makeModel = "";
		driver = null;
		roadTax = 0.0;
	}

	public Q1Vehicle(String makeMod,  int num, String name) {
		setMakeModel(makeMod);
		setDriver(new Q1Driver(num, name));
	}
	
	public String getMakeModel() {
		return makeModel;
	}
	public Q1Driver getDriver() {
		return driver;
	}
	
	public void setMakeModel(String make) {
		this.makeModel = make;
	}
	
	public void setDriver(Q1Driver dr) {
		driver = dr;
	}
	
	// Can this stay abstract or should it be implemented??
	public abstract void setRoadTax(double tax);
	public abstract double calcTax();
	
	public String toString() {
		return "\nMake: " + getMakeModel() + driver.toString();
	}
}
