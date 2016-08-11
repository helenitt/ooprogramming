//JOptionPaneOutput.java
/*This program will output the values of some variables to a GUI 
 *window component*/
 
import javax.swing.JOptionPane;

public class JOptionPaneOutput {
	public static void main(String args[])
		{
			String message = "This output message is being displayed on a GUI " +
							 "Component\ncalled a messge dialog. We will use this" +
							 "component a lot from now on.";
			int wholeNum = 10;
			float fractionalNum = 78.7956f;
			
			JOptionPane.showMessageDialog(null,message + "\n\nWe have just used it " +
					"above to diplay the value of a String variable but it\ncan " +
					"also be used to display the values of integer and floating-point " +
					"variables.\n\n\nIn this case the value of the integer variable " +
					"is " + wholeNum + " while the value of the\nfloating-point " +
					"variable is " + fractionalNum + ". The floating-point number " +
					"correct to\n2 decimal places is " + String.format("%.2f",fractionalNum),
					"GUI Variable Outputs",JOptionPane.INFORMATION_MESSAGE);
			
			System.exit(0);
		}
} 