//GasVolume.java
/*This program calculates the volume of gas in a specific situation*/

import java.util.Scanner;

public class GasVolume{
	public static void main(String args[])
		{
			int moles;
			float volume, temperature, pressure;
			final float gasConstant = 8.3145f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("========Volume Calculator========\n\n");
			
			System.out.print("Please enter the temperature of the gas: ");
			temperature = input.nextFloat();
			
			if(temperature<=0)
				System.out.print("\nError! The temperature of the gas must be positive ..... now quitting program");
			else
				{
					System.out.print("Please enter the number of moles of the gas: ");
					moles = input.nextInt();
					
					System.out.print("Please enter the pressure of the gas: ");
					pressure = input.nextFloat();
					
					System.out.println("\n\nThe volume of the gas is " +
									   String.format("%.3f",moles*gasConstant*temperature/pressure) +
									   " m" + (char)252);
				}
		}
}