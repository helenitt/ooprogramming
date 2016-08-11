//MarksArray.java
/*This program reads in the examination marks of 10 students, determines and 
 *outputs the average mark and outputs all the marks above the average*/
 
import javax.swing.JOptionPane;

public class MarksArray {
	public static void main(String args[])
		{
			int marks[] = new int[10];
			int total=0, i;
			String text, markAsString;
			double average;
			
			for(i=0; i<marks.length; i++)
				{
					markAsString = JOptionPane.showInputDialog("Please enter mark for student " + (i+1));
					marks[i] = Integer.parseInt(markAsString);
					total += marks[i];	
				}
			
			average = (double)total/marks.length;
				
			JOptionPane.showMessageDialog(null,"The average mark is " + String.format("%.2f",average),
										  "Average Marks",JOptionPane.INFORMATION_MESSAGE);
			
			text = "List of marks above the average is: \n\n";
			
			for(i=0; i<marks.length; i++)
				if(marks[i] > average)
					text += marks[i] + ", ";
					
			JOptionPane.showMessageDialog(null,text,"Marks Above Average",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);	
		}
} 