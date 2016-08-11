package q0;

public class Person {
	
	public String name;
	public int age;
	
	public Person(String name, int age){
		setName(name);
		setAge(age);
	}

	private void setAge(int age) {
		this.age = age;		
	}

	private void setName(String name) {
		this.name = name;		
	}
	
}

