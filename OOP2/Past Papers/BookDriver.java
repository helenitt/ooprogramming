//BookDriver.java
import javax.swing.*;
import java.util.*;

/**A driver class to prompt the user to enter book details and then
 *display them.
 *@Author Helen O'Brein
 *@version 1.0*/
public class BookDriver {
/**creates and displays a librry of books
 *@param args*/
	public static void main(String[] args) {
		String bookTitle, bookAuthor, fini = "";
		int numBooks;
		ArrayList library = new ArrayList();
		Book b;
		
		while(!fini.equals("f")) {
			bookTitle = JOptionPane.showInputDialog("Title: ");
			bookAuthor = JOptionPane.showInputDialog("Author: ");
			b = new Book(bookTitle,bookAuthor);
			library.add(b);
			fini = JOptionPane.showInputDialog("Press return to continue or f to exit");
		
		System.exit(0);	
		}
	}	
	class library {
		public void displayBooks(library library) {
			String mess = "";
			Iterator iter = library.iterator(); 
			
			while(iter.hasNext()) {
				mess += iter.next() + "\n";												            
			} //end while
					
			JOptionPane.showMessageDialog(null, mess);
			
		}
	}
}