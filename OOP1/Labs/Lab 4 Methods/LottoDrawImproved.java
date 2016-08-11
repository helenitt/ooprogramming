//LottoDrawImproved.java
/*This program uses a for loop which simulates the lotto 
 *draw by selecting 7 random numbers from 1-42*/
 
 import javax.swing.JOptionPane;
 
 public class LottoDrawImproved {
 	public static void main(String args[])
	 	{
	 		int no1, no2, no3, no4, no5, no6, no7, count=1;
	 		String numbers="";
	 		
	 		no1 = (int)(Math.random()*42 + 1);
	 		numbers += no1 + "  ";
	 		
	 		no2 = (int)(Math.random()*42 + 1);
		 	while(no2==no1)
			 	{
			 		no2 = (int)(Math.random()*42 + 1);				 			
			 	}	
		 	numbers += no2 + "  ";
				 	
		 	no3 = (int)(Math.random()*42 + 1);
		 	while(no3==no1 || no3==no2)
			 	{
			 		no3 = (int)(Math.random()*42 + 1);				 			
			 	}	
		 	numbers += no3 + "  ";
				 	
		 	no4 = (int)(Math.random()*42 + 1);
		 	while(no4==no1 || no4==no2 || no4==no3)
			 	{
			 		no4 = (int)(Math.random()*42 + 1);				 			
			 	}	
		 	numbers += no4 + "  ";
		 	
		 	no4 = (int)(Math.random()*42 + 1);
		 	while(no4==no1 || no4==no2 || no4==no3)
			 	{
			 		no4 = (int)(Math.random()*42 + 1);				 			
			 	}	
		 	numbers += no4 + "  ";
		 	
		 	no5 = (int)(Math.random()*42 + 1);
		 	while(no5==no1 || no5==no2 || no5==no3 || no5==no4)
			 	{
			 		no5 = (int)(Math.random()*42 + 1);				 			
			 	}	
		 	numbers += no5 + "  ";
		 	
		 	no6 = (int)(Math.random()*42 + 1);
		 	while(no6==no1 || no6==no2 || no6==no3 || no6==no4 || no6==no5)
			 	{
			 		no6 = (int)(Math.random()*42 + 1);				 			
			 	}	
		 	numbers += no6 + "  ";
				 	
		 	JOptionPane.showMessageDialog(null,"The Lotto numbers are:\n" + numbers,"Lotto Draw",
		 	JOptionPane.PLAIN_MESSAGE);
		 	
		 	System.exit(0);	
	 	}
 }