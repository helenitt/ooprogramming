//ProblemSolving2.java
/*This program asks for tank capacity, consumption and distance computes
 *sums pertaining to these*/
 
 import java.util.Scanner;
 
 public class ProblemSolving2 {
 	public static void main(String args[])
 	{
 		float tankCapacity, consumption, distance;
 		
 		Scanner input = new Scanner(System.in);
 		
 		System.out.print("Please enter the capacity of the fuel-tank in litres: ");
 		tankCapacity = input.nextFloat();
 		
 		System.out.print("Please enter the fuel consumptionn of the car in km/l: ");
 		consumption = input.nextFloat();
 		
 		System.out.println("\nThis car can travel " +
 			String.format("%.2f",tankCapacity*consumption) +
 			"km on a single tank of fuel");
 			
 		System.out.print("\nHow many km do you need to travel? ");
 		distance = input.nextFloat();
 		
 		System.out.println("\nIn order to travel a distance of " + distance + "km you need " + 
 			String.format("%.2f",distance/consumption) + " litres of fuel");
 			
 		System.out.println("In order to travel a distance of 2000km it is necessary to refuel " + 
 			String.format("%.2f",2000/(tankCapacity*consumption)) + " times");
 			
 		System.out.println("The distance you can travel on 10 gallons of fuel is " +
 			String.format("%.2f",45.5*consumption) + "km");
 			 			
 	}
 }
