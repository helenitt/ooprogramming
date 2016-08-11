//Ex2.java
/**/

import javax.swing.JOptionPane;

public class Ex2 {
	public static void main(String args[])
		{
			int opt=0;
			
			opt = JOptionPane.showConfirmDialog(null,"Take your pick - yes, no or cancel",
			      "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(opt == 0)
				JOptionPane.showMessageDialog(null,"You chose yes",
				"Yes",JOptionPane.PLAIN_MESSAGE);
			else if(opt == 1)
				JOptionPane.showMessageDialog(null,"You chose no",
				"No",JOptionPane.PLAIN_MESSAGE);
			else if(opt == 2)
				JOptionPane.showMessageDialog(null,"You chose cancel",
				"Cancel",JOptionPane.PLAIN_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"You closed the window",
				"Close",JOptionPane.PLAIN_MESSAGE);			
		}
}