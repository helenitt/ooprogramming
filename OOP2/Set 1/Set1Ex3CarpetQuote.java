//Set1Ex3CarpetQuote.java
/*This program calculates the cost of carpeting a room wall to wall
 *from values entered by the user.
 *Input dialogs, printf() and String.format(). */

import javax.swing.*;
import java.awt.*;

public class Set1Ex3CarpetQuote {
	public static void main(String[] args) {
		
		String name;
		float length, breadth, area, costPerMetre, total;
		
		JTextArea output = new JTextArea();
		Font monoFont = new Font("Courier",Font.PLAIN,14);
		output.setFont(monoFont);
		
		//INPUT
		name = JOptionPane.showInputDialog("Please enter your name:");
		length = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of room:"));
		breadth = Float.parseFloat(JOptionPane.showInputDialog("Please enter the breadth of room:"));
		costPerMetre = Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost per metre squared:"));
	
		//Set the heading for the text area
		output.setText("\n Quotation for " + name + ":-\n");
		
		//PROCESSING
		area = length*breadth;
		total = area*costPerMetre;
		
		//OUTPUT
		output.append(String.format("%-40s"," Length of room: ") + String.format("%.2f",length) + " m \n");
		output.append(String.format("%-40s"," Breadth of room: ") + String.format("%.2f",breadth) + " m \n");
		output.append(String.format("%-40s"," Total area of room: ") + String.format("%.2f",area) + " sq. m \n");
		output.append(String.format("%-40s"," Cost per square metre of carpet: ") + String.format("%.2f",costPerMetre) + " euro  \n");
		output.append(String.format("%-40s"," Total cost of carpet: ") + String.format("%.2f",total) + " euro \t\n");
		
		JOptionPane.showMessageDialog(null,output);
		
		System.exit(0);	
	}
}