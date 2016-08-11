// version 4 LinkedList instead of array
// please note that the compiler will issue a warning message, but you can still run the program
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*; // ADDED
/** manages a collection of bikes, holding the info in a LinkedList */

//use of annotation to supress compiler warning



@SuppressWarnings({"unchecked", "deprecation"})

public class BicycleFrame4 extends JFrame implements ActionListener{
    
     JMenu fileMenu,bikeMenu;
     ArrayList <Bicycle> bikes; // set of bikes : CHANGED
    // int count; NOT NEEDED
     
    // driver 
    public static void main( String[] args ) {
        BicycleFrame4 frame = new BicycleFrame4();
        frame.setVisible(true);
    }
    
    // constructor
    public BicycleFrame4( ) {
        newSystem();
        //set the frame default properties
        setTitle     ( "Bike repair shop system" );
        setSize      ( 400,200 );
        setLocation  ( 100,100 );
        Container pane = getContentPane();
      //  pane.setBackground(Color.blue);
        pane.setBackground(new Color(240,210,240));
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
        createFileMenu();
        createBikeMenu();
        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(bikeMenu);
     }     
      
      // CHANGED
      public void newSystem() {
      	bikes = new ArrayList<Bicycle>();
        }
      
      /** writes the array of bicycles to the file "bikes.dat"
       */   // UNCHANGED
      public void save() throws IOException {
      	ObjectOutputStream os;
      	os = new ObjectOutputStream(new FileOutputStream ("bikes.dat"));
      	os.writeObject(bikes);
      	os.close();
      }
      
      /** loads an array of bicycles from the file "bikes.dat"
       */  // CHANGED
      public void open() {
      	try{
      	  ObjectInputStream is;
      	  is = new ObjectInputStream(new FileInputStream ("bikes.dat"));
          bikes  = (ArrayList<Bicycle>) is.readObject(); // CHANGED
      	  is.close();
      	}
      	catch(Exception e){
      		JOptionPane.showMessageDialog(null,"open didn't work");
      		e.printStackTrace();
      	}
      	// counting valid bikes not needed
      } // end open()
      
     // MINOR CHANGES
      public void addBicycle(){
      	Bicycle temp = new Bicycle();
      	temp.setOwner(JOptionPane.showInputDialog("Who owns this bike?"));
      	bikes.add(temp); // CHANGED
      }
      
      // MINOR CHANGES: NOTE USE OF GET
      public void display(){
      	JTextArea area = new JTextArea();
      	int numBikes = bikes.size();
      	if (numBikes>0) {
      	  area.setText("Bicycle List: needs better output formatting\n\n");
      	  for (int i = 0; i<numBikes; i++) 
      	    area.append("Bike no: " + i + " " + bikes.get(i).toString()+"\n");
      	  showMessage(area);
      	}
      	else
      	    showMessage("No bicycles in the system");
      } // end display
      
      
      // Version of display which uses an iterator
      public void display2(){
      	int numBikes = bikes.size();
      	if (numBikes <1) 
           		showMessage("No bicycles in the system");
        else {
        	JTextArea area = new JTextArea();
      		Iterator <Bicycle> iterator = bikes.iterator( );
        	while ( iterator.hasNext( ) ) 
        	    // uses polymorphic 'toString()' to avoid the type cast
        	    // typecast still needed if using the 'get' methods
            	area.append(iterator.next( ) + "\n");
            showMessage(area);
        }   	    
      } // end display2
      
      // NOT CHANGED
      public void actionPerformed (ActionEvent e) {
      	if (e.getActionCommand() .equals ("Quit")){
      	 showMessage("Shutting down the system");
      	 System.exit(0);
      	}
      	else if (e.getActionCommand() .equals ("Add")){
      	   addBicycle(); // branch to a separate method
      	}
      	else if (e.getActionCommand() .equals ("Display")){
           display();
      	}
      	else if (e.getActionCommand() .equals ("New File")){
      		newSystem();
        }
      	else if (e.getActionCommand() .equals ("Save")){
       	 try{
      	 	save();
      	 	showMessage("Data saved successfully");
      	 } // try
      	 catch (IOException f){
      	 	showMessage("Not able to save the file:\n"+
      	 	"Check the console printout for clues to why ");
      	 	f.printStackTrace();
      	 }// catch
      	}// else if
      	
      	else if (e.getActionCommand() .equals ("Open")){
      	 open();
         display();
      	}
      	else
      	  showMessage("I have no idea what you clicked");
      } // actionPerformed
      
        private void createFileMenu(){
         // create the menu
      	fileMenu = new JMenu("File");
      	// declare a menu item (re-usable)
      	JMenuItem item;
      	item = new JMenuItem("Save");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	item = new JMenuItem("Open");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	item = new JMenuItem("New File");
      	item.addActionListener(this);
      	fileMenu.add(item);
      	// create the 'quit' option
      	fileMenu.addSeparator();
      	item = new JMenuItem("Quit");
      	item.addActionListener(this);
      	fileMenu.add(item);
      }
      
      private void createBikeMenu(){
      	// create the menu
      	bikeMenu = new JMenu("Bicycle");
      	// declare a menu item (re-usable)
      	JMenuItem item;
      	
      	item = new JMenuItem("Add");
      	item.addActionListener(this);
      	bikeMenu.add(item);
      	
      	item = new JMenuItem("Display");
      	item.addActionListener(this);
      	bikeMenu.add(item);
      }
       /** utility methods to make the code simpler */
      public void showMessage (String s){
      	JOptionPane.showMessageDialog(null,s);
      }
      
      public void showMessage (JTextArea s){
      	JOptionPane.showMessageDialog(null,s);
      }
}