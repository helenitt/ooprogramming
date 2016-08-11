//L13Ex5AdaptedJLabelOnJFrame.java
/**/

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class L13Ex5AdaptedJLabelOnJFrame {
	public static void main(String arg[])
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