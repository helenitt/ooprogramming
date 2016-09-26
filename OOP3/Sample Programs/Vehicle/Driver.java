
public class Driver {
	private int driverNum;
	private String driverName;
	
	public Driver(String driverName,int driverNum){
		setDriverNum(driverNum);
		setDriverName(driverName);
	}
	
	public int getDriverNum() {
		return driverNum;
	}
	public void setDriverNum(int driverNum) {
		this.driverNum = driverNum;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	
	public String toString(){
		return "\nDriver Name: "+getDriverName()+"\nDriver Number: "+getDriverNum();
	}

}
