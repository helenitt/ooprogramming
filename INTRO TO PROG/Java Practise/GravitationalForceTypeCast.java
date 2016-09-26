//GravitationalForceTypeCast.java

import java.util.Scanner;

public class GravitationalForceTypeCast {
	public static void main(String args[])
		{
			float firstObject, secondObject;
			
			int distance;
			
			final float GRAV = 6.67300E-11f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the mass in kg of the first object: ");
			firstObject = input.nextFloat();
			
			System.out.print("Please enter the mass in kg of the second object: ");
			secondObject = input.nextFloat();
			
			System.out.print("Please enter the distance in metres between the objects: ");
			distance = input.nextInt();
			
			System.out.println("\n\n******Results of Program******\n\nThe mass of the first object is " +
							   firstObject + " kg\nThe mass of the second object is " +
							   secondObject + " kg\nThe distance between the two objects is " +
							   distance + "m\nThe force exerted on the objects is " +
							   String.format("%.2f",GRAV*firstObject*secondObject/((float)distance*distance)) + " N");
							   
		}
}