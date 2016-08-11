//Exercise3.java
/*This program uses a counter-controlled while loop to read in the weights of 
 *exactly 5 people. The program should determine the average weight along with 
 *the percentage of people whose weight is at least 80kg. It should display 
 *the average to 2 decimal places*/
 
 import java.util.Scanner;
 
 public class Exercise3 {
 	public static void main(String args[])
 		{
 			float weight=0, totalWeight=0, over80=0, largest=0, smallest=0;
 			int count=0;
 			
 			Scanner input = new Scanner(System.in);
 			
 			while(count<5)
 				{
 					System.out.print("Please enter the weight of person " + (count+1) + ": ");
 					weight = input.nextFloat();
 					
 					totalWeight += weight;
 					
 					if (weight>80)
 						over80++;
 					
 					if(count==0)
						{
							largest = weight;
							smallest = weight;
						}
					else
						{
							if(weight>largest)
								largest = weight;
							else if(weight<smallest)
								smallest = weight;
						}
 					
 					count++;
 				}
 			System.out.println("\n\n\n========================================" +
 							   "\n\tProgram Results" +
 							   "\n========================================" +
 							   "\n\nAverage weight: " + String.format("%.2f",totalWeight/count) +
 							   "kg\nPercentage >= 80kg: " + String.format("%.2f",over80/count*100) + 
 							   "%" + "\n\nLargest Number: " + largest +
							   "\nSmallest Number: " + smallest);	
 		}
 }