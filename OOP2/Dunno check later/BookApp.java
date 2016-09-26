//BookApp.java
/**/

import java.util.Scanner;
public class BookApp {
	public static void main(String args[]) {
		
		String title, isbn;
		double price;
		int pages, numBooks;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many books would you like top enter?");
		numBooks = input.nextInt();
		
		Book[] books = new Book[numBooks];
		
		for(int i=0; i<numBooks;i++) {
			System.out.print("Title: ");
			title = input.nextLine();
			input.nextLine();
			System.out.print("Price: ");
			price = input.nextDouble();
			System.out.print("ISBN: ");
			isbn = input.nextLine();
			input.nextLine();
			System.out.print("Number of Pages: ");
			pages = input.nextInt();
			System.out.print("\n");
			
			Book b = new Book(title,price,isbn,pages);
			books[i] = b;		
		}
		
		for(int i=0; i<numBooks;i++) {
			System.out.printf(books[i].toString());		
		}
		
	}
}
