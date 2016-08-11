package labs.ca1;

/* An instantiable class to model a player*/

public abstract class Player implements Person {
	protected String name;
	protected int age;

	public Player() {
		setName("U");
		setAge(0);
	}
	public Player(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public String toString() {
		//return String.format("Player:\nName: %s\nAge: %d", getName(), getAge());
		return "Player:\nName: " + getName() + "\nAge: " + getAge();
	}
}
