//Lab2Ex2TNumber.java
/**/

import java.util.Scanner;
 
 public class Lab2Ex2TNumber {
 	public static void main(String args[])
	 	{
	 		String number;
	 		int index=0;
	 		char character;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter the students t-number: ");
	 		number = input.nextLine();
	 		
	 		if(number.length() == 10)
	 			{
		 			if(number.charAt(0)=='T' || number.charAt(0)=='t')
		 				{
			 				index++; //Do I need this?
			 				
			 				while(index<number.length())
				 				{
				 					character = number.charAt(index);						

				 					if(character<'0' || character>'9')
						 				{
										 	System.out.println("\nInvalid! Some of the characters after the first one are not digits");	
											break;
										}
									else
										index++;					
								}	
							if(index==10)
								System.out.println("\nThe t-number entered is valid");
								
			 			}
			 		else
			 			System.out.println("\nInvalid! The t-number entered does not begin with a 't' or 'T'");			 			 		
		 		}
	 		else
	 			System.out.println("\nInvalid! The t-number entered does not contain 10 characters");
	 	}
 }