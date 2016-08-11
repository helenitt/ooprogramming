package Vehicle2;

public class Vehicle implements Taxable {
	private String makeModel;
	private Driver driver;
	protected double roadTax;
	
	public Vehicle() {
		this("", "", 0);
	}
	public Vehicle(String makeModel, String name, int num) {
		setMakeModel(makeModel);
		setDriver(new Driver(name, num));
	}
	
	public String getMakeModel() {
		return makeModel;
	}
	public Driver getDriver() {
		return driver;
	}
	public double calcTax() {
		return roadTax * 0.1;
	}
	
	public void setMakeModel(String mModel) {
		makeModel = mModel;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public void setRoadTax(double tax) {
		roadTax = tax;
	}

	public String toString() {
		return "Vehicle:-\nMake: " + getMakeModel() + getDriver();
	}
}
