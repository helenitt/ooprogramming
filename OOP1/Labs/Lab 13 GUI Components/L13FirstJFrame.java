//L13FirstJFrame.java
/*This program illustrates how to create our own window-based application 
 *using a GUI component called a JFrame*/
 
 import javax.swing.JFrame;
 
 public class L13FirstJFrame {
 	public static void main(String args[])
 	{
 		JFrame jFrameWindow = new JFrame();
 		
 		jFrameWindow.setTitle("Our First JFrame GUI Application");
 		jFrameWindow.setSize(400,300);
 		jFrameWindow.setVisible(true);
 		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
 }