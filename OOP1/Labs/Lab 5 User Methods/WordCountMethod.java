//WordCountMethod.java
/*This program that contains a user-defined method called wordCount() 
 *which is able to determine and return the number of words within a 
 *piece of user-supplied text*/
 
 import javax.swing.JOptionPane;
 
 public class WordCountMethod {
 	public static void main(String args[])
	 	{
	 		String text;
	 		
	 		text = JOptionPane.showInputDialog("Please enter a piece of text");
	 		
	 		JOptionPane.showMessageDialog(null,"\n\nThe number of words in the text you entered is " +
	 											wordCount(text),"Word Count Results",JOptionPane.PLAIN_MESSAGE);
	 											
	 		System.exit(0);
	 	}
	 public static int wordCount(String text)
		 {
		 	int words=0;
		 	
		 	for(int i=0;i<text.length();i++)
			 	{
			 		if(text.charAt(i)==' ')
			 			words++;
			 	}
			 return words+1;
		 }
 }