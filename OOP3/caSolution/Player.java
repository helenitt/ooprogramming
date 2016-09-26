package com.walsh.ca16;

public abstract class Player implements Person  {

		protected String name;
		protected int age;
		
	public Player() {
		this ("Unknown",0);
	}

	public abstract String getName();
	public abstract int getAge();
	public abstract void setName(String name);
	public abstract void setAge(int age);
	
	public Player(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString(){
		return "Name" + getName()+"Age"+getAge();
	}
}
