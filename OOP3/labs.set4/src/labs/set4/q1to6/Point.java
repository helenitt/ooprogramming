package labs.set4.q1to6;

public class Point implements Shape {
	private int x, y;
	
	public Point() {
		setPoint(0,0);
	}
	public Point(int a, int b) {
		setPoint(a,b);
	}
	
	public double area() {
		return 0.0;  // Must be provided but meaningless
	}
	public String getName() {
		return "Point"; // Do need this
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setPoint(int a, int b) {
		x = a;
		y = b;
	}
	
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}
