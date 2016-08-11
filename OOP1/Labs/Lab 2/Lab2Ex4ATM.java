//Lab2Ex4ATM.java
/**/

import java.util.Scanner;

public class Lab2Ex4ATM {
	public static void main(String args[])
		{
			String menuText="***************ITT ATM***************\n\n\n" +
							"Please choose from the following transactions:\n\n" +
							"'D' is deposit\n'W' is withdrawal\n'X' is Exit the system" +
							"\n\nPlease enter your choice: ";
								
			float deposit, withdrawal, balance=1000f;
			char choice;
			
			Scanner input = new Scanner(System.in);
			
			do{
				System.out.print(menuText);
				choice = input.nextLine().toUpperCase().charAt(0);
								
				switch(choice)
					{
						case 'D':
								System.out.print("\nPlease enter the amount you wish to deposit: " );
								deposit = input.nextFloat();
								
								balance += deposit;
								
								System.out.println("\n\n\nYour balance is now " + String.format("%.2f",balance));
								break;
						case 'W':
								System.out.print("\nPlease enter the amount you wish to withdraw: " );
								withdrawal = input.nextFloat();
							
								balance -= withdrawal;
								
								System.out.println("\n\n\nYour balance is now " + String.format("%.2f",balance));
								break;
						case 'X':
								System.out.println("\n\n\nThank you for using the system ... goodbye");
					}
					
					if(choice == 'W' || choice == 'D')
						{
							System.out.print("Please hit return to continue .....");
							input.nextLine();
							input.nextLine();
							System.out.print("\n\n\n\n");
						}							
			}while(choice != 'X');
		}
}