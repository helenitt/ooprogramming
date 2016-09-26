
public class Bus extends Vehicle {
	

	private int maxPassengers;
	
		
	public Bus(String makeModel, String name, int num, int maxPassengers) {
		super(makeModel, name, num);
		this.maxPassengers=maxPassengers;
	}
	
	
	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}


	public void setRoadTax(double rate) {
		this.roadTax=rate;
		
	}

	public double calcTax() {
		return roadTax;
	}

	public String toString(){
		return super.toString()+"\nMaxPassengers: "+getMaxPassengers();
	}
	
}
