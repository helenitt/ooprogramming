//Interview.java
/*This programruns from the command line and generates a letter inviting a
person to attend for interview in a specific place on a specific day at a 
specific time. Your program should take in the person’s name, the place, 
the day and the time as 4 command-line arguments. The letter should be 
displayed in a dialog.*/

import javax.swing.*;

public class Interview {
	public static void main(String[] args) {
		
		/* STILL WOULDN'T WORK SO TRIED WITH SYS.O.P	
		System.out.print("\n\nDear " + args[0]);
		System.out.println(",\nYou are invited to attend an interview at " + args[1]);
		System.out.println("on " + args[2] + " at " + args[3] + ".\n\nYours expectantly,\n\nThe Boss\n\n");
		*/
		
		/* ADDED THIS COS IT WOULN'T WORK
		String name, place, day, time;
		
		name = JOptionPane.showInputDialog("Name: ");
		place = JOptionPane.showInputDialog("Place: ");
		day = JOptionPane.showInputDialog("Day: ");
		time = JOptionPane.showInputDialog("Time: ");  */
		
	 
		JOptionPane.showMessageDialog(null,"Dear " + args[0] + 
			        ",\nYou are invited to attend an interview at " + args[1] +
			        " on " + args[2] + " at " + args[3] + 
			        "\n\n Yours expectantly,\n\nThe Boss");	
	}
}
