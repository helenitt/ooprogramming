//L7Ex7Last3Char.java
/*This program asks the user to enter a piece of text in main(). Then 
 *a method last3Characters() should be called which takes the user-supplied 
 *text as an argument and returns the last 3 characters it contains*/

import java.util.Scanner;

public class L7Ex7Last3Char {
	public static void main(String args[])
		{
			String text, letters;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a piece of text: ");
			text = input.nextLine();
			
			letters = last3Characters(text);
			
			if(letters.equals(""))
				System.out.println("\nInvalid! What you entered contains fewer than 3 characters");
			else
				System.out.println("\nThe last 3 characters in the text you entered is \"" + letters + "\"");	
		}
	public static String last3Characters(String t)
		{
			String letters="";
			
		
			
			if(letters.length()<3)
				{
					for(int i=t.length()-3;i<t.length();i++)
						{
							letters += t.charAt(i);
						}
				}
				
			return letters;
		}
}