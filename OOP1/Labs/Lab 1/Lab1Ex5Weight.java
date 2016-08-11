//Lab1Ex5Weight.java
/*This program firstly asks the user to enter their height in meters and 
 *their weight in kilos, it should not accept invalid values, then the 
 *program should calculate the BMI value for the individual and use the 
 *table given above to generate an appropriate message to the user*/

 import java.util.Scanner;
 
 public class Lab1Ex5Weight {
 	public static void main(String args[])
	 	{
	 		float weight, height=0f, bmi=0f;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter your weight: ");
	 		weight = input.nextFloat();
	 		
	 		if(weight>0)
		 		{
		 			System.out.print("Please enter your height: ");
	 				height = input.nextFloat();
	 				
	 				if(height>0)
				 		{
				 			bmi = (weight/(height*height));
				 			
				 			if(bmi<18.5)
				 				System.out.println("\n\nYour BMI is " + bmi + " so you are underweight");
				 			else if(bmi>18.5 && bmi<24.99)
				 				System.out.println("\n\nYour BMI is " + bmi + " so you are normal");
				 			else if(bmi>25 && bmi<29.99)
				 				System.out.println("\n\nYour BMI is " + bmi + " so you are overweight");
				 			else
				 				System.out.println("\n\nYour BMI is " + bmi + " so you are obese");		
				 		}
				 	else
				 		System.out.println("\n\nInvalid weight! Quitting program now ...");
			 		
		 		}
		 	else
		 		System.out.println("\n\nInvalid weight! Quitting program now ...");
	 	}
 }