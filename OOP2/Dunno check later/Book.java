//Book.java
/**/

public class Book {
	private String title, isbn;
	private double price;
	private int pages;
	
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getPages() {
		return pages;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public Book(String title, double price, String isbn, int pages) {
		this.title = title;
		this.price = price;
		this.isbn = isbn;
		this.pages = pages;	
	}
	public Book() {
		this("No Title",0.00,"No ISBN",0);
	}
	
	public String toString() {
		return String.format("Title: %-20s\nPrice: E%-20.2f\nISBN: %-20s\nNo of Pages: %-20d\n\n", 
			getTitle(), getPrice(), getIsbn(), getPages());
	}
}
