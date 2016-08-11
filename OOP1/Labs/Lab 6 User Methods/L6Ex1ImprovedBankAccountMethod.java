//L6Ex1ImprovedBankAccountMethod.java
/*This program contains several user-defined methods. Some of 
 *these will read in specific details about a bank account holder’s 
 *account and another will be used to check whether or not the 
 *account holder’s credit limit has been exceeded*/

import javax.swing.JOptionPane;

public class L6Ex1ImprovedBankAccountMethod {
	public static void main(String args[])
		{
			String accountNumber;
			float balance, debits, credits, creditLimit;
			
			accountNumber = getCustomerAccountNumber();
			
			while(!accountNumber.equals(""))
				{
					balance = getCustomerBalance();
					debits = getCustomerDebits();
					credits = getCustomerCredits();
					creditLimit = getCustomerCreditLimit();
					
					checkCreditLimit(accountNumber, balance, debits, credits, creditLimit);
					
					accountNumber = getCustomerAccountNumber();					
				}
			JOptionPane.showMessageDialog(null,"Thanks for using the system - Goddbye!",
										  "Exiting System ... ",JOptionPane.PLAIN_MESSAGE);
			
			System.exit(0);
		}
	public static String getCustomerAccountNumber()
		{
			String accountNumber;
			accountNumber = JOptionPane.showInputDialog("Please enter account your account number (<CR> to exit)");
			return accountNumber;
		}
	public static float getCustomerBalance()
		{
			float balance;
			String balanceAsString;
			balanceAsString = JOptionPane.showInputDialog("Please enter account balance");
			balance = Float.parseFloat(balanceAsString);
			return balance;
		}
	public static float getCustomerDebits()
		{
			float debits;
			String debitsAsString;
			debitsAsString = JOptionPane.showInputDialog("Please enter total debits");
			debits = Float.parseFloat(debitsAsString);
			return debits;
		}
	public static float getCustomerCredits()
		{
			float credits;
			String creditsAsString;
			creditsAsString = JOptionPane.showInputDialog("Please enter total credits");
			credits = Float.parseFloat(creditsAsString);
			return credits;
		}
	public static float getCustomerCreditLimit()
		{
			float creditLimit;
			String creditLimitAsString;
			creditLimitAsString = JOptionPane.showInputDialog("Please enter account credit limit");
			creditLimit = Float.parseFloat(creditLimitAsString);
			return creditLimit;
		}
		
	public static void checkCreditLimit(String accountNumber, float balance, float debits, 
		float credits, float creditLimit)
		{
			float newBalance;
			
			newBalance = balance - debits + credits;
			
			String text = "\nAccount number  ==>  " + accountNumber + "\nCredit limit        " +
			"     ==>  " + String.format("€%.2f",creditLimit) + "\nNew balance         ==>  " +
			String.format("€%.2f",newBalance);
			
			if(newBalance < creditLimit)
				text += "\n\nSorry - Credit limit has been exceeded";
			else
				text += "\n\nCredit limit has not been exceeded";
				
				
			JOptionPane.showMessageDialog(null,text,"Account Details",JOptionPane.PLAIN_MESSAGE);
		}
}