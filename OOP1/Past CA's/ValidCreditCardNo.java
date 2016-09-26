//ValidCreditCardNo.java
/*This program validates a Visa debit card number that has been issued by 
 *the AIB bank in Tralee*/

import javax.swing.JOptionPane;

public class ValidCreditCardNo {
	public static void main(String args[])
		{
			String numAsString;
			boolean valid=false;
			int i;
			
			numAsString = JOptionPane.showInputDialog("Please enter a 16-digit debit card number");
			
			while(!valid)
				{
					if(numAsString.length()==4)
						{
							if(numAsString.charAt(0)=='4')
								{
									for(i=0; i<=numAsString.length(); i++)
										{
											if(Character.isDigit(numAsString.charAt(i)))
												{
													if(i==3)
														valid = true;
												}
											else
												numAsString = JOptionPane.showInputDialog("Invalid must contain all digits! Please re-enter");
										}
								}
							else
								numAsString = JOptionPane.showInputDialog("Invalid card number begins with 4! Please re-enter");
						}
					else
						numAsString = JOptionPane.showInputDialog("Invalid card number length!Please re-enter");
				}
			JOptionPane.showMessageDialog(null,"The debit card number " + numAsString + " is valid",
														  "Valid!",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);	
		}
}
// must change 4 back to 16