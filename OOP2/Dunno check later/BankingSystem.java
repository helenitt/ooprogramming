//BankingSystem.java
/**/

import javax.swing.*;

public class BankingSystem {
	public static void main(String[] args) {
		
		String name;
		double balance;
		int choice;
				
		BankAccount[] bankAccounts;//creates a reference for BankAccount object
		BankAccount bankAccount = null;
		
		choice = Integer.parseInt(JOptionPane.showInputDialog("How many accounts would you like to set up?: "));
		
		bankAccounts = new BankAccount[choice]; //creates BankAccount object
			
		for(int i=0;i<choice;i++) {
			name = JOptionPane.showInputDialog("Please enter your name: ");
			balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance: "));
			
			bankAccount = new BankAccount(name,balance);
			bankAccounts[i] = bankAccount;
		}
		
		for(int i=0;i<bankAccount.length;i++) {
			JOptionPane.showMessageDialog(null, bankAccount[i].toString());
		}
	}
}
	