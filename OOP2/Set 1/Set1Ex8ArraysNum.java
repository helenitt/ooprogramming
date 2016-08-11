//Set1Ex8ArraysNum.java
/* This program asks the user to input a list of 10 integers. Store these 
 *values in an array and output the 1st and 5th values in the array.
 *Arrays.*/

import java.util.*;

public class Set1Ex8ArraysNum {
	public static void main(String[] args) {
		
		int num[] = new int[10];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<10; i++){
			System.out.print("Please enter an integer: ");
			num[i] = input.nextInt();
		}
		System.out.println("\n\n\nThe 1st value in the array is " + num[0]);
		System.out.println("\nThe 5th value in the array is " + num[4]);
	}
}