//CylinderVolume.java

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String args[])
		{
			Scanner input = new Scanner(System.in);
			
			float r, h;
			
			final float PI = 3.142f;
			
			System.out.print("Please enter the radius of the cylinder: ");
			r = input.nextFloat();
			
			System.out.print("Please enter the height of the cylinder: ");
			h = input.nextFloat();
			
			System.out.println("\n\n\n=====Calculation Result=====\n\nVolume of the cylinder is " +
							   String.format("%.2f",(PI*(r*r)*h)) + " metres squared");	
		}
}