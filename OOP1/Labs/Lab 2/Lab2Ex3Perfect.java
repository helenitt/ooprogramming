//Lab2Ex3Perfect.java
/**/

import java.util.Scanner;

public class Lab2Ex3Perfect {
	public static void main(String args[])
		{
			int number, factors=0, index=1;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a number: ");
			number = input.nextInt();
			
			while(index<=number/2)
				{
					if(number%index==0)
						factors+=index;
						
					index++;
				}
			if(factors==number)
				System.out.println("\nThis is a perfect number");
			else
				System.out.println("\nThis is not a perfect number");
		}
}