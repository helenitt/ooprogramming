//L3Ex1Menu.java
/*This program presents the user with a menu of options then
 *will proceed to carry out the appropriate action*/

import javax.swing.JOptionPane;

public class L3Ex1Menu {
	public static void main(String args[])
		{
			String menu = "1.Calculate the area of a triangle\n" +
						  "2.Calculate the volume of a cone\n3.Quit" +
						  "\n\n\nPlease enter your coice(1-3)",
				   optionAsString,aAsString,bAsString,cAsString,
				   rAsString,hAsString;
			float a,b,c,s,r,h,area,volume;
			final float PI=3.142f;
			int option;
 			
 			optionAsString = JOptionPane.showInputDialog(menu);
 			
 			option = Integer.parseInt(optionAsString);
 			
 			switch(option)
 				{
 					case 1:
	 					aAsString = JOptionPane.showInputDialog("Please enter the length of the first side: ");
	 					bAsString = JOptionPane.showInputDialog("Please enter the length of the second side: ");
	 					cAsString = JOptionPane.showInputDialog("Please enter the length of the third side: ");
	 					
	 					a = Float.parseFloat(aAsString);
	 					b = Float.parseFloat(bAsString);
	 					c = Float.parseFloat(cAsString);
	 					
	 					s = (a+b+c)/2;
	 					area = (s*(s-a)*(s-b)*(s-c));
	 					
	 					JOptionPane.showMessageDialog(null,"The area of the triangle is " + 
	 							    String.format("%.3f",Math.pow(area,0.5)) + " metres squared ",
	 							    "Triangle Area", JOptionPane.INFORMATION_MESSAGE);
	 					System.exit(0);
	 				case 2:
	 					rAsString = JOptionPane.showInputDialog("Please enter the radius of the cone: ");
	 					hAsString = JOptionPane.showInputDialog("Please enter the height of the cone: ");
	 					
	 					r = Float.parseFloat(rAsString);
	 					h = Float.parseFloat(hAsString);
	 					
	 					volume = (PI*(r*r)*h)/3;
	 					
	 					JOptionPane.showMessageDialog(null,"The volume of the cone is " +
	 							    String.format("%.3f",volume) + " metres cubed ",
	 							    "Cone Volume", JOptionPane.INFORMATION_MESSAGE);
	 					System.exit(0);
	 				case 3:
	 					JOptionPane.showMessageDialog(null,"Thanks for using the system. Goodbye! ",
	 							    "Farewell", JOptionPane.INFORMATION_MESSAGE);
	 					System.exit(0);
	 				default:
	 					if(option<0 || option>3)
	 					JOptionPane.showMessageDialog(null,"Sorry - you must have entered an invalid choice - must be between 1 - 3 ",
	 					"Warning Message", JOptionPane.INFORMATION_MESSAGE);
	 					System.exit(0);
	 			}
		}
}