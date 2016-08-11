//Exercise2.java
/*Now modified. This program uses a data-sentinel controlled while loop to 
 *repetitively process the user’s input, which will be a sentence 
 *of arbitrary length terminated by a full-stop. The program should 
 *determine the exact number of lowercase letters, uppercase letters, 
 *digits and punctuation characters contained in the sentence.*/
 
 import java.util.Scanner;
 
 public class Exercise2{
 	public static void main(String args[])
	 	{
	 		String sentence;
	 		char ch;
	 		int index=0, lowerLetters=0,upperLetters=0, digits=0, punctuation=0;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.println("Please enter any sentence you like (terminated by " +
	 		"a full-stop, an exclamation mark or a question mark):\n");
	 		sentence = input.nextLine();
	 		ch = sentence.charAt(index);//extracts the first character from the sentence
	 		
	 		while(ch !='.' && ch !='!' && ch !='?')
		 		{
		 			if(ch>='a' && ch<='z')
			 			lowerLetters++;
			 		else if(ch>='A' && ch<='Z')
			 			upperLetters++;
			 		else if(ch>='0' && ch<='9')
			 			digits++;
			 		else
			 			punctuation++;
			 		
			 		index++; //increase index by one
			 		ch = sentence.charAt(index); //extract the next character from the sentence
			 		
		 		}
	 		System.out.println("\n\n******Lexical Analysis of your Sentence******" +
	 						   "\nLowercase letters: " + lowerLetters +
	 						   "\nUppercase letters: " + upperLetters +
	 						   "\nDigits: " + digits +
	 						   "\nPunctuation symbols: " + (punctuation+1));	
	 	}
 }