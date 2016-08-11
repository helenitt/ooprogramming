//BookScreen.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *   JMenuFrame: includes one JMenuBar,2 JMenus and 3 
 *	 JMenuItem objects. 
 *   When a menu item is selected, a string showing which menu 
 *	 choice is selected will appear in a label on the frame.
 */
public class BookScreen extends JFrame implements ActionListener
{
   private JMenu fileMenu;  
   private JMenu bookMenu;
   private JLabel response; // to hold a result from the menus
   private String title= "";
   Book myBook;

    public static void main(String[] args) {
    	
        BookScreen frame = new BookScreen();
        frame.setVisible(true);		
    }
	
	//Constructor
    public BookScreen() {
        Container pane;

        setTitle     ("Book List");
        setSize      (400,250);
        setLocation  (800,400);
        setResizable (false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        pane = getContentPane( );
        pane.setLayout(new FlowLayout());

        //user-written methods to create two menus 
        createFileMenu();
        createBookMenu();

        //add menus to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(new Color(200,200,240));
        menuBar.add(fileMenu);
        menuBar.add(bookMenu);
        
        //ceate book object
        myBook = new Book(); 

        //create and position reponse label
        response = new JLabel("This is the Book List" );
        response.setSize(250, 50); 
        pane.add(response);
    } 

    //response when an item is clicked 
    public void actionPerformed(ActionEvent event) {
        String  menuName;
        // what's written on the item that was clicked
        menuName = event.getActionCommand(); 
        if (menuName.equals("Quit")) {
        	//Dissappears to quick
        	response.setText("You pressed " + menuName + " the program will now finish");
        	JOptionPane.showMessageDialog(null,"The system is Quitting, Goodbye!");
           	System.exit(0);
        }
        else if(menuName.equals("Add")) {
        	title = JOptionPane.showInputDialog("Enter book title: ");
        	myBook(title);      	
        	JOptionPane.showMessageDialog(null,"The book you entered is: " + myBook);		
        } 
        else {
           	response.setText("The book you entered is: " + myBook.getText());//Doesn't print title not sure why
        	JOptionPane.showMessageDialog(null,"The book you entered is: " + myBook);
        } 
    } 

    /**  Creates File menu and its menu items */
    private void createFileMenu( ) {
    	// declare a re-usable JMenuItem object
        JMenuItem    item; 
        
		// create the menu
        fileMenu = new JMenu("File");
        
		// create menu item
        item = new JMenuItem("Quit");    
        item.addActionListener( this );
        fileMenu.add( item );
    } 

    private void createBookMenu( ) {
        JMenuItem    item;

        bookMenu = new JMenu("Book");

        item = new JMenuItem("Add");      //Add
        item.addActionListener(this);
        bookMenu.add( item );

        item = new JMenuItem("Display");    //Display
        item.addActionListener(this);
        bookMenu.add(item);
    } 
}