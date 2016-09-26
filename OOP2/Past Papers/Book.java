//Book.java

/**An Instantiable class to model a book
 *@author Helen O'Brien
 *@version 1.0*/
public class Book {
	private String title;
	private String author;
	private static int numBooks;

/**A no argument constructor method which sets the details indirectly*/	
	public Book() {
		this("Unknown","Unknown");
	}
/**A 2 argument constructor method which sets the details directly
 *@param t the books title
 *@param a the books author*/
	public Book(String t, String a) {
		title = t;
		author = a;
		numBooks++;
	}

/**Accessor method to return the book title
 *@return title the book title*/	
	public String getTitle() {
		return title; 
	}
/**Accessor method to return the books author
 *@return author the books author*/	
	public String getAuthor() {
		return author; 
	}
/**Accessor method to return the number of books
 *@return numBooks the number of books*/ 
	public static int getNumBooks() {
		return numBooks;
	}
	
/**Mutator method to set the book title
 *@param t the book title*/
	public void setTitle(String t) {
		title = t;
	}
/**Mutator method to set the author of the book
 *@param a the books author*/
	public void setAuthor(String a) {
		author = a;
	}
	
/**toString method returning the book title and author
 *@return title and author as a string*/
	public String toString() {
		return String.format("Title: %s Author: %s", getTitle(), getAuthor());
	}
}