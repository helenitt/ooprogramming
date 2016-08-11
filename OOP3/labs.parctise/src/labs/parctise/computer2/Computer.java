package labs.parctise.computer2;

public class Computer implements IDable, Comparable<Computer> {
	private String id;
	private String make;
	protected Memory memory;
	
	public Computer() {
		this( "", "", "", 0);
	}
	public Computer(String id, String make, String type, int size) {
		setID(id);
		setMake(make);
		memory = new Memory(type, size);
	}
	
	public int compareTo(Computer c) {
		return this.getID().compareTo(c.getID());
	}
	
	public String getID() {
		return id;
	}
	public String getMake() {
		return make;
	}
	public Memory getMemory() {
		return memory;
	}

	public void setID(String id) {
		this.id = id;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	
	public String toString() {
		return "\nComputer:- Id: " + getID() + " Make: " + getMake() + memory.toString();
	}
}
