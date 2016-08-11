//Set1Ex2ForLoopJTextArea.java
/*This program will display a table of yards and inches
 For loop and JTextArea*/

import javax.swing.*;
import java.awt.*;

public class Set1Ex2ForLoopJTextArea {
	public static void main(String[] args){
		
		int yard = 1, inches = 36;
		
		//Create a JTextArea called table
		JTextArea table = new JTextArea();
		
		//Set the heading for the text area
		table.setText("Yards     Inches\n-----        ------\n");
		
		//for loop to add lines of table                            
		for(int i=1;i<11;i++) {
			table.append("  " + yard + "            " + inches + "\n");
			yard++;
			inches *= 2;
		}
		
	JOptionPane.showMessageDialog(null,table,"Inches to Yards",JOptionPane.INFORMATION_MESSAGE);	
		
	System.exit(0);	
	}
}