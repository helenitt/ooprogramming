//L11Ex3MarksArrayModified.java
/*This program reads in the examination marks of 10 students, determines and 
 *outputs the average mark and outputs all the marks above the average.
 *It has now been modified to give the highest and lowest marks*/
 
import javax.swing.JOptionPane;

public class L11Ex3MarksArrayModified {
	public static void main(String args[])
		{
			int marks[] = new int[10];
			int total=0, i, highest=0, lowest=100;
			String text, text2, text3, markAsString;
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
			text2 = "The highest mark entered is: ";
			text3 = "\nThe lowest mark entered is: ";
			
			for(i=0; i<marks.length; i++)
				{
					if(marks[i] > average)
						text += marks[i] + ", ";
					if(marks[i] > highest)
						highest = marks[i];
					if(marks[i] < lowest)
						lowest = marks[i];
				}
					
			JOptionPane.showMessageDialog(null,text,"Marks Above Average",JOptionPane.INFORMATION_MESSAGE);
			
			JOptionPane.showMessageDialog(null,text2 + highest + text3 + lowest,"Highest/Lowest Marks",
										  JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);	
		}
}