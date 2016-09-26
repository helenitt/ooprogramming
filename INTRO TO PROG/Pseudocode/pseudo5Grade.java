//pseudo5Grade.java


import java.util.Scanner;

public class pseudo5Grade {
	public static void main(String args[])
		{
			float mark;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your grade point average between 0 and 5: ");
			mark = input.nextFloat();
			
			if(mark>=4)
				System.out.println("\n\nYou got an A grade");
			else if(mark>=3.5)
				System.out.println("\n\nYou got a B grade");
			else if(mark>=3)
				System.out.println("\n\nYou got a C grade");
			else if(mark>=2)
				System.out.println("\n\nYou got an D grade");
			else
				System.out.println("\n\nYou got an F grade");
		}
		
}