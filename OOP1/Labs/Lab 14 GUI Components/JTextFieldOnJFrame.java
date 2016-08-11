//JTextFieldOnJFrame.java
/*This program shows a JTextField being used to retrieve some information from the user*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextFieldOnJFrame {
	JTextField jTextField;
	
	public JTextFieldOnJFrame()
		{
			JFrame jFrameWindow = new JFrame("Adding a JTextField JFrame");
			
			FlowLayout flowLayout = new FlowLayout();
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setSize(350,100);
			jFrameWindow.setLocation(500,400);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel jLabel = new JLabel("Please enter your name: ");
			jFrameWindow.add(jLabel);
			
			jTextField = new JTextField(15);
			jFrameWindow.add(jTextField);
			
			TextFieldEventHandler handler = new TextFieldEventHandler();
			
			jTextField.addActionListener(handler);
			
			jFrameWindow.setVisible(true);
		}	
	public static void main(String args[])
		{
			JTextFieldOnJFrame guiApp = new JTextFieldOnJFrame();	
		}
	private class TextFieldEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e)
			{
				String name = jTextField.getText();
				
				JOptionPane.showMessageDialog(null,"Your name is " + name,"",
				JOptionPane.INFORMATION_MESSAGE);
			}
	}
}