//Lab1Ex2InchConverter.java
/*This program reads in a whole number of inches and 
 *converts this into feet and inches*/
 
 import java.util.Scanner;
 
 public class Lab1Ex2InchConverter {
 	public static void main(String args[])
	 	{
	 		int inches;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter the total number of inches: ");
	 		inches = input.nextInt();
	 		
	 		System.out.println("\n\n" + inches + "\" is equivalent to " + inches/12 +
	 						   "'" + inches%12 + "\"");
	 	}
 }