//L4Ex4UserNamePassword.java
/*This program prompts the user for their name and password
 *and tests to check it is correct*/
 
 import javax.swing.JOptionPane;
 
 public class L4Ex4UserNamePassword {
 	public static void main(String args[])
	 	{
	 		String username, password;
			
			username = JOptionPane.showInputDialog("Please enter your username");
			password = JOptionPane.showInputDialog("Please enter your password");
			
			if(username.equalsIgnoreCase("Joe Bloggs") && password.equals("t123456"))
				JOptionPane.showMessageDialog(null,"Welcome to the system","Authentication",
				JOptionPane.PLAIN_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"Invalid username and/or password",
				"Authentication",JOptionPane.PLAIN_MESSAGE);
						
            System.exit(0);
	 	}
 }