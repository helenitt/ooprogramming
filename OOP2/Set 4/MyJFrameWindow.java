//MyJFrameWindow.java
/*Messes with a GUI*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJFrameWindow extends JFrame {
	
	//Application
	public static void main(String[] args) {
		MyJFrameWindow frame = new MyJFrameWindow();
		frame.setVisible(true);
	}
	
	//Constructor
	public MyJFrameWindow() {
		setTitle("My Own JFrame");
        setSize(300,200);
        setLocation(400,400);
        addWindowListener(new MyHandler());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private class MyHandler extends WindowAdapter {
		//private class WindowEventHandler implements WindowListener {
		public void windowClosing(WindowEvent e){
	     	int ans = JOptionPane.showConfirmDialog(null,"Do you REALLY want close the window?!",
            							  "Window Closing",JOptionPane.YES_NO_OPTION);
            
            if(ans == 0){
           		System.exit(0); 
       		}
        	else {
        		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        	}  	
	 	}
	 public void windowIconified(WindowEvent e){ 
	 		JOptionPane.showMessageDialog(null,"Minimising the Window!");
	 	}
	 public void windowDeiconified(WindowEvent e){ 
	 		JOptionPane.showMessageDialog(null,"Restoring the Window!");
	 	} 
	}
}