package labs.set4.q8;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class SecondaryPupil extends Pupil {
	private LinkedList<String> subjects;
	
	String message = "\nSubjects: ", sub;
	
	public SecondaryPupil() {
		super("U","U","U","U","U");
		subjects = new LinkedList<String>();
	}
	public SecondaryPupil(String n, String a, String dob, String s, String c, LinkedList<String> subjects) {
		super(n,a,dob,s,c);	
		this.subjects = subjects;
	}
	public SecondaryPupil(String n, String a, String dob, String s, String c) {
		super(n,a,dob,s,c);	
		subjects = setSubjects();
	}
	
	public LinkedList<String> getSubjects() {
		return subjects;
	}
	
	
	public void setSubjects(LinkedList<String> subjects) {
		this.subjects = subjects;
	}
	
	public LinkedList<String> setSubjects() {
		int subNum = Integer.parseInt(JOptionPane.showInputDialog("Number of Subjects: "));
		
		for(int i=1; i <= subNum; i++) {
			sub = JOptionPane.showInputDialog("Subject no " + i + ": ");
			subjects.add(sub);
		}
		
		return subjects;
	}
	
	public String getCategory() {
		return "Secondary Pupil";
	}
	
	public String toString() {
		
		for(String s : subjects) {
			message += s + ", ";
		}
		
		return getCategory() + super.toString() + message + "\n";
	}
	
}
