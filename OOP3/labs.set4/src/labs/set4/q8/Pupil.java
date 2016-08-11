package labs.set4.q8;

public abstract class Pupil implements Child {
	protected String name;
	protected String address;
	protected String dateOfBirth;
	private String school;
	private String className;
	
	public Pupil() {
		super();
		//setName("Unknown");
		//setAddress("Unknown");
		//setDOB("Unknown");
		//setSchool("Unknown");
		//setClassName("Unknown");
	}
	public Pupil(String n, String a, String dob, String s, String c) {
		setName(n);
		setAddress(a);
		setDOB(dob);
		setSchool(s);
		setClassName(c);
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getDOB() {
		return dateOfBirth;
	}  
	public String getSchool() {
		return school;
	}
	public String getClassName() {
		return className;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDOB(String dob) {
		this.dateOfBirth = dob;
	}
	public void setSchool(String school) {
		this.school = school;
	}	
	public void setClassName(String c) {
		className = c;
	}

/*	
	public abstract String getName();
	public abstract String getAddress();   //COULD HAVE BEEN PASSED ON AGAIN AND IMPLEMENTED THEN
	public abstract String getDOB();
	public abstract String setName();
	public abstract String setAddress();
	public abstract String setDOB();
*/	
	public abstract String getCategory();
	
	public String toString() {
		return "\nPupils Name: " + getName() + "\nAddress: " + getAddress() +
			   "\nDoB: " + getDOB() + "\nClass: " + getClassName() +
			   "\nSchool: " + getSchool() + "\nCategory: " + getCategory();
	}

}
