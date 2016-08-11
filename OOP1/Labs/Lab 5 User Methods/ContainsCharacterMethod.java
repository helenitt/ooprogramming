//ContainsCharacterMethod.java
/*This program contains a user-defined method called containsCharacter() 
 *which is able to determine whether a user-supplied piece of text contains 
 *a certain character*/
 
 import javax.swing.JOptionPane;
 
 public class ContainsCharacterMethod {
 	public static void main(String args[])
	 	{
	 		String text, characterAsString;
	 		char character;
	 		
	 		text = JOptionPane.showInputDialog("Please enter a piece of text");
	 		
	 		characterAsString = JOptionPane.showInputDialog("Please enter a keyboard character");
	 		character = characterAsString.charAt(0);
	 		
	 		if(containsCharacter(text,character))
	 			JOptionPane.showMessageDialog(null,"The text you have entered contained the character " +
	 										  character,"Character Tester",JOptionPane.INFORMATION_MESSAGE);
	 		else
	 			JOptionPane.showMessageDialog(null,"The text you have entered does not contain the character " +
	 										  character,"Character Tester",JOptionPane.INFORMATION_MESSAGE);
	 		
	 		System.exit(0);
	 	}
	public static boolean containsCharacter(String s, char c)
		{
			boolean result = false;
			
			for(int i=0;i<s.length();i++)
				if(s.charAt(i)==c)
					{
						result = true;
						break;
					}
			return result;
		} 	
 }