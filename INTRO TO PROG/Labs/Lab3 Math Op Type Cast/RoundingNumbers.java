//RoundingNumbers.java
/*This program shows how a number can be rounded using the 
 *format() method*/
 
 public class RoundingNumbers {
 	public static void main(String args[])
	 	{
	 		float number1 = 15.56f, number2 = 15.46f;
	 		
	 		System.out.println("The value of the first number is " + number1 +
	 				"\nTo the nearest whole number its value is " + 
	 				String.format("%.0f",number1));
	 		
	 		System.out.println("\n\nThe value of the first number is " + number2 +
	 				"\nTo the nearest whole number its value is " + 
	 				String.format("%.0f",number2));		
	 	}
 }