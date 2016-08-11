//BicycleFrame.java
/*This program is a subclass of JFrame and utilises JFrame components.*/

import javax.swing.*;

public class BicycleFrame extends JFrame {
	public static void main(String[] args) {
		BicycleFrame win = new BicycleFrame();
		win.setVisible(true);	
	}
	//Constructor
	public BicycleFrame() {
		this.setTitle("Bicycle Shop");
		setSize(400,200);
		setLocation(100,200);
		//setIconImage(BicycleFrame);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
