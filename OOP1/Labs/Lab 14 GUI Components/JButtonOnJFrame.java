//JButtonOnJFrame.java
/*This program shows a JButton being used to submit the details entered by a 
 *user. The user can submit many sets of details and when finished inputting, 
 *some processing occurs before displaying the results. There is some input 
 *validation involved in the application also*/
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 
 public class JButtonOnJFrame {
 	
 	JTextField nameField;
 	JTextField ageField;
 	JFrame jFrameWindow;
 	String nameOldest;
 	int totalProcessed=0, totalAge=0, oldestAge=0;
 	
 	public JButtonOnJFrame()
	 	{
	 		jFrameWindow = new JFrame("Enter Details");
	 		
	 		FlowLayout flowLayout = new FlowLayout();
	 		
	 		jFrameWindow.setLayout(flowLayout);
	 		jFrameWindow.setSize(250,150);
	 		jFrameWindow.setLocation(500,200);
	 		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 		
	 		JLabel nameLabel = new JLabel("Name: ");
	 		jFrameWindow.add(nameLabel);
	 		nameField = new JTextField(15);
	 		jFrameWindow.add(nameField);
	 		
	 		JLabel ageLabel = new JLabel("Age: ");
	 		jFrameWindow.add(ageLabel);
	 		ageField = new JTextField(15);
	 		jFrameWindow.add(ageField);
	 		
	 		JButton submitButton = new JButton("Submit");
	 		jFrameWindow.add(submitButton);
	 		ButtonEventHandler handler = new ButtonEventHandler();
	 		submitButton.addActionListener(handler);
	 		
	 		jFrameWindow.setVisible(true);
	 	}
	public static void main(String args[])
		 {
		 	JButtonOnJFrame guiApp = new JButtonOnJFrame();
		 }
	private class ButtonEventHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
			{
				String name, ageAsString;
				int age=0, choice;
				float averageAge;
				
				name = nameField.getText();
				
				if(!name.equals(""))
					{
						ageAsString = ageField.getText();
						age = Integer.parseInt(ageAsString);
						totalAge += age;
						totalProcessed++;
						
						if(age > oldestAge)
							{
								oldestAge = age;
								nameOldest = name;
							}
					}
				nameField.setText("");
				ageField.setText("");
				
				choice = JOptionPane.showConfirmDialog(null,"Anymore Details?","",
						 JOptionPane.YES_NO_OPTION);
				
				if(choice == JOptionPane.NO_OPTION)
					{
						jFrameWindow.setVisible(false);
						if(totalProcessed !=0)
							{
								averageAge = (float)totalAge/totalProcessed;
								JOptionPane.showMessageDialog(null,"Average age: " +
								averageAge + "\nOldest person: " + nameOldest,"Statistics",
								JOptionPane.INFORMATION_MESSAGE);
							}
						else
							{
								JOptionPane.showMessageDialog(null,"You entered no details" +
								"\nThankyou for using the system - goodbye!","Statistics",
								JOptionPane.INFORMATION_MESSAGE);
							}
						System.exit(0);
					}
			}
	}
 }