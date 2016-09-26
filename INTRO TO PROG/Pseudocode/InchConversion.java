//InchConversion.java
/**/

import java.util.Scanner;

public class InchConversion {
	public static void main(String args[])
		{
			int inches;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a quantity of inches: ");
			inches = input.nextInt();
			
			System.out.println("\n" + inches + "\" is equivalent to " + 
		    inches/12 + "'" + inches%12 +"\"");
		}
}