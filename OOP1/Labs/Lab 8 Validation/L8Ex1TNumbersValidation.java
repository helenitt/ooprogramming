//L8Ex1TNumbersValidation.java
/*This program prompts the user for an arbitrary amount of t-numbers (end
 *of input is signaled by the user hitting return) and validates each one*/
 
 import javax.swing.JOptionPane;
 
 public class L8Ex1TNumbersValidation {
 	public static void main(String args[])
 		{
 			String tNum, tList="";
 			int validCount=0;
 			
 			do{
 				tNum = JOptionPane.showInputDialog("Please enter a t-number (return to exit)");
 				if(tNum.equals(""))
		 				break;
 				if(tNum.length()==9 && (tNum.charAt(0)=='T' || tNum.charAt(0)=='t'))
	 				{
	 					if(Character.isDigit(tNum.charAt(1)) && Character.isDigit(tNum.charAt(2)) && Character.isDigit(tNum.charAt(3)) &&
	 					   Character.isDigit(tNum.charAt(4)) && Character.isDigit(tNum.charAt(5)) && Character.isDigit(tNum.charAt(6)) &&
	 					   Character.isDigit(tNum.charAt(7)) && Character.isDigit(tNum.charAt(8)))
	 					   {
	 					   		tList += tNum + "\n";
	 					   		validCount++;
	 					   		
	 					   		
	 					   }
	 					 else
		 					 {
		 					 	tNum = JOptionPane.showInputDialog("Invalid! Please re-enter a t-number (return to exit)");
		 					 	if(tNum.equals(""))
		 					 		break;
		 					 }
	 				}
 				else
 					tNum = JOptionPane.showInputDialog("Invalid! Please re-enter a t-number (return to exit)");	
 				
 			}while(!tNum.equals(""));
 			
 			if(tList.equals(""))			 	
 			      JOptionPane.showMessageDialog(null, "You entered no valid t-numbers!", "Valid t-numbers",
 										  JOptionPane.INFORMATION_MESSAGE);
 			else
 			
	 			  JOptionPane.showMessageDialog(null, "Number of valid t-numbers entered: " +
	 					   			validCount + "\nList of valid t-numbers:\n\n" + tList, "Valid t-numbers",
 										  JOptionPane.INFORMATION_MESSAGE);	
 										  
 			System.exit(0);
 		}
 } 