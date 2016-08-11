//L3Ex3AcreConversion.java

import java.util.Scanner;

public class L3Ex3AcreConversion {
	public static void main(String args[])
		{
			float acres;
			final float CONVERSION = 0.4046f;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter an area in acres: ");
			acres = input.nextFloat();
			
			System.out.println("\n\nThis is equivalent to " + 
			String.format("%.3f",(acres*CONVERSION)) + " hectares");
		}
}