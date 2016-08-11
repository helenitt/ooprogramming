//Exercise4Binary.java
/*This program reads in a piece of text from the user and then 
 *uses a for loop to help determine whether the text supplied 
 *constitutes a binary number*/
 
 import java.util.Scanner;
 
 public class Exercise4Binary {
 	public static void main(String args[])
	 	{
	 		String text;
	 		char character;
	 		int i;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter a piece of text: ");
	 		text = input.nextLine();
	 		
	 		for(i=0;i<text.length();i++)
		 		{
		 			character = text.charAt(i);
		 			
		 			if(character != '0' && character != '1')
			 			{
			 				System.out.println("\nYou did not enter a binary number");
			 				break;
			 			}
			 	}
		 	if(i==text.length())
		 		System.out.println("\nYou entered a binary number");	 	
	 	}
 }