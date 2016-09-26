//OunceConversion.java

import java.util.Scanner;

public class OunceConversion {
	public static void main(String args[])
		{
			int ounces;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a quantity of ounces: ");
			ounces = input.nextInt();
			
			System.out.println("\n" + ounces + " ounces is equivalent to " + 
		    ounces/16 + "lbs " + ounces%16 +"oz");
		}
}