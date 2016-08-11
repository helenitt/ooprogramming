//Fibonacci.java
/*This program will list all the Finonacci numbers beloww 5,000*/

public class Fibonacci {
	public static void main(String args[])
		{
			String allFib="";
			int fib, lastFib=1, secondLastFib=1;
			
			for(int i=0;i<100000;i++)
				{
					fib = lastFib + secondLastFib;
					secondLastFib = lastFib;
					lastFib = fib;
					
					if(fib>=5000)
						break;
											
					allFib += fib + ", ";											
				}
			System.out.println("The Finonacci numbers < 5000 are: \n\n1, 1, " + allFib);
		}
}