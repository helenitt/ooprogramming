//Person.java
/*A nested class to represent the characteristics of a person*/

public class Person {
	private String name;
	private int age;
	private char gender;
	
	
	//Accessors
	public String getName() { return name; }
	
	public int getAge() { return age; }
	
	public char getGender() { return gender; }
	
	//Mutators
	//Set Person I think
	public void setOwner(String name, int age, char gender) {
		setName(name);
		setAge(age);
		setGender(gender);
	}
	//Mutators - tied to this class
	private void setName(String name) {
		this.name = name;
	}
	private void setAge(int age) {
		this.age = age;
	}
	private void setGender(char gender) {
		this.gender = gender;
	}
	
	//Constructors
	public Person() { 
		this("No Owner Specified", 0, 'n');
	}
	public Person(String name, int age, char gender) {
		setName(name);
		setAge(age);8
		setGender(gender);
	}
	
	//toString
	public String toString() {
		return String.format(getName() + " " + getAge() + " " + getGender());
	}
	
}