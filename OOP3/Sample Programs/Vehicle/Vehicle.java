

public  abstract class Vehicle implements Taxable {
	
	private String makeModel;
	private Driver driver;
	protected double roadTax;	
	
	public Vehicle(String makeModel, String name,int num){
		setMakeModel(makeModel);
		setDriver(new Driver(name,num));
	}
	
	
	private String getMakeModel() {
		return makeModel;
		
	}
	private void setMakeModel(String make) {
		this.makeModel=make;
		
	}

	public String toString(){
		return "Vehicle Make: " + getMakeModel() +driver.toString();
	}

	
	public abstract void setRoadTax(double tax);


	public abstract double calcTax();


	public Driver getDriver() {
		return driver;
	}


	public void setDriver(Driver driver) {
		this.driver = driver;
	}


	
}
