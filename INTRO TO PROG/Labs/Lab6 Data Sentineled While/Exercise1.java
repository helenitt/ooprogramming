//Exercise1.java
/*This program converts degrees Fahrenheit to degrees Celcius*/

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			float fahrenheit, celcius, totalCelcius=0;
			int numConverted=0, over30=0, under10=0, atLeast20=0;
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.print("Please enter the first Fahrenheit temperature (below -459.67 to exit): ");
			fahrenheit = input.nextFloat();
			
					
			while(fahrenheit>=-459.67f)
				{
					celcius = (fahrenheit-32)*5/9f;
					totalCelcius = totalCelcius + celcius;
					numConverted++;
					
					
					System.out.println("The equivalent Celcius temperature is " +
					String.format("%.3f",celcius));
											
					if (celcius > 30)		
						over30 ++;
					else if (celcius < 10)
						under10++;
					
					if (celcius >= 20)
						atLeast20++;
						
					System.out.print("\nPlease enter another Fahrenheit temperature (below -459.67 to exit): ");
					fahrenheit = input.nextFloat();	
						
				}
			
			if(numConverted!=0)
				{
					System.out.println("\n\n==============================\n\tProgram Results\n" +
					"==============================\n\nTotal conversions performed: " + numConverted +
					"\nAverage Celcius temperature: " + String.format("%.3f",totalCelcius/numConverted) + "C" +
					"\nTotal Celcius temperatures > 30C: " + over30 + "\nTotal Celcius temperatures < 10C: " + under10 +
					"\nPercentage Celcius temperatures >= 20C: " + String.format("%.2f",(float)atLeast20/numConverted*100) + "%");
				}
				
			else
				System.out.println("\nNo conversions were performed .... Goodbye");

			
		}
}