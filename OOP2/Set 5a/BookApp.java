//BookApp.java
/*Application program for the Instanciable class definition 
 *for a Book.*/

import java.util.Scanner;

public class BookApp {
	public static void main(String args[]) {
		
		String title, isbn;
		double price;
		int pages, numBooks;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many books would you like top enter? ");
		numBooks = input.nextInt();
		input.nextLine();
		
		Book[] books = new Book[numBooks];
		
		for(int i=0; i<numBooks;i++) {
			System.out.print("\nTitle: ");
			title = input.nextLine();	
			System.out.print("Price: ");
			price = input.nextDouble();
			input.nextLine();
			System.out.print("ISBN: ");
			isbn = input.nextLine();
			System.out.print("No of Pages: ");
			pages = input.nextInt();
			System.out.print("\n");
			input.nextLine();
			
			Book b = new Book(title,price,isbn,pages);
			books[i] = b;		
		}
		System.out.println("\nThe books you entered are:- \n");
		
		for(int i=0; i<numBooks;i++) {
			System.out.printf(books[i].toString());		
		}
		
	}
}