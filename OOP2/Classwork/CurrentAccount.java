//Instantiable BankAccount class
public class CurrentAccount{
	private static int accNum;
	private String accName;
	private double accBalance;
	
	//These are Instance Methods
	public String getAccName(){
		return accName;
	}
	
	public double getAccBalance(){
		return accBalance;
	}
	
	//This is a class method
	public static int getAccNum(){
		return accNum;
	}
	//end of accessor methods
	
	//Mutators
	public void setAccName(String accName){
		this.accName = accName;
	}
	
	public void setAccBalance(double accBalance){
		this.accBalance = accBalance;
	}
	
	//Construtor
	public CurrentAccount(String accName, double accBalance){
		setAccName(accName);
		setAccBalance(accBalance);
		accNum++;
	}
	
	//No Argument Constructor
	public CurrentAccount(){
		this("Unknown", 0);
	}
	
	public String toString(){
		return String.format("\nAccount Name: %s\nAccount Balance: € %.2f", getAccName(), getAccBalance());
	}
	

}