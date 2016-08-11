//L11Ex5ArrayNumbers.java
/**/

import java.util.Scanner;

public class L11Ex5ArrayNumbers {
	public static void main(String args[])
		{
			int num[] = new int[10];
			int i, largest=0, smallest=0;
			
			Scanner input = new Scanner(System.in);
			
			for(i=0; i<10; i++)
				{
					System.out.print("please enter an integer: ");
					num[i] = input.nextInt();
														
					if(num[i]>largest)
						largest = num[i];
					
					if(num[i]<smallest)
						smallest = num[i];
				}	
			System.out.println("\n\n\nThe first value in the array is " + num[0] +
							   "\n\nThe fifth value in the array is " + num[4] +
							   "\n\nThe largest number in the array is " + largest +
							   "\n\nThe smallest number in the array is " + smallest);
		}
}