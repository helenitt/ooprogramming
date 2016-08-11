//Exercise3TimesTables.java
/*This program prompts the user for a number, and 
 *displays the n times table where n can be any whole 
 *number between 1 and 12 inclusive*/

import java.util.Scanner;

public class Exercise3TimesTables {
	public static void main(String args[])
		{
			int n;
			
			Scanner input = new Scanner(System.in);
				
			System.out.print("What number do you wish to display the times-table for? ");
			n = input.nextInt();
			
			while (n<1 || n>12)
				{
					System.out.print("Invalid! You must enter a value from 1-12. Please re-enter: ");
					n = input.nextInt();
				}   
				
			System.out.println("\n\n=====The " + n + " Times Table=====\n");
			
			for(int i=0;i<=12;i++)
				{
					System.out.println(n + " times " + i + " = " + (n*i));
				}			
		}
}