//L2Ex3PersonalInfo.java
/*This program will ask the user to input information and then print it 
 *out on the screen*/
 
 import java.util.Scanner;
 
 public class L2Ex3PersonalInfo {
 	public static void main(String args[])
	 	{
	 		String name, address;
	 		float weight, height;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter your name: ");
	 		name = input.nextLine();
	 		
	 		System.out.print("Please enter your weight: ");
	 		weight = input.nextFloat();
	 		
	 		System.out.print("Please enter your height: ");
	 		height = input.nextFloat();
	 		
	 		input.nextLine();
	 		
	 		System.out.print("Please enter your address: ");
	 		address = input.nextLine();
	 		
	 		System.out.println("\n\n\n========================================" +
	 			"\n\t\t\t\tDetails" + "\n========================================" +
	 			"\nName: " + name + "\nWeight: " + weight + "kg\nHeight: " + height + 
	 			"m\nAddress: " + address);
	 	}
 }