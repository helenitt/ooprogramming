//Library.java

import javax.swing.*;
import java.text.*;

import java.util.*;

public class Library {
	public static void main (String args[])
	{
		GregorianCalendar borrowDate;
		GregorianCalendar returnDate;
		
		
		borrowDate = new GregorianCalendar (2015,9,18);
		returnDate = new GregorianCalendar ();
		
		//int m = 0,d = 0,y = 0;
		
		
		
		long days= Math.abs(returnDate.getTimeInMillis()-borrowDate.getTimeInMillis());
		
		
		long Nodays = days/ (1000*60*60*24);
	
	
		JOptionPane.showMessageDialog(null,Nodays);
		
				
		SimpleDateFormat f1 = new SimpleDateFormat("EEEE MM dd'th' yyyy");
		
		JOptionPane.showMessageDialog(null,f1.format(borrowDate.getTime()));
		
		

		
	}
}