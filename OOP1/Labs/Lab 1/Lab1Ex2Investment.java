//Lab1Ex2Investment.java
/*This program prompts for and reads in the details of 2 
 *types of investment for the share portfolio of an investor
 *and then displays the formatted information to the screen*/
 
 import java.util.Scanner;

public class Lab1Ex2Investment {
	public static void main(String args[])
	 	{
	 		String type1, type2;
	 		int shares1, shares2;
	 		float price1, price2;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter the type of the first investment: ");
	 		type1 = input.nextLine();
	 		
	 		System.out.print("Please enter the number of shares purchased: ");
	 		shares1 = input.nextInt();
	 		
	 		System.out.print("Please enter the share price: ");
	 		price1 = input.nextFloat();
	 		
	 		System.out.print("\n\n\nPlease enter the type of the second investment: ");
	 		input.nextLine();
	 		type2 = input.nextLine();
	 		
	 		System.out.print("Please enter the number of shares purchased: ");
	 		shares2 = input.nextInt();
	 		
	 		System.out.print("Please enter the share price: ");
	 		price2 = input.nextFloat();
	 		
	 		System.out.println("\n\n\t\t==============================" +
	 						   "\n\t\t\tInvestment Details\n==============================\n\n" +
	 						   String.format("%-20s%-10s%-12s\n%-20s%-10s%-12s\n%-20s%-10d%-12.4f\n%-20s%-10d%-12.4f",
	 						   "Investment Type", "# Shares", "Share Price", "---------------", "--------", "-----------",
	 						   type1, shares1, price1, type2, shares2, price2));
	 	}
	
}