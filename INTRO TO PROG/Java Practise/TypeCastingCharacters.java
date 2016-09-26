//TypeCastingCharacters.java

public class TypeCastingCharacters {
	public static void main(String args[])
		{
			int ASCIICodeDegree = 248, ASCIICodeRegistration =169;
			
			System.out.println("The ASCII code for the degree symbol is " + ASCIICodeDegree +
							   "\nThe symbol for this character is " + (char)ASCIICodeDegree);
							   
			System.out.println("\nThe ASCII code for the registration symbol  is " + ASCIICodeRegistration +
							   "\nThe symbol for this character is " + (char)ASCIICodeRegistration);
	}
}