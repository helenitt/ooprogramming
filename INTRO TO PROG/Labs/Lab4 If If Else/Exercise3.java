//Exercise3.java
/**/

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
	{
		String serviceAsString;
		char service;
		
		int calls;
		
		float minUSA, minAustralia, minRussia;//minutes spent calling each country
		final float V_USA=0.06f,V_AUSTRALIA=0.08f,V_RUSSIA=0.24f,E_USA=0.19f,E_AUSTRALIA=0.85f,E_RUSSIA=0.92f;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which service did you use for the calls? (V - Vartec, E - Eircon): ");
		serviceAsString = input.nextLine();
		
		service = serviceAsString.charAt(0);
		
		System.out.print("Please enter the total number of calls made in the month: ");
		calls = input.nextInt();
		
		System.out.print("Please enter the number of minutes spent calling the USA: ");
		minUSA = input.nextFloat();
		
		System.out.print("Please enter the number of minutes spent calling Australia: ");
		minAustralia = input.nextFloat();
		
		System.out.print("Please enter the number of minutes spent calling Russia: ");
		minRussia = input.nextFloat();
		
		if (service=='v')
			{
			System.out.println("The total cost of using the Vartec service for the month is EUR" +
			String.format("%.2f",(minUSA*V_USA+minAustralia*V_AUSTRALIA+minRussia*V_RUSSIA)));
			
			System.out.println("\n\nThe average cost per call made is EUR" +
			String.format("%.2f",((minUSA*V_USA+minAustralia*V_AUSTRALIA+minRussia*V_RUSSIA)/calls)));
			}
		if (service=='e')
			{
			
			System.out.println("The total cost of using the Eircom service for the month is EUR" +
			String.format("%.2f",(minUSA*E_USA+minAustralia*E_AUSTRALIA+minRussia*E_RUSSIA)));
		 	
			System.out.println("\n\nThe average cost per call made is EUR" +
			String.format("%.2f",((minUSA*E_USA+minAustralia*E_AUSTRALIA+minRussia*E_RUSSIA)/calls))); 
			}
	}
}

