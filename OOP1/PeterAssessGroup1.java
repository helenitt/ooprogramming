//PeterAssessGroup1.java
/*This program reads in the gross income and the class of 
 *the citizen then displays the PRSI that the citizen must pay*/

import javax.swing.JOptionPane;

public class PeterAssessGroup1 {
	public static void main(String args[])
		{
			String incomeAsString, classAsString;
			float grossIncome, PRSI;
			
			incomeAsString = JOptionPane.showInputDialog("Please enter the gross income of the citizen");
			grossIncome = Float.parseFloat(incomeAsString);	
				
			classAsString = JOptionPane.showInputDialog("Please enter the PRSI class of the citizen");
			
			PRSI = PRSICalculator(grossIncome, classAsString);
			
			JOptionPane.showMessageDialog(null,"The PRSI due by the citizen is €" + PRSI,
										  "PRSI Calculator",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}
	public static float PRSICalculator(float g, String c)
		{
			float PRSI;
			
			switch ("c")
				{
					case "A":
							if(g>18304)
								PRSI = g/100*4;
							else
								PRSI = 0;
								
					case "B":
					case "C":
					case "D":
							if(g<75036)
								{
									PRSI = g/100*0.9f;
								}
							else
								{
									PRSI = (75036/100*0.9f) + (g-75036/100*4);
								}						
					case "S":
							if(g/100*4>500)
								{
									PRSI = g/100*4;
								}
							else
								{
									PRSI = 0;
								}
					default:
							PRSI = 0;
				}
			return PRSI;
		} 
}