//projectEuler-problem1.java
/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

This program finds the sum of all the multiples of 3 or 5 below 1000. */

public class problem1 {
	public static void main(String args[]) {
		int total = 0;
		String numbers = "\n";
		
		for(int i=1;i<1000;i++) {
			if(i%3==0 || i%5==0) {
				total += i;
				numbers += i + ", ";
				
				if(i%10 == 0)
					numbers += "\n";			
			}
		}
		
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: " + total);
		System.out.println("These numbers are: " + numbers);
	}
}