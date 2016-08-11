//L13Ex1DialogBoxes.java
/*You should now look up the Java API documentation and locate the 
 *JOptionPane class. Then you should write a short program which 
 *uses each of the other 3 icons that you have not seen before */
 
 import javax.swing.JOptionPane;
 
 public class L13Ex1DialogBoxes {
 	public static void main(String arrgs[])
	 	{
	 		JOptionPane.showMessageDialog(null,"This message dialog uses an Error message icon",
	 									  "Error!",JOptionPane.ERROR_MESSAGE);
	 		
	 		Object[] options = { "OK", "CANCEL" };
	 		JOptionPane.showOptionDialog(null,"Click OK to continue","Warning",
	 									 JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,
	 									 null,options,options[0]);
	 		
	 		JOptionPane.showMessageDialog(null,"This message dialog uses an Warning message icon",
	 									  "Warning",JOptionPane.WARNING_MESSAGE);
	 									  
	 		JOptionPane.showMessageDialog(null,"This message dialog uses an Question message icon",
	 									  "Question",JOptionPane.QUESTION_MESSAGE);	
	 	}
 }