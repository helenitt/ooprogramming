package labs.ca1;

/* An instantiable class to model a football player*/

public class Footballer extends Player {
	public Footballer() {
		super("U", 0);
	}
	public Footballer(String name, int age) {
		super(name, age);
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "\nTeam: " + super.toString();
	}
}
