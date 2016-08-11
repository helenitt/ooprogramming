package labs.set4.q8;

import java.util.LinkedList;
import javax.swing.*;

public class Driver {
	public static void main(String[] args) {
		
		Child c;
		PrimaryPupil pp;
		SecondaryPupil sp;
		LinkedList<String> subjects;
		
		String name, address, dateOfBirth, school, className, level, teacher = "";
		
		name = JOptionPane.showInputDialog("Name: ");		
		address = JOptionPane.showInputDialog("Address: ");
		dateOfBirth = JOptionPane.showInputDialog("Date of Birth: ");
		school = JOptionPane.showInputDialog("School: ");
		className = JOptionPane.showInputDialog("Class: ");
		
		level = JOptionPane.showInputDialog("Primary or Secondary: p/s");
		
		if(level.equals("p")) {
			teacher = JOptionPane.showInputDialog("Teacher: ");
			pp  = new PrimaryPupil(name, address, dateOfBirth, school, className, teacher);
			c = pp;
		}
		else {
			subjects = new LinkedList<>();
			sp  = new SecondaryPupil(name, address, dateOfBirth, school, className, subjects);
			sp.setSubjects();
			c = sp;
		}
		
		JOptionPane.showMessageDialog(null, c.toString());
	}
}
