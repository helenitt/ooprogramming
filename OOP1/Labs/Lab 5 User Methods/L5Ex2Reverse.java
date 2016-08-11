//L5Ex2Reverse.java
/*This program uses a user-defined method called reverse() which takes a single 
 *String argument and returns it in reverse order. The main() method should then 
 *output the reversed string*/
 
 import javax.swing.JOptionPane;
 
 public class L5Ex2Reverse {
 	public static void main(String args[])
	 	{
	 		String text;
	 		
	 		text = JOptionPane.showInputDialog("Please enter a piece of text");
	 		
	 		JOptionPane.showMessageDialog(null,"\n\nThe text reversed is " +
	 								      reverse(text),"String Reversed",JOptionPane.PLAIN_MESSAGE);
	 											
	 		System.exit(0);
	 	}
	 public static String reverse(String text)
		 {
		 	String reverseText="";
		 			 			 	
		 	for(int i=text.length()-1;i>=0;i--)
			 	{
			 		reverseText += text.charAt(i);
			 	}
		 return reverseText;
		 }	 
 }
 	