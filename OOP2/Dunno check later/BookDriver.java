//BookDriver.java
/**/

public class BookDriver {
	public static void main(String args[]) {
		
		Book books = new Book("Fudge", 10.00, "G123456789", 300);
		
		System.out.printf(books.toString());
	}
}
