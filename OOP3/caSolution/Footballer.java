package com.walsh.ca16;

public class Footballer extends Player {

	public Footballer()  {
		super();
	}

	public Footballer(String name, int age)  {
		super(name,age);
	}
	@Override
	public void setname(String name) {
		this.name=name;
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

	@Override
	public void setAge(int age) {
		this.age=age;
		
	}
	
	public String toString(){
		return super.toString();
	}

}
