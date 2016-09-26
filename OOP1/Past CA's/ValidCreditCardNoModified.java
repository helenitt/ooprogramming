//ValidCreditCardNoModified.java
/*This program validates a Visa debit card number that has been issued by 
 *the AIB bank in Tralee*/

import javax.swing.JOptionPane;

public class ValidCreditCardNoModified {
	public static void main(String args[])
		{
			String numAsString;
			boolean valid=false;
			int i,digits=0;
			
			numAsString = JOptionPane.showInputDialog("Please enter a 16-digit debit card number");
			
			while(!valid)
				{
					if(numAsString.length()==4)
						{
							if(numAsString.charAt(0)=='4')
								{
									for(i=0; i<numAsString.length(); i++) //just changed <= to < here to prevent going off the end of the string
										{
											if(Character.isDigit(numAsString.charAt(i)))
													digits++;		
	
										}
									
									if(digits==4) //you'll be changing this to 16 also
									   valid = true; //just need to check the "golden rule" part now	
									else
									   numAsString = JOptionPane.showInputDialog("Invalid must contain all digits! Please re-enter");
								}
							else
								numAsString = JOptionPane.showInputDialog("Invalid card number begins with 4! Please re-enter");
						}
					else
						numAsString = JOptionPane.showInputDialog("Invalid card number length!Please re-enter");
						
					digits=0; //must remember to reset this to zero for the next iteration of the validation loop
				}
			JOptionPane.showMessageDialog(null,"The debit card number " + numAsString + " is valid",
														  "Valid!",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);	
		}
}
// must change 4 back to 16