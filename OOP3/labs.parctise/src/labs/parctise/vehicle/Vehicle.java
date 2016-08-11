package labs.parctise.vehicle;

public abstract class Vehicle implements Taxable {
	
	private String makeModel;
	private Driver driver;
	protected double roadTax;
	
	public Vehicle() {
		makeModel = "Unknown";
		driver = null;
	}
	public Vehicle(String mMod, int num, String name) {
		setMakeModel(mMod);
		setDriver(new Driver(num, name));
	}
	public Vehicle(String mMod, int num, String name, double tax) {
		setMakeModel(mMod);
		setDriver(new Driver(num, name));
		setRoadTax(tax);
	}
	
	public String getMakeModel() {
		return makeModel;
	}
	public Driver getDriver() {
		return driver;
	}
	
	public void setMakeModel(String mMod) {
		makeModel = mMod;
	}
	public void setDriver(Driver dr) {
		driver = dr;
	}
	
	public abstract void setRoadTax(double tax);
	public abstract double calcTax();
	
	public String toString() {
		return "\nMake: " + getMakeModel() + driver.toString() +
			   "\nTax: " + calcTax() + "\n";
	}
}
