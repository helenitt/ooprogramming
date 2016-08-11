////BicycleFrame2.java
/*This program is a subclass of JFrame and utilises JFrame components.*/

import javax.swing.*;
import java.awt.*;

public class BicycleFrame2 extends JFrame {
	public static void main(String[] args) {
		BicycleFrame2 win = new BicycleFrame2();
		win.setVisible(true);	
	}
	//Constructor
	public BicycleFrame2() {
		this.setTitle("Bicycle Shop");
		setSize(400,200);
		setLocation(100,200);
		Container pane = getContentPane();
		//pane.setBackground(Color.blue);
		pane.setBackground(new Color(220,240,240)); 
		//setIconImage(BicycleFrame);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}