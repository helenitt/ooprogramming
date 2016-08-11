//Lab1Ex4Torus.java
/*This program gets the user to supply the values for the tube 
 *radius, the cross-sectional radius and the mass of a torus 
 *and then uses the formulae above to determine the moments of 
 *inertia*/
 
 import java.util.Scanner;
 
 public class Lab1Ex4Torus {
 	public static void main(String args[])
	 	{
	 		float radius, crossRadius, mass;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter the tube radius of the torus: ");
	 		radius = input.nextFloat();
	 		
	 		System.out.print("Please enter the cross-sectional radius of the torus: ");
	 		crossRadius = input.nextFloat();
	 		
	 		System.out.print("Please enter the mass of the torus: ");
	 		mass = input.nextFloat();
	 		
	 		System.out.println("\n=======Results=======\n\nMoment of inertia about a diameter is : " +
	 						   String.format("%.3f",((((4*(radius*radius))+(5*(crossRadius*crossRadius)))*mass)/8)) +
	 						   "kg sq m\nMoment of inertia about a vertical axis is: " +
	 						   String.format("%.3f",(((radius*radius)+(0.75*(crossRadius*crossRadius)))*mass)) + "kg sq m");
	 	}
 }