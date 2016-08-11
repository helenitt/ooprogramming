package labs.set4.samplePrograms;

/* Question 7 Add Cylinder to the System */

public class Cylinder extends Circle {
	private int height;
	private final double PI = 3.14;
	
	public Cylinder() {
		super(0);
		height = 0;
	}
	public Cylinder(double r, int h) {
		super(r);
		height = h;
	}
	public Cylinder(double r, int a, int b, int h) {
		super(r, a, b);
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		
	}
	public String getName(){
		 return "Cylinder";
}
	public double getVolume() {
		 return PI * (radius*radius) * height;
	}
	public String toString() {
		return " Volume of Cylinder is " + getVolume();
	}
}
