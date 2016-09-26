import javax.swing.JOptionPane;

public class BankAccountApp {
	public static void main (String args[]) {
		
		String name, output="";
		double balance;
		BankAccount[] bankaccounts;
		int noOfAcc;
		BankAccount bankaccount;
		
		//Take in size of array
		noOfAcc = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of accounts: "));
		//Create array
		bankaccounts = new BankAccount[noOfAcc];
		//Loop to process accounts
		for(int i = 0; i<noOfAcc; i++){	
			name = JOptionPane.showInputDialog("Enter your name: ");
			balance = Double.parseDouble(JOptionPane.showInputDialog("Please enter your balance: "));
			//Create account
			bankaccount = new BankAccount(name, balance);
			//Add account to array
			bankaccounts[i] = bankaccount;
			JOptionPane.showMessageDialog(null, BankAccount.getAccNum()); 
			
			//JOptionPane.showMessageDialog(null, bankaccount.toString());
		}
		//Using class method called getNum()
		JOptionPane.showMessageDialog(null, "Total number of accounts " + BankAccount.getAccNum());
		//Loop to display accounts
		for(int i = 0; i<bankaccounts.length; i++){
			//Uses instance method called toString()
			//JOptionPane.showMessageDialog(null, bankaccounts[i].toString());
			output += bankaccounts[i] + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, output);
	}
}