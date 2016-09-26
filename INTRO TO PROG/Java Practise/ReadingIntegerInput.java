//ReadingIntegerInput.java
/**/

import java.util.Scanner;

public class ReadingIntegerInput {
	public static void main(String args[])
		{
			int CPU, RAM;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter the nuber of CPU's in your computer: ");
			CPU = input.nextInt();
			
			System.out.print("Please enter the amount of RAM in your computer in MB: ");
			RAM = input.nextInt();
			
			System.out.println("\n\n\nThe details you entered were as follows:\n\nNumer of " +
			"CPUs: " + CPU + "\nAmount of RAM: " + RAM + "MB\n\n\n");
			
		}
}