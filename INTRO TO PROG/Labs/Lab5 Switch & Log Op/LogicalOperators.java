//LogicalOperators.java
/**/

import java.util.Scanner;

public class LogicalOperators{
	public static void main(String args[])
		{
			int age, experience, mark;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your age: ");
			age = input.nextInt();
			
			System.out.print("Please enter the number of years experience you have: ");
			experience = input.nextInt();
			
			System.out.print("Please enter the mark you received on the entry test: ");
			mark = input.nextInt();
			
			if (age>=18 && age<=65 && (mark>=60 || experience>=5))
				System.out.println("\nCongratulations - You have the job!");
			else 
				System.out.println("\nSorry, you didn't get the job this time");	
		}
}