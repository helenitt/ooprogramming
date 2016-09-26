//Group1Assess3Soln.java
/*This GUI program randomly generates a 10-character "captcha" and gets the user to enter what they see
 *generated. A message dialog then displays if there is a match between the 2 strings*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Group1Assess3Soln{

	JTextField captchaField;
	JLabel captchaLabel;
	
	public Group1Assess3Soln()
		{	 
			 JFrame jFrameWindow = new JFrame("Captcha Generator");
			 			 			 
			 FlowLayout flowLayout = new FlowLayout();
			 
		     jFrameWindow.setLayout(flowLayout);
		     		     	     		 
			 jFrameWindow.setSize(315,100);
			 
			 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
     		 JButton captchaButton = new JButton("Generate captcha");
     		 jFrameWindow.add(captchaButton);
     		 
     		 captchaLabel = new JLabel("No captcha yet generated"); 				 
 			 jFrameWindow.add(captchaLabel);
 			 	 	 
 			 JLabel promptLabel = new JLabel("Enter captcha:");				 
 			 jFrameWindow.add(promptLabel);
 			 
 			 captchaField = new JTextField(10); 			 		 
 			 jFrameWindow.add(captchaField);
 			 	 		 		 				 
			 EventHandler handler = new EventHandler();
			 
			 captchaField.addActionListener(handler);
			 captchaButton.addActionListener(handler);
			 			 	 	 
			 jFrameWindow.setVisible(true);
		}	
	
	public static void main(String args[])
		{	 		
			 Group1Assess3Soln guiApp = new Group1Assess3Soln();
		}	 	 			 
			 		
	private class EventHandler implements ActionListener{

		public void actionPerformed(ActionEvent e)
			{
				if(e.getSource()==captchaField)
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
						
						for(int i=1;i<=10;i++)
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






