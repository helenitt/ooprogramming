//L13Ex4AdaptedFirstJFrame.java
/*This program illustrates how to create our own window-based application 
 *using a GUI component called a JFrame*/
 
 import javax.swing.JFrame;
 import javax.swing.JOptionPane;
 
 public class L13Ex4AdaptedFirstJFrame {
 	public static void main(String args[])
 	{
 		JFrame jFrameWindow = new JFrame();
 		String titleText;
 		
 		jFrameWindow.setTitle("L13Ex4AdaptedFirstJFrame.java");
 		jFrameWindow.setSize(400,250);
 		jFrameWindow.setLocation(150,150);
 		jFrameWindow.setVisible(true);
 		jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		
 		titleText = jFrameWindow.getTitle();
 		
 		JOptionPane.showMessageDialog(null,"Text obtained from the JFrame title bar\n\n\"" +
 									  titleText + "\"","Title Bar Text",JOptionPane.INFORMATION_MESSAGE);
 	}
 }