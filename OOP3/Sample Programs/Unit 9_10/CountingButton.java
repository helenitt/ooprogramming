import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/** Keeps track of clicks on a button, or values entered into the text field */
public class CountingButton extends JFrame implements ActionListener{

    private JButton button;  // what you see
    private int buttonCount; // holds the value behind the scenes
    private JTextField inputLine; // allows you to set a new value
    
    /** minimal driver */
    public static void main (String [] args) {   
		CountingButton mine = new CountingButton();
        mine.setVisible(true);
    }

    public CountingButton () {
        setTitle ("Click on button or type a number and enter");
        setSize (400, 500);
        setLocation(100,100);
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        // get the content pane and set properties
        Container contentPane = getContentPane();
        contentPane.setBackground (Color.blue);
        contentPane.setLayout(null); // so that we can use absolute positioning

        // construct a button, and set the number of clicks on it to 0
        button = new JButton("0");
        button.setBounds(110,230,80,40);
		button.addActionListener(this);
        contentPane.add(button);
        buttonCount = 0;

        // construct a text field
        inputLine = new JTextField();
        inputLine.setBounds(100,100,100,20);
        inputLine.addActionListener(this);
        contentPane.add(inputLine);
    }

    /** handles button clicks, and pressing 'enter' while in text field */
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (source == button) {
           buttonCount++;					// increase the count by 1
	    } 
	    else if (source == inputLine) {
	       String input = inputLine.getText();     // read the value
            inputLine.setText("");				   // clear the field
            buttonCount = Integer.parseInt(input); // get the number from the string
        }
        button.setText("" + buttonCount);  // show the new value on the button         
    }
}
