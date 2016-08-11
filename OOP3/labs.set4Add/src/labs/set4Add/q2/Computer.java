package labs.set4Add.q2;

public class Computer implements IDable, Comparable<Computer> {  //
	private String id;
	private String make;
	protected Memory memory;
	
	public Computer(String id, String make, String memType, int memSize) {
		setID(id);
		setMake(make);
		memory = new Memory(memType, memSize);
	}
	
	public String getId() {
		return id;
	}
	public String getMake() {
		return make;		
	}
	
	public void setID(String id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}

	
	public String toString() {
		return "Computer: \nId: " + getId() + "\nMake: " + getMake() + "\nMemory: " + memory.toString();
	}
	
	public int compareTo(Computer c) {
		return this.getId().compareTo(c.getId());
	}
}
