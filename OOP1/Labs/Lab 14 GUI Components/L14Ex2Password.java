//L14Ex2Password.java
/**/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class L14Ex2Password {
	JTextField usernameField;
	JPasswordField passwordField;
	
	public L14Ex2Password() 
		{
			JFrame jFrameWindow = new JFrame("Authentication");
			
			FlowLayout flowLayout = new FlowLayout();
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setSize(400,100);
			jFrameWindow.setLocation(500,200);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel usernameLabel = new JLabel("Username: ");
			jFrameWindow.add(usernameLabel);
			usernameField = new JTextField(10);
			jFrameWindow.add(usernameField);
			
			JLabel passwordLabel = new JLabel("Password: ");
			jFrameWindow.add(passwordLabel);
			passwordField = new JPasswordField(10);
			jFrameWindow.add(passwordField);
			
			TextFieldEventHandler handler = new TextFieldEventHandler();
			
			usernameField.addActionListener(handler);
			passwordField.addActionListener(handler);
			
			jFrameWindow.setVisible(true);
		} 
	public static void main(String args[])
		{
			L14Ex2Password guiApp = new L14Ex2Password();	
		}
	private class TextFieldEventHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == usernameField)
					{
						passwordField.requestFocus();	
					}
				if(e.getSource() == passwordField)
					{
						char[] passwordCharacters = passwordField.getPassword();
						
						String passwordText = new String(passwordCharacters);
						
						if(usernameField.getText().equals("Helen") &&
						   passwordText.equals("123"))
							   	JOptionPane.showMessageDialog(null,"Welcome to the system " +
								usernameField.getText(),"Authenticated",
								JOptionPane.INFORMATION_MESSAGE);
						else
								JOptionPane.showMessageDialog(null,"Invalid username/password " +
								"combination","Not authenticated",JOptionPane.INFORMATION_MESSAGE);
					}
			}
	}
}