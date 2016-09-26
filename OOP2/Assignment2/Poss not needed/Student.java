//Student.java
/*An Instantiable class to model a student*/

public class Student {
	private String name;
	private int studId;
	private String module;
	
	//Constructors
	public Student(String name, int studId, String module) {
		this.name = name;
		this.studId = studId;
		this.module = module;
	}
	public Student() {
		this("Unknown",0,"Unknown");
	}
	//Accessors
	public String getName() {
		return name;
	}
	public int getStudId() {
		return studId;
	}
	public String getModule() {
		return module;
	}	
	//Mutators
	public void setName(String name) {
		this.name = name;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public void setModule(String module) {
		this.module = module;
	}
	//toString
	public String toString() {
		return String.format("%s%s\n%s%d\n%s%s","Name: ",getName(),
					   	     "Student Id: ",getStudId(),"Module: ",getModule());
	}		
}