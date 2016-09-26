//ValidatePasswordModified.java
/*This program will read in the username and password combinations of 5 
 *people. Each password must be fully validated*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class ValidatePasswordModified {
	public static void main(String args[])
		{
			String name, password, list="";
			boolean valid;
			int digitCount=0, j;
			
			JTextArea textArea = new JTextArea();
			Font font = new Font("monospaced",Font.PLAIN,11);
			textArea.setFont(font);
			
			for(int i=1; i<=5; i++)
				{
					name = JOptionPane.showInputDialog("Please enter the username of person " + i);
					password = JOptionPane.showInputDialog("Please enter the password of person " + i);
					
					valid = false;
					
					while(!valid)
						{
							if(password.length()>=8 && password.length()<=15)
								{
									for(j=0; j<password.length(); j++) //just changed <= to < again here to stop going off the end of the string
										{
											if(Character.isDigit(password.charAt(j)) || Character.isLetter(password.charAt(j)))
												{
													if(Character.isDigit(password.charAt(j)))											
														{
															digitCount++;
														}	
													
												/*	if(j==password.length() && digitCount>=3) //logical error with this code here
														{
															valid = true;
															list += String.format("%-25s%s\n",name,password);
														}
													else
													{
														password = JOptionPane.showInputDialog("Invalid must contain more than 3 digits! Please enter the password of person " + i);
														break; //break you out of the for loop at this point to prevent logical error
													}*/
												}
											else
											{  
												password = JOptionPane.showInputDialog("Invalid letters and digits only! Please enter the password of person " + i);
												break; //break you out of the for loop at this point to prevent logical error
											}
											
										
											
										}
										
										if(j==password.length() && digitCount>=3) //must put it here instead
													{
														valid = true;
														list += String.format("%-25s%s\n",name,password);
													}
										else
													{
														password = JOptionPane.showInputDialog("Invalid must contain more than 3 digits! Please enter the password of person " + i);
														
													}
								}
							else
								password = JOptionPane.showInputDialog("Invalid password length! Please enter the password of person " + i);
								
							digitCount=0; //don't forget to reset this one to zero for next iteration of validation loop
						}
				}
				
			textArea.append("The valid username/password combinations are:\n\n" + list);
			
			JOptionPane.showMessageDialog(null,textArea,"Valid Combinations",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}
}
	 