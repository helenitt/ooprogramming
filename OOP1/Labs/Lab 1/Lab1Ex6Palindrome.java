//Lab1Ex6Palindrome.java
/*This program asks the user to enter a word containing exactly 9 
 *characters. If the number of characters in the word entered by 
 *the user is not 9, then put out a warning message and terminate 
 *the program immediately. If it is 9, then check to see whether 
 *the word entered constitutes a palindrome*/

import java.util.Scanner;

public class Lab1Ex6Palindrome {
	public static void main(String args[])
		{
			String word;
			char index;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a word 9 characters long: ");
			word = input.nextLine();
			
			if(word.length() != 9)
				{
					System.out.println("Invalid word! Quitting program now...");
				}
			else
				{
					if(word.charAt(0)==word.charAt(8) && word.charAt(1) == word.charAt(7) &&
					   word.charAt(2)==word.charAt(6) && word.charAt(3) == word.charAt(5))
					     System.out.println("\nThe word you entered is a palindrome");
				    else
				    	 System.out.println("\nThe word you entered is not a palindrome");						
				}		
		}
}