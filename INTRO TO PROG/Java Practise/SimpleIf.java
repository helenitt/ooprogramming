//SimpleIf.java
/*This program uses simple if statements to determine
 *whether or not the user likes Java*/
 
 import java.util.Scanner;
 
 public class SimpleIf {
 	public static void main(String args[])
	 	{
	 		String answerAsString;
	 		char answer;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Do you like Java? ");
	 		answerAsString = input.nextLine();
	 		
	 		answer = answerAsString.charAt(0);
	 		
	 		if (answer == 'y')
	 			System.out.println("Yes!");
	 		if (answer == 'n')
	 			System.out.println("Oh No!");	
	 	}
 }