//ReadingInVariables.java
/*This program declares variables of different types for 
 *storing the details of a book and then gets the user to 
 *supply values for the variables*/
 
 import java.util.Scanner;
 
 public class ReadingInVariables {
 	public static void main(String args[])
	 	{
	 		String author, title;
	 		int pages, yearPublished;
	 		float price;
	 		
	 		Scanner input = new Scanner(System.in);
	 		
	 		System.out.print("Please enter the title of the book: ");
	 		title = input.nextLine();
	 		
	 		System.out.print("Please enter the author of the book: ");
	 		author = input.nextLine();
	 		
	 		System.out.print("Please enter the number of pages in the book: ");
	 		pages = input.nextInt();
	 		
	 		System.out.print("Please enter the year the book was published: ");
	 		yearPublished = input.nextInt();
	 		
	 		System.out.print("Please enter the price of the book: ");
	 		price = input.nextFloat();
	 		
	 		System.out.println("\n\n======Book Details======\nTitle: " + title +
	 						   "\nAuthor: " + author + "\nNumber of pages: " + 
	 						   pages + "\nYeasr published: " + yearPublished +
	 						   "\nPrice: EUR" + price);
	 	}
 }