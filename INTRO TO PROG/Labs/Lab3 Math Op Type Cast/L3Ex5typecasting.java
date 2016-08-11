//L3Ex5typecasting.java
/*This program prompts the for and reads in the value for the mass of the 
 *first object, the mass of the second object and the distance between the 
 *two objects and uses these to determine the gravitational force exerted 
 *on the objects*/
 
 import java.util.Scanner;
 
 public class L3Ex5typecasting {
 	public static void main(String args[])
 	{
 		final float G = 6.673E-11f;
 		
 		float m1, m2;
 		
 		int d;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter the mass in kg of the first object: ");
 		m1 = input.nextFloat();
 		
 		System.out.print("Please enter the mass in kg of the second object: ");
 		m2 = input.nextFloat();
 		
 		System.out.print("Please enter the distance in metres between objects: ");
 		d =  input.nextInt();
 		
 		System.out.println("\n\n****** Results of Program ******\n\n" +
 			"The mass of the first object is " + m1 + 
 			" kg\nThe mass of the second object is " + m2 +
 			" kg\nThe distance between the two objects is " + d +
 			"m\nThe force between the two objects is " + 
 			String.format("%.2f",G*m1*m2/((float)d*d)) + " N");
 	}
 }