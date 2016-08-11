//Q7MyApp.java
/*This application will prompt the user to enter their age into a text field, 
 *and will display the age in one year’s time. When ‘quit’ is clicked the
 *system should display a message and shut down.*/
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q7MyApp extends JFrame implements ActionListener {
    private JLabel promptLabel;
    private JLabel displayLabel;
    private JButton okButton;
    private JButton cancelButton;
    private JButton quitButton;
    private JTextField inputLine;
    int temp=0;
    
    public static void main(String[] args) {
        Q7MyApp frame = new Q7MyApp();
        frame.setVisible(true);
    }

    public Q7MyApp() {
        Container pane;
        
        setTitle     ("Age Next Year");
        setSize      (250,200);
        setLocation  (250,200);
        setResizable (false);
        
        pane = getContentPane( );
        pane.setLayout(new FlowLayout());
        
        promptLabel = new JLabel( "Please enter your age: ");
        pane.add(promptLabel);
        
        inputLine = new JTextField(5);
        //inputLine.setFont(new Font("Courier", Font.PLAIN, 14));
        pane.add(inputLine);
        inputLine.addActionListener(this);
        
        okButton = new JButton("OK");
        pane.add(okButton);

        cancelButton = new JButton("Cancel");
        pane.add(cancelButton);
        
        quitButton = new JButton("Quit");
        pane.add(quitButton);

        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
        quitButton.addActionListener(this);
        
        displayLabel = new JLabel("Your age next year will be: " + temp);
        pane.add(displayLabel);
        
        setDefaultCloseOperation( EXIT_ON_CLOSE );
    }
    
    public void actionPerformed(ActionEvent e) {
    	
    	if (e.getSource() == quitButton ) {
    	 	JOptionPane.showMessageDialog(null,"You clicked Quit");
            System.exit(0);
    	 }
        else if (e.getSource() == cancelButton) {
         	displayLabel.setText("You clicked Cancel"); 
         }
        else { 
            temp = Integer.parseInt(inputLine.getText());
    	 	temp += 1;
			displayLabel.setText("Your age next year will be: " + temp);
        } 
    }
} 