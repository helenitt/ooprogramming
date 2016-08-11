//L3Ex2CylinderVolume.java
/*This program will calculate the volume of a cylinder from the 
 *dimensions entered by the user*/
 
 import java.util.Scanner;
 
 public class L3Ex2CylinderVolume {
 	public static void main(String args[])
 	{
 		float radius, height;
 		
 		final float PI = 3.142f;
 		
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter the radius of the cylinder: ");
 		radius = input.nextFloat();
 		
 		System.out.print("Please enter the height of the cylinder: ");
 		height = input.nextFloat();
 		
 		System.out.println("\n\n===== Calculation Result =====" +
 			"\n\nVolume of cylinder is " + 
 			String.format("%.2f",(PI*(radius*radius)*height)) + 
 			" metres squared");
 			
 	}
 }