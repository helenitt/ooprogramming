//ArithmeticFormatted.java
/*Will calculate sums*/

import java.util.Scanner;

public class ArithmeticFormatted {
	public static void main(String args[])
		{
			float number1, number2;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter any number: ");
			number1 = input.nextFloat();
			
			System.out.print("Please enter another number: ");
			number2 = input.nextFloat();
			
			System.out.println("\n\n***********Result of Arithmetic Calculations***********\n" +
			number1  + " + " + number2 + " is " + String.format("%.10f",(number1 + number2)) + "\n" +
			number1  + " - " + number2 + " is " + String.format("%.10f",(number1 - number2)) + "\n" +
			number1  + " * " + number2 + " is " + String.format("%.10f",(number1 * number2)) + "\n" +
			number1  + " / " + number2 + " is " + String.format("%.10f",(number1 / number2)) + "\n" +
			number1  + " % " + number2 + " is " + String.format("%.10f",(number1 % number2)) + "\n");
		}
}