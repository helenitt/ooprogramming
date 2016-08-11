//Exercise5Fibonacci.java
/*This program will display all the Fibonacci numbers smaller 
 *than 5000*/

public class Exercise5Fibonacci {
	public static void main(String args[])
		{
			String allFibs="";
			int fib, lastFib=1, secondLastFib=1;
			
			for(int i=0;i<=100000;i++)
				{
					fib = lastFib + secondLastFib;
					secondLastFib = lastFib;
					lastFib = fib;
					
					if(fib>=5000)
						break;
						
					allFibs += ", " + fib;
				}
			System.out.print("The Fibonacci numbers < 5000 are:\n\n1, 1" + allFibs);	
		}
}