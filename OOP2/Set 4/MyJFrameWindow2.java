//MyJFrameWindow2.java

/*Inserts an anonymous inner class into a method*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJFrameWindow2 extends JFrame {
	
	//Application
	public static void main(String[] args) {
		MyJFrameWindow2 frame = new MyJFrameWindow2();
		frame.setVisible(true);		
	}//end main
	
	//Constructor
	public MyJFrameWindow2() {
		setTitle("My Own JFrame");
        setSize(300,200);
        setLocation(400,400);
        addWindowListener(new MyHandler());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        	addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				int ans = JOptionPane.showConfirmDialog(null,"Do you REALLY want close the window?!",
            							  "Window Closing",JOptionPane.YES_NO_OPTION);
            
            	if(ans == 0){
           			System.exit(0); 
       			}//end if
        		else {
        			setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        		}//end else
			} // end windowClosing
		  }// end anonymous inner class definition
		); //end of addWindowListener method argument
	}//end constructor
	private class MyHandler extends WindowAdapter {
		//private class WindowEventHandler implements WindowListener {
	public void windowClosing(WindowEvent e){
	     	  	
	}
	public void windowIconified(WindowEvent e){ 
	 		JOptionPane.showMessageDialog(null,"Minimising the Window!");
	 	}// end windowIconified
	public void windowDeiconified(WindowEvent e){ 
	 		JOptionPane.showMessageDialog(null,"Restoring the Window!");
	 	}// end windowDeiconified 
	}
}
