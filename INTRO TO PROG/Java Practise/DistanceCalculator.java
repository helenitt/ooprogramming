//DistanceCalculator.java
/**/

import java.util.Scanner;

public class DistanceCalculator {
	public static void main(String args[])
		{
			float speed, acceleration, timeTraveling;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("xxxxxxxxxxDistance Calculatorxxxxxxxxxx\n\n\n");
			
			System.out.print("Please enter the initial speed: ");
			speed = input.nextFloat();
			
			System.out.print("Please enter the acceleration: ");
			acceleration = input.nextFloat();
			
			System.out.print("Please enter the time spent traveling: ");
			timeTraveling = input.nextFloat();
			
			System.out.println("\n\nThe object traveled a distance of " +
			String.format("%.2f",(speed*timeTraveling+((acceleration*(timeTraveling*timeTraveling))/2))) +
			" metres");
		}
}