package labs.parctise.computer2;

public class Laptop extends Computer {
	@SuppressWarnings("unused")
	private boolean touchscreen;
	
	public Laptop() {
		super("", "", "", 0);
	}
	public Laptop(String id, String make, String memType, int memSize) {
		super(id, make, memType, memSize);
	}
	
	public boolean isTouchscreen() {
		return true;
	}
	public void setTouchscreen(boolean tScreen) {
		touchscreen = true;
	}
	
	public String toString() {
		return "\nLaptop: true";
	}
}
