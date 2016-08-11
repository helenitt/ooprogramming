//Exercise2.java
/**/

public class Exercise2 {
	public static void main(String args[])
		{
			int value=1;
			
			while(Math.pow(value,2)<=5000)
				{
					value++;
				}
				
			System.out.println("\nThe lowest power of 2 that exceeds 5000 is " + value);			
		}
}