//L7Ex1Pendulum.java
/*This program first of all reads in the length, l, of a pendulum and 
 *then calls a user-defined method periodCalculator() that calculates 
 *the period of a pendulum*/
 
 import java.util.Scanner;
 
 public class L7Ex1Pendulum {
 	public static void main(String args[])
	 	{
	 		double length, period;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter the length of the pendulum: ");
	 		length = input.nextDouble();
	 		
	 		period = periodCalculator(length);
	 		
	 		period = 2*Math.PI*Math.sqrt(periodCalculator(length));
	 		
	 		System.out.println("\nThe period of the pendulum is " +  
	 							String.format("%.3f",(period)) + " seconds");
	 	}
	 public static double periodCalculator(double a)
		 {
		 	final float G=9.8f;
		 	double period;
		 	period = a/G;
		 	return period;
		 }
 }