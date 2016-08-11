//L3Ex1MenCalc.java
/*This program will present the user with a menu of options, the 
 *user will be asked to enter their preferred choice and the program 
 *will proceed to carry out the appropriate action*/
 
 import javax.swing.JOptionPane;
 
 public class L3Ex1MenCalc {
 	public static void main(String args[])
	 	{
	 		String menu = "1. Calculate the area of a triangle\n" +
	 					  "2. CCalculate the volume of a cone\n3. Quit\n\n\n";
	 		String choiceAsString, aAsString, bAsString, cAsString, rAsString, hAsString; 
	 		int choice;
	 		float sideA, sideB, sideC, s, area=0, r, h, volume=0;
	 		final float PI = 3.14f;
	 		
	 		choiceAsString = JOptionPane.showInputDialog(menu + "Please enter your choice (1-3)");
	 		choice = Integer.parseInt(choiceAsString);
	 		
	 		if(choice>0 && choice<4)
		 		{
		 			switch(choice)
				 		{
				 	
				 			case 1:
					 			{
					 				aAsString = JOptionPane.showInputDialog("Please enter the length of the first side: ");
					 				bAsString = JOptionPane.showInputDialog("Please enter the length of the second side: ");
					 				cAsString = JOptionPane.showInputDialog("Please enter the length of the third side: ");
					 				
					 				sideA = Float.parseFloat(aAsString);
					 				sideB = Float.parseFloat(bAsString);
					 				sideC = Float.parseFloat(cAsString);
					 				
					 				s = (sideA + sideB + sideC) / 2;		 				
					 				area = (float)Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
					 				
					 				JOptionPane.showMessageDialog(null,"The area of the triangle is " +
					 											  String.format("%.3f",area) + " metres squared ",
					 											  "Triangle Area",
					 											  JOptionPane.INFORMATION_MESSAGE);
					 				
					 				break;
					 			}
					 		case 2:
						 		{
						 			rAsString = JOptionPane.showInputDialog("Please enter the radius of the cone: ");
						 			hAsString = JOptionPane.showInputDialog("Please enter the height of the cone: ");
						 			
						 			r = Float.parseFloat(rAsString);
						 			h = Float.parseFloat(hAsString);
						 			
						 			volume = (PI*(r*r)*h)/3;
						 			
						 			JOptionPane.showMessageDialog(null,"The volume of the cone is " +
					 											  String.format("%.3f",volume) + " metres cubed ",
					 											  "Cone Volume",JOptionPane.INFORMATION_MESSAGE);
					 				break;
						 		}
						 	case 3:
							 	{
							 		JOptionPane.showMessageDialog(null,"Thanks for using the system. Goodbye!",
							 									  "Farewell",JOptionPane.INFORMATION_MESSAGE);
							 		break;
							 	}
						}	 		
		 		}
		 	else
		 		{
		 			JOptionPane.showMessageDialog(null,"Sorry - you must have entered an invalid choice",
							 					  "Warning Message",JOptionPane.INFORMATION_MESSAGE);
		 		}
	 		
			System.exit(0);
	 	}
 }