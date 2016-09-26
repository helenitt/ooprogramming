//Banking System.java

import javax.swing.JOptionPane;

public class BankingSystem{
	public static void main(String[] args)
		{
			String name;
			double balance;
		
			Account [] bankAccounts;//declare an array
			
			Account bankAccount = null;//declare a reference for account object
			int numAcc = Integer.parseInt(JOptionPane.showInputDialog("Enter num accounts:"));
			bankAccounts = new Account[numAcc];
			
			for(int i = 0; i < numAcc;i++){
			
			name = JOptionPane.showInputDialog("Enter account holder name:");
			balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance: "));
			bankAccount = new Account(name,balance);//create Account object
			bankAccounts [i] = bankAccount;
			}//end for loop
			
			for(int i = 0; i < bankAccounts.length;i++){
			
				JOptionPane.showMessageDialog(null,bankAccounts[i].toString());
			}
		}
}