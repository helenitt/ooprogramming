//ProjectEuler-problem3.java
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?
*/

public class problem3 {
	public static void main(String args[]) {
		long factor = 1, largestFactor = 0, number = 600851475143;
		
		while(factor < 300425737571) {
			if(number % factor == 0)
				largestFactor = factor;
			factor++;	
		}
		System.out.println("The largest prime factor of the number 600851475143 is: " + largestFactor);	
	}
}