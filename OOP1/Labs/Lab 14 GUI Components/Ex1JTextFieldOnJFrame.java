//Ex1JTextFieldOnJFrame.java
/*This program shows a JTextField being used to retrieve some information from the user*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex1JTextFieldOnJFrame {
	JTextField jTextField;
	
	public Ex1JTextFieldOnJFrame()
		{
			JFrame jFrameWindow = new JFrame("Adding a JTextField JFrame");
			
			FlowLayout flowLayout = new FlowLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setSize(420,100);
			jFrameWindow.setLocation(500,300);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel jLabel = new JLabel("Please enter your address: ");
			jFrameWindow.add(jLabel);
			
			jTextField = new JTextField(20);
			jTextField.setForeground(Color.GREEN);			
			jFrameWindow.add(jTextField);
			
			TextFieldEventHandler handler = new TextFieldEventHandler();
			
			jTextField.addActionListener(handler);
			
			jFrameWindow.setVisible(true);
		}	
	public static void main(String args[])
		{
			Ex1JTextFieldOnJFrame guiApp = new Ex1JTextFieldOnJFrame();	
		}
	private class TextFieldEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e)
			{
				String address = jTextField.getText();
				
				JOptionPane.showMessageDialog(null,"Your address is " + address,"",
				JOptionPane.INFORMATION_MESSAGE);
			}
	}
}