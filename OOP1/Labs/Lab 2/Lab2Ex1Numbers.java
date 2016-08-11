//Lab2Ex1Numbers.java
/*This program reads in an arbitrary amount of positive 
 *whole numbers and displays information about them*/
 
 import java.util.Scanner;
 
 public class Lab2Ex1Numbers {
 	public static void main(String args[])
	 	{
	 		int number, total=0, count=0, odd=0, over100=0;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter a first +ve whole number (-1 to exit): ");
	 		number = input.nextInt();
	 		
	 		while(number != -1)
		 		{
		 			total += number;
		 			count++;
		 			
		 			if(number%2!=0)
		 				odd++;
		 			
		 			if(number>100)
		 				over100++;
		 				
		 			System.out.print("Please enter the next +ve whole number (-1 to exit): ");
	 				number = input.nextInt(); 				
		 		}
		 		
		 	System.out.println("\n\n========Results========\n\nNumber of values entered: " + count +
		 					   "\nNumber of odd values entered: " + odd + 
		 					   "\nNumber of values > 100 entered: " + over100 +
		 					   "\nAverage of the values entered: " + String.format("%.0f",((float)total/count)));
	 	}
 }