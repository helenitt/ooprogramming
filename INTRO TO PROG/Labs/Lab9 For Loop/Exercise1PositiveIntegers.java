//Exercise1PositiveIntegers.java
/*This program uses a for loop to calculate the sum of the 
 *first 20 positive integers, and then display this sum*/

public class Exercise1PositiveIntegers {
	public static void main(String args[])
		{
			int totalNumber=0;
			
			for(int number=0;number<=20;number++)
				totalNumber+=number;
				
			System.out.println("The sum of the first 20 positive integers is: " + totalNumber);
		}
}