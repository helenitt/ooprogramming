//TypeCastingCharacters.javachar
/*This program shows another use of type-casting*/

public class TypeCastingCharacters {
	public static void main(String args[])
	{
		int ASCIICodeDegree = 248, ASCIICodeRegistration = 169;
		
		System.out.println("The ASCII code of the degree symbol is " +
			ASCIICodeDegree + "\nThe symbol for this character is " +
			(char)ASCIICodeDegree);
			
		System.out.println("\n\nThe ASCII code of the registration symbol is " +
			ASCIICodeRegistration + "\nThe symbol for this character is " +
			(char)ASCIICodeRegistration);
			
	}
}