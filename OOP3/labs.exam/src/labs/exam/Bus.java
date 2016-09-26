package labs.exam;

public class Bus {
	private String id;
	
	public Bus() {
		super();
	}
	public Bus(Vehicle id, int passNum) {
		super(id, passNum);
	}
	
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
}
