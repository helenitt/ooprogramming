//L7Ex8CoinToss.java.java

/*This program asks the user how many times they wish to toss 
 *a coin and then simulates the tossing of said coin*/

import java.util.Scanner;

public class L7Ex8CoinToss {
	public static void main(String args[])
		{
			String toss="";
			int numTimes, headsCount=0, result, hPercent;
			double headsPercent;
				
			Scanner	input = new Scanner(System.in);
			
			System.out.print("Please enter the number of coin tosses you want: ");
			numTimes = input.nextInt();
			
			System.out.println("\n");
			
			for(int i=1; i<=numTimes; i++)
				{
					result = coinToss();
					
					if(result==0)
						{
							headsCount++;
							toss = "Heads";
						}
					else
						{
							toss = "Tails";
						}
					
					System.out.println("Coin toss " + i + ": " + toss);	
				}
				
			headsPercent = (double)headsCount/numTimes*100;
				
			System.out.println("\n\n====== Overall Results ======\n" +
							   "\nPercentage of heads: " + String.format("%.0f",headsPercent) + 
                               "%\nPercentage of tails: " + String.format("%.0f",(100-headsPercent)) + "%");
		}
	public static Integer coinToss()
		{
			int tossResult;
			tossResult = (int)(Math.random()*2);
			return tossResult;
		}
}