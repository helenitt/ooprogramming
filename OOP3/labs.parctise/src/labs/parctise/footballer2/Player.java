package labs.parctise.footballer2;

public abstract class Player implements Person {
	protected String name;
	protected int age;
	
	public Player() {
		this("U", 0);
	}
	public Player(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract String getName();
	public abstract int getAge();
	public abstract void setName(String name);
	public abstract void setAge(int age);
	
	public String toString() {
		return "\nName: " + getName() + "\nAge: " + getAge();
	}
}
