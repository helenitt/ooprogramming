//CA3rdAmended.java
/**/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CA3rdAmended {
	//Global var
	JTextField nameField;
	
	public CA3rdAmended()
		{
			JFrame jFrameWindow = new JFrame("Name Analyser");
			
			FlowLayout flowLayout = new FlowLayout();
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setSize(250,75);
			jFrameWindow.setLocation(500,300);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JLabel nameLabel = new JLabel("Name: ");
			jFrameWindow.add(nameLabel);
			nameField = new JTextField(15);
			jFrameWindow.add(nameField);
			
			TextFieldEventHandler handler = new TextFieldEventHandler();
			
			//set actionListener
			nameField.addActionListener(handler);
						
			jFrameWindow.setVisible(true);
		}
	public static void main(String args[])
		{
			CA3rdAmended guiApp = new CA3rdAmended();	
		}
	private class TextFieldEventHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e)
			{
				String name, longestName, shortestName;
				int option, count=1;
				
				name = nameField.getText();
				longestName = name;
				shortestName = name;
				
				option = JOptionPane.showConfirmDialog(null,"Do you wish to enter another name?",
						 							   "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
				
				while(option == 0)
					{
						name = nameField.getText();
						
						if(name.length() > longestName.length())
							longestName = name;
						else if(name.length() < shortestName.length())
							shortestName = name;
						
						count++;
					}
					
				JOptionPane.showMessageDialog(null,"Number of names entered: " + count +
											  "\nLongest name entered: " + longestName +
											  "\nShortest name entered: " + shortestName,
						 					  "Name Stats",JOptionPane.INFORMATION_MESSAGE);
				
				System.exit(0);
			}
	}
}

