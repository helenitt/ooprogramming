//ArithmeticOperatorsWithFormatting.java
/*This program reads in 2 user-supplied numbers and uses the arithmetic operators
 *to perform some calculations on them*/
 
 import java.util.Scanner;
 
 public class ArithmeticOperators {
 	public static void main(String args[])
 		{
 			float firstNumber, secondNumber;
 		
 			Scanner input = new Scanner(System.in);
 		
 			System.out.print("Please enter any number: ");
 			firstNumber = input.nextFloat();
 		
 			System.out.print("Please enter another number: ");
 			secondNumber = input.nextFloat();
 		
 		
 			System.out.println("\n\n***********Results of Arithmetic Calculations***********\n\n" +
 				firstNumber + " + " + secondNumber + " is " + (firstNumber + secondNumber) + "\n" +
 				firstNumber + " - " + secondNumber + " is " + (firstNumber - secondNumber) + "\n" +
 				firstNumber + " * " + secondNumber + " is " + (firstNumber * secondNumber) + "\n" +
 				firstNumber + " / " + secondNumber + " is " + (firstNumber / secondNumber) + "\n" +		
 				firstNumber + " % " + secondNumber + " is " + (firstNumber % secondNumber));
 			
 			
 	}
 }