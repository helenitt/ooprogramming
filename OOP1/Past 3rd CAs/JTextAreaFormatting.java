//JTextAreaFormatting.java
/**/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class JTextAreaFormatting {
	public static void main(String args[])
		{
			int i=1;
			
			double squareRoot, cubedRoot;
			
			JTextArea textArea = new JTextArea(14,30);
			
			Font textAreaFont = new Font("monospaced",Font.PLAIN_12);
			textArea.setFont(textAreaFont);
			
			textArea.setText(String.format("%-10s%-10s%-10s\n","Number","Sq Root","Cb Root"));
			
			while(i <= 100)
				{
					squareRoot = Math.sqrt(i); 
					cubedRoot = Math.cbrt(i);
					
					textArea.append(String.format("%-10d%-10.3f%-10.3f\n",i,squareRoot,cubedRoot));
					
					not finished!!!
				} 
		}
}