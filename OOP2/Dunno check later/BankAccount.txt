//BankAccount.java
/**/

public class BankAccount {
	
	private String accName;//instance variable / attribute
	private double accBalance;//instance variable / attribute
	private static int accNum;//class variable
	
	//instance method
	public String getAccName() {
		return accName;
	}
	
	//class accessor method
	public double getAccBalance() {
		return accBalance;
	}
	
	//class accessor method
	public static int getAccNum() {
		return accNum;
	}
	
	//mutator method
	public void setAccName(String accName) {
		this.accName = accName; //this.accBalance is refering to the attribute
	}
	
	//mutator method
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	
	//multiple argument constructor method
	public BankAccount(String accName, double accBalance) {
		setAccName(accName);
		setAccBalance(accBalance);
		accNum++;
	}
	
	//no argument constructor method
	public BankAccount() {
		this("unknown",0.0);//This refers to multiple argument constructor method BankAccount
	}
	
	public String toString(){
		return String.format("Account Name: %-20s\nAccount Balance: %.2f", getAccName(), getAccBalance());
	}
}