//L3Ex4DistanceTraveled.java
/*This program prompts the user for and reads in values for initial
 * speed, time and acceleration and determines the distance traveled 
 *by the object*/
 
 import java.util.Scanner;
 
 public class L3Ex4DistanceTraveled {
 	public static void main(String args[])
 	{
 		float u, t, a;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.println("***********Distance Calculator***********");
 		
 		System.out.print("\n\nPlease enter the initial speed: ");
 		u = input.nextFloat();
 		
 		System.out.print("Please enter the acceleration: ");
 		t = input.nextFloat();
 		
 		System.out.print("Please enter the time spent traveling: ");
 		a = input.nextFloat();
 		
 		
 		System.out.println("\n\nThe object traveled a distance of " +
 			String.format("%.2f",u*t+(a/2)*(t*t)) + " metres");
 			
 	}
 }