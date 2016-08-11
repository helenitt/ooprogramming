//L10Ex1TimeModified.java
/*This program reads in exactly 5 time values in the format hh:mm 
 *and validates them perfectly*/
 
import javax.swing.JOptionPane;

public class  L10Ex1TimeModified {
	public static void main(String args[])
		{
			String time;
			boolean valid;
			int i, hour=0, min;
			
			for(i=1; i<=5; i++)
				{
					time = JOptionPane.showInputDialog("Iteration " + i + " - Please enter a time in the form hh:mm");
					
					valid = false;
					
					while(!valid)
						{
							if(time.length()==5)
								{
									if(Character.isDigit(time.charAt(0)) && Character.isDigit(time.charAt(1))) //added this test
									{
									
										hour = Integer.parseInt(time.substring(0,2)); //only attempt this when you know the first 2 are both digits, otherwise a crash!
										
										if(hour>=0 && hour<=23)
											{
												if(time.charAt(2)==':')
												{
													if((time.charAt(3)>='0' && time.charAt(3)<='5') && (time.charAt(4)>='0' && time.charAt(4)<='9'))
														{
															valid = true;
														}
													else
														//was missing the variable before the input dialog method call here
														time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");
												}
												else
													//here
													time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Wrong sign Please enter a time in the form hh:mm");
											}
										else
											//here
											time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");
									}
									else
										//here
										time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");
								}
							else
								//and here
								time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");		
						}
					
				
				//moved this code to just after the validation loop to prevent logical error
				    if(hour>=0 && hour<=11)
						JOptionPane.showMessageDialog(null,"Good Morning!","Time Validator",JOptionPane.INFORMATION_MESSAGE);
					else if(hour>=12 && hour<=17)
						JOptionPane.showMessageDialog(null,"Good Afternoon!","Time Validator",JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(null,"Good Evening!","Time Validator",JOptionPane.INFORMATION_MESSAGE);
				
				
				} //added this to close off for loop
			System.exit(0);
		}
}	 