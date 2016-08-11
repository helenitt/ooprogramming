//Exercise1.java

import java.util.Scanner;

public class Exercise1 {
	public static void main(String args[])
		{
			int age;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your age: ");
			age = input.nextInt();
			
			if (age<20)
				System.out.println("\n\nYou are under 20 years of age");
				
			else 
				System.out.println("\n\nYou are at least 20 years of age");
		}
		
}