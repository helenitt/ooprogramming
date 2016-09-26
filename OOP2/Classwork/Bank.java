import javax.swing.JOptionPane;

public class Bank{
	public static void main(String [] args){
		String name;
		double balance;
		int numAccounts;
		
		//Declare
		CurrentAccount currentAccount = null;
		
		numAccounts = Integer.parseInt(JOptionPane.showInputDialog("How many accounts?"));
		
		CurrentAccount[] accounts = new CurrentAccount[numAccounts];
		
		
		//Input
		for(int i=0;i<numAccounts;i++){
		
		name = JOptionPane.showInputDialog("Enter Name");
		balance = Double.parseDouble(JOptionPane.showInputDialog("Enter Balance"));
		
		//Create Object
		currentAccount = new CurrentAccount(name, balance);
		accounts[i] = currentAccount;
		
		}
		
		//Output Array
		String message = "Number of accounts " + CurrentAccount.getAccNum();
		
		for(int i=0;i<accounts.length;i++){
			message += accounts[i].toString();
		}
		
		JOptionPane.showMessageDialog(null,message);//Use instance toString method
	}
}