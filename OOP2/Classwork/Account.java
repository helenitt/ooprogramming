public class Account{
	
	private String accName;//instance variable /attribute
	private double accBalance;//instance variable /attribute
	private static int accNum;//class variable
	
	//instance method
	public String getAccName(){
		return accName;
	}
	
	//instance method
	public double getAccBalance(){
		return accBalance;
	}
	
	//class accessor method
	public static int getAccNum(){
		return accNum;
	}
	
	//mutator method
	public void setAccName(String accName){
		this.accName = accName;		
	}
	
	//mutator method
	public void setAccBalance(double accBalance){
		this.accBalance = accBalance;
	}
	
	//contructor method
	public Account(String accName,double accBalance){
	
		setAccName(accName);
		setAccBalance(accBalance);
		
	}
	
	public Account(){
		this("Unknown",0);
	} 
	 
	public String toString(){
		return String.format("Account name: %-20s\nBalance: %-20.2f",getAccName(),getAccBalance());
	}	
		
}