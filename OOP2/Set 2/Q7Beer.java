//Q7Beer.java
/*An instanciable class about beer!*/

public class Q7Beer {
	private String bName;
	private double bAlCont;
	
	//constructors
	public Q7Beer() {
		this("Unknown",0.0);
	}
	public Q7Beer(String name, double alCont) {
		this.bName = name;
		this.bAlCont = alCont;	
	}
	
	//accessors
	public String getBName() {
		return bName;
	}
	public double getBAlCont() {
		return bAlCont;
	}
	
	//mutators
	public void setBName(String name) {
		this.bName = name;
	}
	public void setBAlCont(double alCont) {
		this.bAlCont = alCont;
	}
	
	//toString
	public String toString() {
		return String.format("Name: %s\nAlcohol Content: %.2f",bName,bAlCont);
	}
}