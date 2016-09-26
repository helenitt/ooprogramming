//ProblemSolving6AverageAge.java
/*Program that reads in an arbitrary number of children's ages and determines the average age of
the group to 1 decimal place using a terminating value of zero*/

import java.util.Scanner;

public class ProblemSolving6AverageAge{
	public static void main(String args[])
	{
		int age,totalAge=0,numberOfChildren=0;
		float averageAge;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the age of the first child (zero to exit): ");
		age = input.nextInt();
		
		while(age!=0)
		{
			totalAge = totalAge + age;
    		numberOfChildren = numberOfChildren + 1;
    		
    		System.out.print("Please enter the age of the next child (zero to exit): ");
			age = input.nextInt();
		}
		
		if(numberOfChildren>0)
		{
		  	averageAge = totalAge/(float)numberOfChildren;
	    	System.out.printf("\n\nThe average age of the children in the group is %.1f years old",averageAge); 	
		}
			
			
		System.out.println("\n\n\n");
				                 		
	}
}

