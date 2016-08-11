//EX4FirstJFrame.java
/**/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EX4FirstJFrame {
	public static void main(String args[])
		{
		 	JFrame jFrameWindow = new JFrame();
		 	String titleText;
		 	
		 	jFrameWindow.setTitle("Exercise 4");
		 	jFrameWindow.setSize(250,250);
		 	jFrameWindow.setLocation(150,150);
		 	jFrameWindow.setVisible(true);
		 	jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 	
		 	titleText = jFrameWindow.getTitle();
		 	
		 	JOptionPane.showMessageDialog(null,"Title obtatined from title bar text\n\n\"" +
		 								  titleText + "\"","Title Bar Text",JOptionPane.PLAIN_MESSAGE);		
		}
}