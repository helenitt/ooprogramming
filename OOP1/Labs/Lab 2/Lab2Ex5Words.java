//Lab2Ex5Words.java
/*This program reads in exactly 5 words using a for loop. The program should 
 *determine the average number of vowels, the average number of consonants 
 *per word and . It should also determine the longest word entered*/

import java.util.Scanner;

public class Lab2Ex5Words {
	public static void main(String args[])
		{
			String word, longest="a";
			int vowels=0, consonants=0;
			char letter;
			
			Scanner input = new Scanner(System.in);
			
			for(int i=1;i<6;i++)
				{
					System.out.print("Please enter word " + i + ": ");
					word = input.nextLine();
					
					if(word.length() > longest.length())
						longest = word;
						
					for(int j=0;j<word.length();j++)
						{
							letter = word.charAt(j);
							
							if(letter=='a' || letter=='e' || letter=='i' || 
							   letter=='o' || letter=='u')
							   vowels++;
							else
								consonants++;
						}
				}
			System.out.println("\n\n\nThe average number of vowels per word: " +
							   String.format("%.2f",(float)vowels/5) + 
							   "\nThe average number of consonants per word: " +
							   String.format("%.2f",(float)consonants/5) + 
							   "\nThe longest word: " + longest);
		}
}