//L13Ex2ConfirmDialogBox.java
/*This program called uses the method above to display a confirmation 
 *dialog. When the user interacts with this component at runtime, then 
 *there are a number of possible outcomes from the method*/

import javax.swing.JOptionPane;
public class L13Ex2ConfirmDialogBox {
	public static void main(String args[])
		{
			int result;
			
			result = JOptionPane.showConfirmDialog(null,"Take yoour pick - Yes, No or Cancel");
			
			if(result==0)
				JOptionPane.showMessageDialog(null,"You chose Yes","Yes",
										     JOptionPane.PLAIN_MESSAGE);	
			else if(result==1)
				JOptionPane.showMessageDialog(null,"You chose No","No",
										     JOptionPane.PLAIN_MESSAGE);
			else if(result==2)
				JOptionPane.showMessageDialog(null,"You chose Cancel","Cancel",
										     JOptionPane.PLAIN_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"You closed the window without selecting","Close",
										     JOptionPane.PLAIN_MESSAGE);	
		}
}