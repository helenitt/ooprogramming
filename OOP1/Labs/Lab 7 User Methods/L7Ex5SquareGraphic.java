//L7Ex5SquareGraphic.java
/*This program contains a method squareGraphic() that will 
 *display a solid square of hashes whose side is supplied by 
 *the user in main()*/

import javax.swing.JOptionPane;

public class L7Ex5SquareGraphic {
	public static void main(String args[])
		{
			String numString;
			int num;
			
			numString = JOptionPane.showInputDialog("Please enter the width of your square graphic");
			num = Integer.parseInt(numString);
			
			squareGraphic(num);
		}
	public static void squareGraphic(int n)
		{
			String graphic="", square="";
			
			
			for(int i=0;i<n;i++)
				{
					graphic += "#    ";	
				}
				
			for(int j=0;j<n;j++)
				{
					square += graphic + "\n";
				}
					
			JOptionPane.showMessageDialog(null,square,"Square Graphic",JOptionPane.PLAIN_MESSAGE);
										  
			System.exit(0);
		}
}