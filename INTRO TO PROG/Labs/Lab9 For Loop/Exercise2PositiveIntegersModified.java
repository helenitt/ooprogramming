//Exercise2PositiveIntegersModified.java
/*This program allows the user to enter a positive integer number and 
 *the program then calculates and displays the sum of the positive integers 
 *up to and including that upper limit*/
 
import java.util.Scanner;

public class Exercise2PositiveIntegersModified {
	public static void main(String args[])
		{
			int upperLimit, totalNumber=0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the upper limit: ");
			upperLimit = input.nextInt();
			
			for(int number=0;number<=upperLimit;number++)
				totalNumber+=number;
				
			System.out.println("\nThe sum of the first " + upperLimit + " positive integers is: " + totalNumber);
		}
}