package q2;

/** models a bank account
 */
public class BankAccount{
	private int accNum;
	private int numAcc;
	private double balance;
	
	public BankAccount() {
		this(0.0);
		numAcc++;
		accNum = numAcc + 1;
	}
	public BankAccount(double bal) {
		numAcc++;
		accNum = numAcc + 1;
		balance = bal;
	}
	
	public int getAccNum(){ return accNum;	}
	public double getBalance(){ return balance;	}
	
	/** lodge any positive amount to the account
	 @param amount the amount to be lodged
	 */
	public void lodge(double amount){
	  if (amount >0)
		balance += amount;
	}
	
	/** withdraw anything up to the amount in the account
	 *@param amount the amount to be withdrawn
	 */
	public void withdraw(double amount){
		if (amount <=balance){
			balance -= amount;
		}
	}

	/** gives a String representation of the object
	 @return the class name as well as the account number and the balance
	 */
	public String toString() {
		return getClass() + " number: " + getAccNum() + " balance: " + getBalance();
	}
}