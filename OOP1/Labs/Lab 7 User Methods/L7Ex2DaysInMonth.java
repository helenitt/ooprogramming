//L7Ex2DaysInMonth.java
/*This program takes in the month number (a whole number in the range 1-12) 
 *and then calls a user-defined method numberDaysIn() which takes as an 
 *argument the month number and returns the number of days in that month 
 *to main(). The main() then displays this value*/
 
 import javax.swing.JOptionPane;
 
 public class L7Ex2DaysInMonth {
 	public static void main (String args[])
	 	{
	 		int monthNumber, noDays;
	 		String monthNumberAsString;
	 		
	 		monthNumberAsString = JOptionPane.showInputDialog("Please enter the number of a month (1-12) ");
	 		monthNumber = Integer.parseInt(monthNumberAsString);
	 		
	 		noDays = numberDays(monthNumber);
	 		
	 		if(monthNumber>=1 && monthNumber<=12)
	 			JOptionPane.showMessageDialog(null," There are " + noDays + " days in this month ","Message",
	 		                                 JOptionPane.INFORMATION_MESSAGE);
	 		else
	 			JOptionPane.showMessageDialog(null," Invalid you must enter a month between 1 and 12 ","Message",
	 		                                 JOptionPane.INFORMATION_MESSAGE);
	 		                                 
	 		System.exit(0);
	 	}
	 public static int numberDays(int num)
		 {
		 	int days;
		 	
		 	switch(num)
			 	{
			 		case 1:
			 		case 3:	
			 		case 5:	
			 		case 7:	
			 		case 8:	
			 		case 10:	
			 		case 12:	
			 			days = 31;
			 			break;
			 		case 2:
			 			days = 28;
			 			break;
			 		case 4:
			 		case 6:	
			 		case 9:	
			 		case 11:	
			 			days = 30;
			 			break;
			 		default:
			 			days = 0;
			 			break;
			 	}
			 return days;
		 }
 }