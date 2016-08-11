package labs.parctise.computer;

public class Computer implements IDable, Comparable<Computer> {
	private String id;
	private String make;
	protected Memory memory;
	
	public Computer() {
		make = "";
		memory = null;
	}
	public Computer(String id, String make, String memType, int memSize) {
		setID(id);
		setMake(make);
		setMemory(new Memory(memType, memSize));
	}
	
	public String getId() {
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
	public void setMemory(Memory mem) {
		memory = mem;
	}
	
	public int compareTo(Computer c) {
		return this.getId().compareTo(c.getId());
	}
	
	public String toString() {
		return "\nComputer: \nMake: " + getMake() + 
			   "\n" + getMemory() + "\nId: " + getId() + "\n";
	}
}
