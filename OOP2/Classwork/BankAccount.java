public class BankAccount{
	//Attributes
	
	private String accName;
	private double accBalance;
	public static int accNum;
	
	//Constructors
	
	public BankAccount () {
		this("Unknown", 0);
	}
	
	public BankAccount (String accName, double accBalance) {
		setAccName(accName);
		setAccBalance(accBalance);
		accNum++;	
	}
	
	//Accessors
	public String getAccName () {
		return accName;
	}
	
	public double getAccBalance () {
		return accBalance;
	}
	
	//Class Method
	public static int getAccNum () {
		return accNum;
	} 
	
	//Mutators
	public 	void setAccName (String accName) {
		this.accName = accName;
	}
	
	public void setAccBalance (double accBalance) {
		this.accBalance = accBalance;
	}
	
	//ToString Method
	
	public String toString() {
		return String.format("Account Name: %-10s\nAccount Balance: %-10f", accName, accBalance);
	}
	
}