package labs.set4Add.q2;

public class Memory {
	private String type;
	private int size;
	

	public Memory(String type, int size) {
		this.type = type;
		this.size = size;
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
		return "\n\nMemory: \nType: " + getType() + "\nSize: " + getSize();
	}
}
