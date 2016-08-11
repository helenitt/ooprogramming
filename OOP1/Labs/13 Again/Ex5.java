//Ex5.java
/**/

import javax.swing.*;
import java.awt.*;

public class Ex5 {
	public static void main(String args[])
		{
			JFrame jFrameWindow = new JFrame("Adding a JLabel to a JFrame");
			
			FlowLayout flowLayout = new FlowLayout();
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setSize(300,100);
			jFrameWindow.setLocation(500,300);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel jLabel = new JLabel("Java rules!");			
			
			jFrameWindow.add(jLabel);
			jFrameWindow.setVisible(true);
		}
}