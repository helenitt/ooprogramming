//CounterControlledWhile2.java
/*This program uses a while loop for counter-controlled repetition to 
 *read in a paragraph of text from the user and determine the number of 
 *characters, letters, digits, punctuation symbols, words and sentences 
 *in the paragraph*/
 
 import java.util.Scanner;
 
 public class CounterControlledWhile2 {
 	public static void main(String args[])
	 	{
	 		String text="";
	 		int index=0, words=0, sentences=0, letters=0, digits=0, punctuation=0;	
	 		char character;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter your paragraph of text: \n\n");
	 		text = input.nextLine();
	 		
	 		while(index < text.length())
		 		{
		 			character = text.charAt(index);
		 			
		 			if(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z')
		 				letters++;
		 			else if (character >= '0' && character <= '9')
		 				digits++;
		 			else
		 				punctuation++;
		 				
		 			if(character == ' ')
		 				words++;
		 				
		 			if(character == '.' || character == '!' || character == '?')
		 				sentences++;
		 				
		 			index++;
		 		}
	 		System.out.println("\n\n\n========================================" +
	 						   "\n\tLexical Analysis of Your Paagraph" +
	 						   "\n========================================" +
	 						   "\n\nCharacters: " + text.length() +
	 						   "\nLetters: " + letters + "\nDigits: " + digits +
	 						   "\nWords: " + (words+1) + "\nSentences: " + sentences +
	 						   "\nPunctuation symbols: " + punctuation);
	 	}
 }