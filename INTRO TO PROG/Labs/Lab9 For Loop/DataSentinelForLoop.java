//DataSentinelForLoop.java
/*This program uses a for loop that reads in an arbitrary number 
 *of names. The program should determine the longest and shortest
 * names entered along with the percentage of names that contained 
 *at least 17 characters*/

import java.util.Scanner;

public class DataSentinelForLoop {
	public static void main(String args[])
		{
			String name, longest="", shortest="";
			int atLeast17=0, i;
			
			Scanner input = new Scanner(System.in);
			
			for(i=0;i<=100000;i++)
				{
					System.out.print("Please enter a name (hit return to exit): ");
					name = input.nextLine();
					
					if(name.equals(""))
						break;
						
					if(i==0)
						{
							longest = name;
							shortest = name;
						}
					else
						if(name.length()>longest.length())
							longest = name;
						else if(name.length()<shortest.length())
							shortest = name;
						
						if(name.length()>=17)
							atLeast17++;
				}
			if(longest.length()==0)
				System.out.println("\nYou entered no names at all");
			else
				System.out.println("\nThe longest name entered is " + longest +
								   "\nThe shortest name entered is " + shortest +
								   "\nThe percentage of names >=17 in length is " +
								   	String.format("%.2f",((float)atLeast17/i)*100));
		}
}