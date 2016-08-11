//L7Ex6ImpSquareGraphic.java
/*This program contains a method squareGraphic() that will 
 *display a solid square of hashes whose side is supplied by 
 *the user in main()*/

import javax.swing.JOptionPane;

public class L7Ex6ImpSquareGraphic {
	public static void main(String args[])
		{
			String numString, ch;
			int num;
			
			numString = JOptionPane.showInputDialog("Please enter the width of your square graphic");
			num = Integer.parseInt(numString);
			
			ch = JOptionPane.showInputDialog("Please enter the character you would like to use");
						
			squareGraphic(num, ch);
		}
	public static void squareGraphic(int n, String c)
		{
			String graphic="", square="";
			
			
			for(int i=0;i<n;i++)
				{
					graphic += c + "    ";	
				}
				
			for(int j=0;j<n;j++)
				{
					square += graphic + "\n";
				}
					
			JOptionPane.showMessageDialog(null,square,"Square Graphic",JOptionPane.PLAIN_MESSAGE);
										  
			System.exit(0);
		}
}