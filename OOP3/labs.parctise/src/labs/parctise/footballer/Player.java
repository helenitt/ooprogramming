package labs.parctise.footballer;

public abstract class  Player implements Person {
	protected String name;
	protected int age;
	
	public Player() {
		this("Unknown", 0);
	}
	public Player(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public abstract String getName();
	public abstract int getAge();
	public abstract void setName(String name);
	public abstract void setAge(int age);
	
	public String toString() {
		return String.format("Name: %s \nAge: %d", getName(), getAge());
	}
}
