//L10Ex1Time.java
/*This program reads in exactly 5 time values in the format hh:mm 
 *and validates them perfectly*/
 
import javax.swing.JOptionPane;

public class  L10Ex1Time {
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
											hour = Integer.parseInt(time.substring(0,2));
											
											if(hour>=0 && hour<=23)
												{
													if(time.charAt(2)==':')
													{
														min = Integer.parseInt(time.substring(3,5));
														
														if(min>=0 && min<=59)
															{
																valid = true;
															}
														else
															time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");
													}
													else
														time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");
												}
											else
												time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");
										}
									else
										time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");	
								}
							else
								{
								time = JOptionPane.showInputDialog("Iteration " + i + " - Invalid! Please enter a time in the form hh:mm");
								}		
						}
						
					if(valid==true)
						{
							if(hour>=0 && hour<=11)
								JOptionPane.showMessageDialog(null,"Good Morning!","Time Validator",JOptionPane.INFORMATION_MESSAGE);
							else if(hour>=12 && hour<=17)
								JOptionPane.showMessageDialog(null,"Good Afternoon!","Time Validator",JOptionPane.INFORMATION_MESSAGE);
							else
								JOptionPane.showMessageDialog(null,"Good Evening!","Time Validator",JOptionPane.INFORMATION_MESSAGE);

						}	
				}
			System.exit(0);
		}
}	 