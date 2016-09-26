//IfElse.java

import java.util.Scanner;

public class IfElse {
	public static void main(String args[])
		{
			String answer;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("What is half a byte called - (one word please)? ");
			answer = input.nextLine();
			
			if (answer.equals("nibble"))
				System.out.println("\nThat's the correct answer - Well Done!");
			else
				System.out.println("\nIncorrect - The answer is a \"nibble\"");
				
		}
}