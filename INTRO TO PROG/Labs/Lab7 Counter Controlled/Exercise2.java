//Exercise2.java
/*This program asks the user for their username and password combination. 
 *Assume here that the correct username is “t00012345” and that the correct
 * password is “java”. The user should be given at most 3 attempts to enter 
 *the correct username and password. If they fail to give the correct username/password 
 *combination the first 2 times an “Invalid username/password” message should appear 
 *and they should be told how many attempts they have left. If they fail the third 
 *time they should get a “banned” message as indicated below. If they enter the 
 *correct username/password they should receive a welcome message*/

import java.util.Scanner;

public class Exercise2 {
	public static void main(String args[])
		{
			String name, pass, userName="t00012345", password="java";
			int count=0;
			
			Scanner input = new Scanner(System.in);
			
			while(count<3)
				{
					System.out.print("Please enter your username: ");
					name = input.nextLine();
					System.out.print("Please enter your password: ");
					pass = input.nextLine();
					
					if((!name.equals(userName) || !pass.equals(password))  &&  count<3)						
							System.out.println("\n\nInvalid username/password combination. " + 
							(2-count) +  " attempts remaining\n");
															
					else
						{
						System.out.println("\n\nWelcome to the system!");
						break;
						}
							
					count++;
				}
			if(count==3)
				System.out.print("\n\nInvalid username/password combination. IP address noted. Banned for 24 hours");
		}
}