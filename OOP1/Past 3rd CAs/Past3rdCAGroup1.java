//Past3rdCAGroup1.java
/**/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Past3rdCAGroup1 {
	JTextField captchaField;
	JLabel captchaLabel;
	
	public Past3rdCAGroup1()
		{
			JFrame jFrameWindow = new JFrame("Captcha Generator");
			
			FlowLayout flowLayout = new FlowLayout();
			
			jFrameWindow.setLayout(flowLayout);
			jFrameWindow.setSize(315,100);
			jFrameWindow.setLocation(500,200);
			jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JButton captchaButton = new JButton("Generate Captcha");
			jFrameWindow.add(captchaButton);
			captchaLabel = new JLabel("No Captcha yet generated");
			jFrameWindow.add(captchaLabel);
			
			JLabel promptLabel = new JLabel("Enter Captcha");
			jFrameWindow.add(promptLabel);
			captchaField = new JTextField(10);
			jFrameWindow.add(captchaField);
			
			EventHandler handler = new EventHandler();
			
			captchaButton.addActionListener(handler);
			captchaField.addActionListener(handler);
			
			jFrameWindow.setVisible(true);
		}
	public static void main(String args[])
		{
			Past3rdCAGroup1 guiApp = new Past3rdCAGroup1();
		}
	private class EventHandler implements ActionListener {
		public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == captchaField)
					{
						if(captchaLabel.getText().equals(captchaField.getText()))
							JOptionPane.showMessageDialog(null,"Your input matches the captcha perfectly!",
							"Valid!",JOptionPane.INFORMATION_MESSAGE);
						else
							JOptionPane.showMessageDialog(null,"Your input does not match the captcha perfectly!",
							"Invalid!",JOptionPane.ERROR_MESSAGE);
					}
				else
					{
						String captchaString="";
						
						for(int i=0; i<=10; i++)
							{
								int randomNum = (int)(Math.random()*75) + 48;
								
								while(randomNum>57&&randomNum<65 || randomNum>90&&randomNum<97)
									randomNum = (int)(Math.random()*75) + 48;
									
								captchaString += (char)randomNum;
							}
							
						captchaLabel.setText(captchaString);
					}
			}
	}	
}