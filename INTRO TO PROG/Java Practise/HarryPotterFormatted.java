//HarryPotterFormatted.java
/**/

public class HarryPotterFormatted {
	public static void main(String args[])
		{
			String title = "Harry Potter and the Prisoner of Azkaban", author = "J.K. Rowlings", price = "EUR35.50";
			
			int pages = 317, year = 1999;
			
			String formatString = String.format("%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s\n%-20s%s",
			"Title: ", title, "Author: ", author, "Number of pages: ", pages, "Year Published: ",
			year, "Price: ", price);
			
			System.out.println(formatString);
		}
}
