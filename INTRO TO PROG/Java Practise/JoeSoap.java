//JoeSoap.java
/**/

import java.util.Scanner;

public class JoeSoap {
	public static void main(String args[])
		{
			
			String name, address;
			
			double weight, height;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your name: ");
			name = input.nextLine();
			
			System.out.print("Please enter your weight: ");
			weight = input.nextDouble();
			
			System.out.print("Please enter your height: ");
			height = input.nextDouble();
			
			System.out.print("Please enter your address: ");
			address = input.nextLine();
			address = input.nextLine();
			
			System.out.println("\n\n\n=================================" +
			"\n\t\t\tDetails\n=================================\nName: " + name +
			"\nWeight: " + weight + "kg\nHeight: " + height + "m");
			
			System.out.println("Address: " + address);
			
		}
}