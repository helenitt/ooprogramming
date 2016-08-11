//CounterControlledWhile3.java
/*This program reads in 10 user-supplied numbers and determines the 
 *largest and the smallest of the values entered*/

import java.util.Scanner;

public class CounterControlledWhile3 {
	public static void main(String args[])
		{
			float number, largest=0, smallest=0;
			int count=0;
			
			Scanner input = new Scanner(System.in);
			
			while(count<10)
				{
					System.out.print("Iteration " + (count+1) + "- please enter a number: ");
					number = input.nextFloat();
					
					if(count==0)
						{
							largest = number;
							smallest = number;
						}
					else
						{
							if(number>largest)
								largest = number;
							else if(number<smallest)
								smallest = number;
						}
					count++;
				}
			System.out.println("\n\n\n====================" +
							   "\n\tProgram Results" +
							   "\n====================" +
							   "\n\nLargest Number: " + largest +
							   "\nSmallest Number: " + smallest);
		}
}