
public class Lorry extends Vehicle {
	
	public Lorry(String makeModel, String name, int num) {
		super(makeModel, name, num);
		
	}

	public void setRoadTax(double rate) {
		roadTax+=(0.1*roadTax);
		
	}

	public double calcTax() {
		return roadTax;
	}

}
