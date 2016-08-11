package Vehicle2;

public class Driver {
	private String driverName;
	private int driverNum;
	
	public Driver() {
		this("", 0);
	}
	public Driver(String name, int driverNum) {
		setDriverName(name);
		setDriverNum(driverNum);
	}
	
	public String getDriverName() {
		return driverName;
	}
	public int getDriverNum() {
		return driverNum;
	}
	
	public void setDriverName(String name) {
		driverName = name;
	}
	public void setDriverNum(int num) {
		driverNum = num;
	}
	
	public String toString() {
		return String.format("\nDriver: \nName: %s Number: %d " + 
							 getDriverName() + getDriverNum());
	}
}
