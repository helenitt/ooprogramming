package labs.parctise.vehicle;

public class Driver {
	private int driverNum;
	private String driverName;
	
	public Driver() {
		this(0, "Unknown");
	}
	public Driver(int dNum, String dName) {
		driverNum = dNum;
		driverName = dName;
	}
	
	public int getDriverNum() {
		return driverNum;
	}
	public String getDriverName() {
		return driverName;
	}
	
	public void setDriverNum(int dNum) {
		driverNum = dNum;
	}
	public void setDriverName(String dName) {
		driverName = dName;
	}
	
	public String toString() {
		return String.format("\nDriver: Number %d, Name %s", getDriverNum(), getDriverName());
	}
}
