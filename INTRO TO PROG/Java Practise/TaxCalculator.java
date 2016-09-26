//TaxCalculator.java

import java.util.Scanner;

public class TaxCalculator {
	public static void main(String args[])
		{
			float income, pension, cutOff, credits;
			final float LOW = 0.2f, HIGH = 0.42f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Pleasse enter your gross income: ");
			income = input.nextFloat();
			
			System.out.print("Pleasse enter your pension payment: ");
			pension = input.nextFloat();
			
			System.out.print("Pleasse enter your cut-off point: ");
			cutOff = input.nextFloat();
			
			System.out.print("Pleasse enter your tax-credits: ");
			credits = input.nextFloat();
			
			if (income>cutOff)
				System.out.println("\nThe PAYE due by this employee is EUR " +
				String.format("%.2f",cutOff*LOW+(income-cutOff-pension)*HIGH-credits));
			else
				System.out.println("\nThe PAYE due by this employee is EUR " +
				String.format("%.2f",(income-pension)*LOW-credits));
		}
}