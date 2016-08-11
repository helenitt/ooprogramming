//Library.java
/**/

import javax.swing.*;
import java.text.*;
import java.util.*;

public class Library {
	public static void main(String[] args) {
		
		int dateBor, monthBor, yearBor, dateRet, monthRet, yearRet;
		
		GregorianCalendar borrowDate, returnDate;
		
		dateBor = Integer.parseInt(JOptionPane.showInputDialog("Please enter date borrowed (DD): "));
		monthBor = Integer.parseInt(JOptionPane.showInputDialog("Please enter month borrowed (MM): "));
		yearBor = Integer.parseInt(JOptionPane.showInputDialog("Please enter year borrowed (YYYY): "));

		monthBor -= 1; //correction for months starting at 0

		borrowDate = new GregorianCalendar(yearBor,monthBor,dateBor);
		
		dateRet = Integer.parseInt(JOptionPane.showInputDialog("Please enter date returned (DD): "));
		monthRet = Integer.parseInt(JOptionPane.showInputDialog("Please enter month returned (MM): "));
		yearRet = Integer.parseInt(JOptionPane.showInputDialog("Please enter year returned (YYYY): "));
		
		monthRet -= 1; //correction for months starting at 0
		
		returnDate = new GregorianCalendar(yearRet,monthRet,dateRet);
		
		//change dates to number ie milliseconds, calculate difference, convert back to days
		long days= Math.abs(returnDate.getTimeInMillis()- borrowDate.getTimeInMillis());
		long numDays = days / (1000*60*60*24);
		
		SimpleDateFormat f1 = new SimpleDateFormat("EEEE MMMM dd'th', yyyy");
		
		JOptionPane.showMessageDialog(null,"Borrow date: " + f1.format(borrowDate.getTime()) + 
								      "\nReturn date: " + f1.format(returnDate.getTime()) +
								      "\nDays out: " + numDays);
		
		System.exit(0);
	}	
}