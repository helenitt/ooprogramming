//Exercise2.java
/**/

import java.util.Scanner;

public class Exercise2{
	public static void main(String args[])
	{
		float grossIncome, pensionPayment, cutOffPoint, taxCredits;
		final float LOW_RATE=0.2f,HIGH_RATE=0.42f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your gross income; ");
		grossIncome = input.nextFloat();
		
		System.out.print("Please enter your pension payment: ");
		pensionPayment = input.nextFloat();
		
		System.out.print("Please enter your cut-off point: ");
		cutOffPoint = input.nextFloat();
		
		System.out.print("Please enter your tax-credits: ");
		taxCredits = input.nextFloat();
				
		if (grossIncome>cutOffPoint)
			System.out.println("\nThe PAYE due by this employee is EUR" +
			String.format("%.2f",(cutOffPoint*LOW_RATE)+((grossIncome-cutOffPoint-pensionPayment)*HIGH_RATE)-taxCredits));
				
		else 
			System.out.println("\nThe PAYE due by this employee is EUR" +
			String.format("%.2f",((grossIncome-pensionPayment)*LOW_RATE)-taxCredits));
			
		
	}
}