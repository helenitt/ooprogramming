import javax.swing.*;
public class ExceptionDemo1{
	public static void main (String args[]) {
		String inputStr;
        int    age;
                
		inputStr = JOptionPane.showInputDialog("Age:");
		age      = Integer.parseInt(inputStr);
		JOptionPane.showMessageDialog(null,"Next year you will be " + (age + 1));

	}
}