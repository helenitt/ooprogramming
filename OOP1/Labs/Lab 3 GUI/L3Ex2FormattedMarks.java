//L3Ex2FormattedMarks.java
/*program that uses a counter-controlled while loop to read in the
 * name, t-number, course and the average mark of exactly 5 students. 
 *The details should then be displayed formatted, in a Text Area, within 
 *a JOption Pane*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class L3Ex2FormattedMarks {
	public static void main(String args[])
		{
			String name, tNumber, course, markAsString, results="";
			float mark;
			int i=0;
			
			JTextArea textArea = new JTextArea(10,30);
	 		
	 		Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
	 		textArea.setFont(textAreaFont);
	 		
	 		textArea.setText(String.format("%-24s%-14s%-27s%s\n%-24s%-14s%-27s%s\n\n",
	 									   "Name","T-Number","Course","Avg Mark",
	 									   "====","========","======","========"));	 		
			
			while(i<5)
				{
					name = JOptionPane.showInputDialog("Please enter your name: ");
					results += name + ", ";
					tNumber = JOptionPane.showInputDialog("Please enter your T-Number: ");
					results += tNumber + ", ";
					course = JOptionPane.showInputDialog("Please enter your course: ");
					results += course + ", "; 
					markAsString = JOptionPane.showInputDialog("Please enter your average mark: ");
					mark = Float.parseFloat(markAsString);
					results += mark + ",\n";
					
					textArea.append(String.format("%-24s%-14s%-27s%.2f\n",name,tNumber,course,mark));
					
					i++;				
				}
			JOptionPane.showMessageDialog(null,textArea,"Formatted Data",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}
}