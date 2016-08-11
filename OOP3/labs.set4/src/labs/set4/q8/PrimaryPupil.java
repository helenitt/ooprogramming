package labs.set4.q8;

public class PrimaryPupil extends Pupil {
	private String teacherName;
	
	public PrimaryPupil() {
		super("U","U","U","U","U");
		setTeacherName("U");
	}
	public PrimaryPupil(String n, String a, String dob, String s, String c, String t) {
		super(n,a,dob,s,c);
		setTeacherName(t);
	}
	

	public String getTeacherName() {
		return teacherName;
	}
	public String getCategory() {
		return "Primary Pupil";		
	}

	public void setTeacherName(String tName) {
		teacherName = tName;
	}
	
	public String toString() {
		return getCategory() + super.toString() + "\nTeacher: " + getTeacherName() + "\n";
	}
}
