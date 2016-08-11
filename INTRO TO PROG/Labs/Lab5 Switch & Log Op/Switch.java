//Switch.java
/*This program uses a switch statement to determine whether the letter entered
 *by the user was a lowercase vowel or not*/
 
 
 import java.util.Scanner;
 
 public class Switch {
 	public static void main(String args[])
	 	{
	 		String letterAsString;
	 		char letter;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter any letter: ");
	 		letterAsString = input.nextLine();
	 		
	 		letter = letterAsString.charAt(0);
	 		
	 		switch (letter)
		 		{
		 			case 'a':
		 					System.out.println("\nYou entered a lowercase vowel");
		 					break;
		 			case 'e':
		 					System.out.println("\nYou entered a lowercase vowel");
		 					break;
		 			case 'i':
		 					System.out.println("\nYou entered a lowercase vowel");
		 					break;
		 			case 'o':
		 					System.out.println("\nYou entered a lowercase vowel");
		 					break;				
		 			case 'u':
		 					System.out.println("\nYou entered a lowercase vowel");
		 					break;
		 			default:
		 					System.out.println("\nYou did not enter a lowercase vowel");			
		 		}
	 	}
 }