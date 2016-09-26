//RunTimeError.java

public class RunTimeError {
	public static void main(String args[])
		{
			float number = 1234.56f;
			
			System.out.println("The value of the variable number correct to 3 decimal " +
							   "places is " + String.format("%.3f",number));
							   
		}
}