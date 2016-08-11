//ButtonChaser.java

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonChaser extends JFrame {
	
	JButton button;
	
	/*Driver*/	
	public static void main(String[] args) {
		ButtonChaser win = new ButtonChaser();
		win.setVisible(true);		
	}
	
	//Constructor
	public ButtonChaser() {
		
		this.setTitle("The Button Chaser Application");
		setSize(275,170);
		setLocation(800,450);
		Container pane = getContentPane();
		pane.setBackground(new Color(240,220,240));
		pane.setLayout(new FlowLayout());
		ImageIcon img = new ImageIcon("bike.png");// still here because I like it!
		setIconImage(img.getImage());
		// create the button
		button = new JButton("Press Me!");
		// add button to the content
		pane.add(button);
		//set button location
		button.setLocation(20,100);
		// make the system listen when button is clicked	
		button.addActionListener(new ButtonListener());	
		button.setMnemonic('p');
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/** inner class to handle the button clicks */
	private class ButtonListener implements ActionListener {
	  int num1, num2; 
	  public void actionPerformed(ActionEvent e)
	  	{
			num1 = (int)(Math.random()* 230);
			num2 = (int)(Math.random()* 110); 
					
				button.setLocation(num1,num2);
	  	}
    }// end buttonlistener inner class
}