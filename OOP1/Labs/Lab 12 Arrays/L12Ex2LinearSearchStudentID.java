//L12Ex2LinearSearchStudentID.java
/**/

import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class L12Ex2LinearSearchStudentID {
	public static void main(String args[])
		{
			int studID[] = new int[2];
			float heights[] = new float[2];
			char grades[] = new char[2];
			
			populateArrays(studID,heights,grades);
			
			displayTable(studID,heights,grades);
			
			linearSearch(studID,heights,grades);
			
			System.exit(0);
		}
	public static void populateArrays(int id[],float h[],char g[])
		{
			String idAsString, hAsString, gAsString;
			
			for(int i=0; i<id.length; i++)
				{
					idAsString = JOptionPane.showInputDialog("Please enter Student " + (i+1) + "'s ID: ");
					hAsString = JOptionPane.showInputDialog("Please enter Student " + (i+1) + "'s Height: ");
					gAsString = JOptionPane.showInputDialog("Please enter Student " + (i+1) + "'s Grade: ");
					
					id[i] = Integer.parseInt(idAsString);
					h[i] = Float.parseFloat(hAsString);	
					g[i] = gAsString.charAt(0);
				}
		}		
	public static void displayTable(int id[],float h[],char g[])		
		{
			Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
			JTextArea textArea = new JTextArea(14,20);
			String text = String.format("%-15s%-10s%s\n%-15s%-10s%s\n","Student ID","Height","Average Grade",
										"~~~~~~~~","~~~~~","~~~~~~~~~~~");
			
			for(int i=0; i<id.length; i++)
				text +=	String.format("%-15d%-10.2f%s\n",id[i],h[i],g[i]);
				
			textArea.append(text);
			
			JOptionPane.showMessageDialog(null,textArea,"All Student Details",JOptionPane.PLAIN_MESSAGE);
		}
	public static void linearSearch(int id[],float h[],char g[])
		{
			String keyAsString;
			int key;
			
			keyAsString = JOptionPane.showInputDialog("Please enter the ID of the student you seek: ");
			key = Integer.parseInt(keyAsString);
			
			for(int j=0; j<id.length; j++)
				{
					if(id[j]!=key)
						JOptionPane.showMessageDialog(null,"The details of the student are as follows:" +
												      "\nID number ........ " + id[j] +
												      "\nHeight ................. " + h[j] +
												      "\nAverage Grade .. " + g[j],"Search Results",JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null,"Sorry - the Student ID you seek " + key + " has not been found",
													  "Search Results",JOptionPane.INFORMATION_MESSAGE);	
				}
		}
}