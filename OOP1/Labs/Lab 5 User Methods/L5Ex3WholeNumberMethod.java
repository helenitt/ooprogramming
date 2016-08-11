//L5Ex3WholeNumberMethod.java
/*This program uses a user-defined method called isWholeNumber() 
 *that takes a single String argument and determines whether or 
 *not it constitutes a whole number (positive or negative)*/

import javax.swing.JOptionPane;

public class L5Ex3WholeNumberMethod {
	public static void main(String args[])
		{
			String text;
			
			text = JOptionPane.showInputDialog("Please enter a piece of text");
			
			if(isWholeNumber(text))
				JOptionPane.showMessageDialog(null,"The text you entered constitutes a whole number",
											  "Number Test",JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"The text you entered does not constitute a whole number",
											  "Number Test",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);		
		}
	public static boolean isWholeNumber(String t)
		{
			boolean result = false;
			int i=0;
			
			if(t.charAt(0)=='-' || Character.isDigit(t.charAt(0)))
				{
			    	for(i=1;i<t.length();i++)
			    		if(!Character.isDigit(t.charAt(i)))
				    		{
				    			break;
				    		}
			    		
					if(i==t.length() && !t.equals("-"))
					    result = true;
				}
		    		
		    return result;
		}
}