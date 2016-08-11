//L5Ex1MinMethod.java
/*This program uses a user-defined method called minimum() that 
 *takes 2 user-supplied float values as arguments and returns the 
 *smaller of the 2 to main()*/
 
 import java.util.Scanner;
 
 public class L5Ex1MinMethod {
 	public static void main(String args[])
	 	{
	 		float no1, no2;
	 		
	 		Scanner input= new Scanner(System.in);
	 		
	 		System.out.print("Please enter a first number: ");
	 		no1 = input.nextFloat();
	 		
	 		System.out.print("Please enter a second number: ");
	 		no2 = input.nextFloat();
	 		
	 		System.out.println("\n\nThe smaller of the two numbers you entered is " +
	 						   String.format("%.1f",minimum(no1,no2)));
	 	
	 	}
	public static float minimum(float a, float b)
		{
			float min;
			if(a<=b)
				min = a;
			else
				min = b;
			return min;
		} 
 }