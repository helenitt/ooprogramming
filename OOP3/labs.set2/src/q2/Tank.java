package q2;

public class Tank extends Vehicle {
	private boolean armoured;
	
	public Tank() {
		super();
		armoured = false;
	}
	public Tank(String mod, double pr, double lth, double wg, boolean armed) {
		super( mod, pr, lth, wg);
		setArmoured(armed);
	}
	
	public boolean isArmoured() {
		return armoured;
	}
	
	public void setArmoured(boolean a) {
		armoured = a;
	}
	
	public String toString() {
		return super.toString() + "\n" + isArmoured();
	}
}
