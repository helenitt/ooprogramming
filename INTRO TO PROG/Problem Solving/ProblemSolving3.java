//ProblemSolving3.java
/*This program prompts the user for three numbers, multilys them and
 *then displays the answer to three decimal places*/
 
 import java.util.Scanner;
 	
 public class ProblemSolving3 {
 	public static void main(String args[])
 	{
 		float number1, number2, number3;
 		
 		Scanner input = new Scanner(System.in);
 			
 		System.out.print("Please enter your first number: ");
 		number1 = input.nextFloat();
 		
 		System.out.print("Please enter your second number: ");
 		number2 = input.nextFloat();
 		
 		System.out.print("Please enter your third number: ");
 		number3 = input.nextFloat();
 		
 		System.out.println("\nThe product of your numbers is: " +
 			String.format("%.3f", number1*number2*number3));
 		
 	}
 }