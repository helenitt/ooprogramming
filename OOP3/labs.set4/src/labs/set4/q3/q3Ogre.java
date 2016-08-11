package labs.set4.q3;

public class q3Ogre implements q3Enemy {
	private int size;
	private int strength;
	private String name;
	
	public q3Ogre() {
		size = 0;
		strength = 0;
	}
	public q3Ogre(int sz, int st, String nm) {
		size = sz;
		strength = st;
		name = nm;
	}
	
	public int getSize() {
		return size;
	}
	public int getStrength() {
		return strength;
	}
	
	public void setSize(int sz) {
		size = sz; 
	}
	public void setStrength(int st) {
		strength = st;
	}
	
	public String name() {
		return " called: " + name;
	}

	public int badness(int sz, int st) {
		return sz * st;
	}
	
	public String toString() {
		return "Ogres badness is: " + badness(size, strength) + name();
	}	
}
