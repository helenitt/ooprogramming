package labs.parctise.computer;

public class Memory {
	private String type;
	private int size;
	
	public Memory() {
		type = "";
		size = 0;
	}
	public Memory(String type, int size) {
		setType(type);
		setSize(size);
	}
	
	public String getType() {
		return type;
	}
	public int getSize() {
		return size;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public String toString() {
		return String.format("Memory:-\nType: %s, Size: %d", getType(), getSize());
	}
}
