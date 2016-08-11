//SimpleIf.java

import java.util.Scanner;

public class SimpleIf {
	public static void main(String args[])
		{
			String answerAsString;
			char answer;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Do you like Java? (y/n): ");
			answerAsString = input.nextLine();
			
			answer = answerAsString.charAt(0);
			
			if(answer == 'y')
				System.out.println("\nOh Yeah, you like Java!");
				
			if(answer == 'n')
				System.out.println("Uh Oh, you don't like Java!!!");
				
					
		}
}