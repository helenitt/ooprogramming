//Lab7Ex4.java


import java.util.Scanner;

public class Lab7Ex4 {
	public static void main(String args[])
		{
			String text=" ";
			int index=0, digitCount=0;
			char character;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter text: ");
			text = input.nextLine();
			
			while(index<text.length())
				{
					character = text.charAt(index);
					
					if(character>='0' && character<='9')
						digitCount++;
					
					index++;											
				}
			if(digitCount == text.lenght())
				System.out.println("\nYou entered a pos no");	
			else
				System.out.println("\nYou not no");
		}
}
	