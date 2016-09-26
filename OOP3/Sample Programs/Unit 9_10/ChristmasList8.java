import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; 
/** system to keep track of a gift list
 @version 8:  generates a shopping list of items when 'view gifts' is clicked
*/
public class ChristmasList8 extends JFrame implements ActionListener {
    JButton giftButton, viewButton, quitButton, okButton;
    JLabel nameLabel, itemLabel, priceLabel;
    JTextField nameField, itemField, priceField;
    JPanel buttonPanel, giftPanel;
    ArrayList<Gift> myGifts = new ArrayList<Gift>();  // list to hold all the gifts
     
    /** minimal driver */
    public static void main( String[] args ) {
        ChristmasList8 frame = new ChristmasList8();
        frame.setVisible(true);
    }
    
    /** builds all the GUI objects and adds them to the content pane
     */
    public ChristmasList8( ) {
        setTitle     ( "Christmas Gift List" );
        setSize      ( 450,300 );
        setLocation  ( 200,100 );
        // set the overall layout for the frame
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout()); // this is the default anyway
        // build the gift panel and add it to the east side of the frame
        giftPanel = new JPanel();
        pane.add(giftPanel,BorderLayout.EAST);
        // set a size for the panel
        giftPanel.setPreferredSize(new Dimension(330,300));
        // build all the gift components and add them to the panel
        nameLabel = new JLabel("Name:");
        giftPanel.add(nameLabel);
        // likewise for the other components
        nameField = new JTextField(25);
        giftPanel.add(nameField);
        itemLabel = new JLabel("Item: ");
        giftPanel.add(itemLabel);
        itemField = new JTextField(25);
        giftPanel.add(itemField);
        priceLabel = new JLabel("Estimated Price:");
        giftPanel.add(priceLabel);
        priceField = new JTextField(10);
        priceField.addActionListener(new OkHandler()); 
        giftPanel.add(priceField);
        okButton = new JButton("OK");
        giftPanel.add(okButton);
        okButton.addActionListener(new OkHandler());
        
       // now build the button panel, and add it to the left of the screen 
        buttonPanel = new JPanel();
        pane.add(buttonPanel,BorderLayout.WEST);
        // set a size for the panel
        buttonPanel.setPreferredSize(new Dimension(100,300));
        // set button panel layout to a 3 x 1 grid
        buttonPanel.setLayout(new GridLayout(3,1,1,1));
        
        // build all the components for the button panel, and add them
        giftButton = new JButton("New Gift");
        buttonPanel.add(giftButton);
        viewButton = new JButton("View Gifts");
        buttonPanel.add(viewButton);
        quitButton = new JButton("Quit");
        quitButton.addActionListener(this);
        viewButton.addActionListener(this);
        giftButton.addActionListener(this);
        buttonPanel.add(quitButton);    
        
        giftPanel.setVisible(false); // hide the gift panel for the moment   
     }     // end constructor
     
     /** handles actions for all buttons except ok
      * view button not processed yet
      */
     public void actionPerformed(ActionEvent e){
     	if (e.getSource() == quitButton){
     		JOptionPane.showMessageDialog(null,"Going shopping now\n Goodbye and happy Christmas");
     		System.exit(0);
     	}
     	else if (e.getSource() == giftButton){
     		giftPanel.setVisible(true);
     		nameField.requestFocus(); 
     	}
     	else if (e.getSource() == viewButton){ // block added in version 8
     		// create a text area and set the heading
     		JTextArea output = new JTextArea("Shopping List\n");
     		/* there are easier and shorter ways to work thru the array list 
     		 * this version is included because it is closest to the array approach*/
     		 
     		// for each gift in the list
     		for (int i= 0; i<myGifts.size(); i++){
     		 	// get the item and append it to the text area
     		 	Gift g = myGifts.get(i);
     		 	output.append(g.getItem() + "\n");
     		}
     		// display the text area in a dialog: for icon need christmas_bells.gif in same folder
     		JOptionPane.showMessageDialog(null,output, "Christmas Shopping List", 
     			JOptionPane.PLAIN_MESSAGE, new ImageIcon("christmas_bells.gif"));
     	}
     }
     	
     private void clearFields() {
     	nameField.setText(" ");
     	itemField.setText(" ");
     	priceField.setText(" ");
     }	
        
    
    
     // special inner class to handle clicks on the okButton
     private class OkHandler implements ActionListener{
     	public void actionPerformed (ActionEvent e){
     		Gift latest = new Gift();
     		// read the data from the text fields
     		// package it into the Gift object
     		latest.setName(nameField.getText());
     		latest.setItem(itemField.getText());
     		latest.setPrice(Double.parseDouble(priceField.getText()));
     		// add this Gift object to my gift list (an ArrayList);
     		myGifts.add(latest);
     		JOptionPane.showMessageDialog(null,myGifts.toString());
     		clearFields();
     		giftPanel.setVisible(false); // hide the gift details entry panel
     	}
     	
     }
    
     
}