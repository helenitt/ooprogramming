//Q3Days.java
/*This program sets up the names of the days of the week as an array of
Strings as follows: String [] days = {“Monday”, “Tuesday”, ……….}; The
program should allow the user to enter a day number between 1 and 7, and display the
corresponding day name in a dialog. The day number should be used as an index into the
days array (see the slide titled Arrays of String labels, slide 40, in your notes for
section 5). You do not need a switch or if-else construction in this program. When you
have it working, add a loop controlled by sentinel so that it repeats until you enter a day
number of 0.*/

import javax.swing.*;

public class Q3Days {
	public static void main(String[] args) {
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number for a day of the week: "));
		
		if(num>=1 && num<=7) { 
			while(num != 0) {
			
				JOptionPane.showMessageDialog(null,"That number corresponds to: \n\n" + days[num-1]);
			
				num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number for a day of the week: "));		
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"Your number must be between 1 and 7");
				
			num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number for a day of the week: "));	
		}		
	}
}