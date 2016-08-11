//Ex6.java
/**/

import javax.swing.*;
import java.awt.*;

public class Ex6 {
	public static void main(String args[])
		{
			JFrame jFrameWindow = new JFrame("Adding a JLabel to a JFrame");
			
			FlowLayout flowLayout = new FlowLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setSize(300,100);
			jFrameWindow.setLocation(400,200);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel jLabel = new JLabel("Java rules!");
			jLabel.setForeground(Color.RED);
			jLabel.setToolTipText("A Very important fact!");			
			
			jFrameWindow.add(jLabel);
			jFrameWindow.setVisible(true);
			
			int choice = JOptionPane.showConfirmDialog(null,"Do you wish to " + 
			"remove the JLabel from the JFrame?");
			
			if(choice == JOptionPane.YES_OPTION)
				{
					jFrameWindow.remove(jLabel);
					jFrameWindow.repaint();
				}
		}
}