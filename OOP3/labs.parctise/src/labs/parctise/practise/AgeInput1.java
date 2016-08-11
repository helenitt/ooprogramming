package labs.parctise.practise;

//This program crashes
// checked exception = compiler
// unchecked exception = typing in num instead of string run time exception

import javax.swing.*;
public class AgeInput1 {
	public static void main(String[] args) {
		String inputStr = JOptionPane.showInputDialog(null, "Enter Age: ");
		int age;
		
		/* First simple go that crashes
		age = Integer.parseInt(inputStr);
		
		System.out.println(age);
		*/
		
		try {
			age = Integer.parseInt(inputStr);
			
			JOptionPane.showMessageDialog(null, "Age" + age);
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "'" + inputStr + "' invalid! Numbers only");
			//e.printStackTrace()
		}
		finally {
			JOptionPane.showMessageDialog(null, "Finally always executes!");
		}
	}
}
