package labs.exam;

public abstract class Vehicle implements IDable {
	private String type;
	private int passengerNum;
	protected static int num;
	
	public Vehicle() {
		this("", 0);
	}
	public Vehicle(String type, int passNum) {
		this.type = type;
		passengerNum = passNum;
		num++;
	}
	
	public String getType() {
		return type;
	}
	public int getPassengerNum() {
		return passengerNum;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void setPassnegerNum(int num) {
		passengerNum = num;
	}
	
	public abstract String getID();
	public abstract void setID(String id);
	
	public String toString() {
		return "Vehicle Type: " + getType() + "\nNumber of Passengers: " + getPassengerNum();
	}
}
