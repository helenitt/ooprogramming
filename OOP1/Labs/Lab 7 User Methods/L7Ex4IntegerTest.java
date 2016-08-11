//L7Ex4IntegerTest.java
/*This program prompts for and reads in a series of integers of 
 *unknown size and passes them one at a time to a user-defined 
 *method called isEven() which determines if the integer is even*/

import javax.swing.JOptionPane;

public class L7Ex4IntegerTest {
	public static void main(String ages[])
		{
			String numString="";
			int number;
			
			for(int i=0;i<=numString.length();i++) 
				{
					numString = JOptionPane.showInputDialog("Please enter an integer");
					number = Integer.parseInt(numString);
					
					if(isEven(number))
						JOptionPane.showMessageDialog(null,"You entered an even number","Even Test",
						JOptionPane.PLAIN_MESSAGE);
					else
						JOptionPane.showMessageDialog(null,"You entered an odd number","Even Test",
						JOptionPane.PLAIN_MESSAGE);		
				}
			
			System.exit(0);
		}
	public static boolean isEven(int n)
		{
			boolean result=false;
			
			if(n%2==0)
				result=true;
			return result;
		}
}