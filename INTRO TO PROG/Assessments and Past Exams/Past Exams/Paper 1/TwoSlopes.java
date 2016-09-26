//TwoSlopes.java
/*This program reads in the slopes of 2 lines and determines a number of facts
 *about the lines based on the values supplied*/

import java.util.Scanner;

public class TwoSlopes {
	public static void main(String args[])
		{
			float firstSlope, secondSlope;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the slope of the first line: ");
			firstSlope = input.nextFloat();
			
			System.out.print("Please enter the slope of the second line: ");
			secondSlope = input.nextFloat();
			
			System.out.println("\n\n==========================================" +
							   "\n\t\tProgram Results\n" +
							   "==========================================\n\n");
			
			if (firstSlope == secondSlope)
				System.out.println("The slopes you entered are the same so the " + 
							  	   "lines must be parallel");
			else if (firstSlope*secondSlope == -1)
				System.out.println("The prooduct of the slopes is -1 so the " +
								   "lines must be perpendicular");
			else 
				System.out.println("The lines involved here intersect but are " +
								   "not perpendicular to each other");
				
			if (firstSlope == 0 && secondSlope == 0)
				System.out.println("\n\nBoth lines are parallel to the x-axis");
			else if (firstSlope == 0)
				System.out.println("\n\nOnly the first line is parallel to the x-axis");
			else if (secondSlope == 0)
				System.out.println("\n\nOnly the second line is parallel to the x-axis");
			else
				System.out.println("\n\nNiether line is parallel to the x-axis");				
		}
}