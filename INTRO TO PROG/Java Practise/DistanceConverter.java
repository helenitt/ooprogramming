//DistanceConverter.java

import java.util.Scanner;

public class DistanceConverter {
	public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			
			float yards;
			
			final float METRES = 0.9144f;
			
			System.out.print("Please enter the distance in yards: ");
			yards = input.nextFloat();
			
			System.out.println("This distance in metres is: " + String.format("%.2f",(yards*METRES)));
	}
		
}