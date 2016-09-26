//Q2.java
/*This program determines whether or not a person is eligible to join the RDF*/

import java.util.Scanner;

public class Q2 {
	public static void main(String args[])
		{					
			String gender,medical,record,gardai;
			int age;
			float height;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter your age: ");
			age = input.nextInt();
			
			if(age>17 && age<35)
				{
					System.out.print("Please enter your height: ");
					height = input.nextFloat();
					
					System.out.print("Please enter your gender (male or female): ");
					input.nextLine();
					gender = input.nextLine();
					
					if((gender.equals("male") && height >= 1.55) || (gender.equals("female") && height >= 1.3))
						{
							System.out.print("Did you pass the medical exam (yes or no): ");
							medical = input.nextLine();
							
							if(medical.equals("yes"))
								{
									System.out.print("Do you have a criminal record (yes or no): ");
									record = input.nextLine();
									
									if(record.equals("no"))
										{
											System.out.print("Are you currently serving with the Gardai (yes or no): ");
											gardai = input.nextLine();
											
											if(gardai.equals("no"))
												System.out.println("\nYou are eligible to join the RDF");
											else
												System.out.println("\nYou are not eligible to join the RDF");
										}
									else
										System.out.println("\nYou are not eligible to join the RDF");	
								}
							else
								System.out.println("\nYou are not eligible to join the RDF");	
						}
					else
						System.out.println("\nYou are not eligible to join the RDF");
				}
			else
			    System.out.println("\nYou are not eligible to join the RDF");
			    
				
		}
}	



