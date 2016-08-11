//Exercise3.java
/*This program offers you a choiice of operations to make a calculation*/

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
		{
			int option;
			float radius;
			final float PI = 3.142f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("\t\t\t1.Calculate the area of a circle" +
							 "\n\t\t\t2.Calculate the volume of a sphere" +
							 "\n\t\t\t3.Quit");
			
			System.out.print("\n\nPlease enter your choice(1-3): ");
			option = input.nextInt();
			
			switch (option)
				{case 1:
						System.out.print("\n\nPlease enter the radius of the circle: ");
						radius = input.nextFloat();
						System.out.print("\nThe area of the circle is " +
						String.format("%.3f metres squared",PI*(radius*radius)));
						break;
				 case 2:
				 		System.out.print("\n\nPlease enter the radius of the sphere: ");
				 		radius = input.nextFloat();
				 		System.out.println("\nThe volume of the sphere is: " +
				 		String.format("%.3f metres cubed",4f/3*PI*(radius*radius*radius)));
				 		break;
				 case 3:
				 		System.out.print("\n\nThanks for using the system. Goodbye!\n");
				 		break;
				 default:
				 		System.out.print("\n\nSorry - you must have entered " +
				 						 "an invalid choice - must be between 1 -3\n");
					
				}
		}
}