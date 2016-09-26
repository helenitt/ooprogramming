//ElectricalCurrent.java
/**/

import java.util.Scanner;

public class ElectricalCurrent{
	public static void main(String args[])
		{
			int resistor1, resistor2;
			float voltage, current;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("*********Current Calculator*********\n\n");
			
			System.out.print("Please enter the voltage of your battery: ");
			voltage = input.nextFloat();
			
			if (voltage<=0)
				System.out.println("\nError! The voltage of the battery must be positive ..... now quitting program");
			else
				{
					System.out.print("Please enter the resistance of the first resistor: ");
					resistor1 = input.nextInt();
					System.out.print("Please enter the resistance of the second resistor: ");
					resistor2 = input.nextInt();
					
					current = voltage*(resistor1+resistor2)/(resistor1*resistor2);
					
					System.out.println("\n\nThe total current flowing in the circuit is " +
									   String.format("%.0f",current) + " Amps");					
				}
		}
}