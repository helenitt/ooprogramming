//Exercise1.java
/*This program uses a task-controlled while loop to determine 
 *the largest negative integer whose cube is less than -15000*/

public class Exercise1 {
	public static void main(String args[])
		{
			float value=0;
			
			while(Math.pow(value,3f)<=-15000)
				{
					value--;
				}
			System.out.println("\nThe largest negative integer whose " +
							  "cube is less than -15,000 is " + value);
		}
}