package labs.parctise.computer;

public class Laptop extends Computer {
	private boolean touchScreen;
	
	public Laptop() {
		super("", "", "", 0);
	}
	public Laptop(String id, String make, String type, int size, boolean touchScreen) {
		super(id, make, type, size);
		this.touchScreen = touchScreen;
	}
	
	public boolean isTouchScreen() {
		return touchScreen;
	}
	public void setTouchScreen(boolean tScreen) {
		touchScreen = tScreen;
	}
	
	public String toString() {
		return super.toString() + "\nTouch screen: " + isTouchScreen();
	}
}
