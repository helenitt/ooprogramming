//JLabelOnJFrame.java
/**/

import javax.swing.*;
import java.awt.*;

public class JLabelOnJFrame {
	public static void main(String args[])
		{
			JFrame jFrameWindow = new JFrame();
			
			FlowLayout flowLayout = new FlowLayout();
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setTitle("Adding a JLabel to a JFrame");
			jFrameWindow.setSize(300,100);
			jFrameWindow.setLocation(500,300);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel jLabel = new JLabel();			
			jLabel.setText("Java rules!");
			
			jFrameWindow.add(jLabel);
			jFrameWindow.setVisible(true);
		}
}