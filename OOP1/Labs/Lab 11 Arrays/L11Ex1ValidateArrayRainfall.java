//L11Ex1ValidateArrayRainfall.java
/*This program will use an array of 12 integer values to store the rainfall values 
 *for the 12 months of the year. It then checks to make sure the month*/

import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class L11Ex1ValidateArrayRainfall {
	public static void main(String args[])
		{
			int rainfall[] = {7,12,10,4,5,3,1,4,3,7,8,10};
			int month, i, janToJuneRainfall=0, winterRainfall, springRainfall;
			String text = "", monthAsString;
			boolean valid;
			
			Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
			JTextArea textArea = new JTextArea(14,20);
			
			textArea.setFont(textAreaFont);
			
			text += String.format("%-10s%-10s\n","Month","Rainfall");
			
			for(i=0; i<rainfall.length; i++)
				text += String.format("%-10s%-10s\n",(i+1),rainfall[i]);
			
			textArea.append(text);
			
			JOptionPane.showMessageDialog(null,textArea,"Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
			
			monthAsString = JOptionPane.showInputDialog("Please enter a month number (1-12) ");
			
			month = Integer.parseInt(monthAsString);
			
			valid = false;
	
			while(!valid)
				{
					if(month>=1 && month<=12)
						valid = true;
					else
						monthAsString = JOptionPane.showInputDialog("Invalid! Please re-enter a month number (1-12) ");
				}
							
			JOptionPane.showMessageDialog(null,"Rainfall for this month is: " + rainfall[month-1] +
			"mm","Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
			
			winterRainfall = rainfall[0] + rainfall[10] + rainfall[11];
			
			JOptionPane.showMessageDialog(null,"Total rainfall for the winter months is: " + winterRainfall +
			"mm","Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
			
			springRainfall = rainfall[1] + rainfall[2] + rainfall[3];
			
			JOptionPane.showMessageDialog(null,"Total rainfall for the spring months is: " + springRainfall +
			"mm","Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
			
			for(i=0; i<=5; i++)
				janToJuneRainfall += rainfall[i];
			
			JOptionPane.showMessageDialog(null,"Total rainfall form January to June is: " + janToJuneRainfall +
			"mm","Rainfall Stats", JOptionPane.PLAIN_MESSAGE);
				
			System.exit(0);
		}
}
