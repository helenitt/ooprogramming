//AverageMethod.java
/*This program contains a user-defined method called average() which is 
 *able to determine and return the average of 3 user-supplied numbers*/

import java.util.Scanner;

public class AverageMethod {
	public static void main(String args[])
		{
			double number1, number2, number3;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a first number: ");
			number1 = input.nextDouble();
			
			System.out.print("Please enter a second number: ");
			number2 = input.nextDouble();
			
			System.out.print("Please enter a third number: ");
			number3 = input.nextDouble();
			
			System.out.println("\n\nThe average of the 3 numbers you entered is " +
							   String.format("%.3f",average(number1,number2,number3)));
		}
	public static double average(double a,double b,double c)
		{
			double average;
			average = (a+b+c)/3;
			return average;
		}
}