//Account.java
/** models a bank account: demos the use of a static attribute and methods
 */
 
 /*Question 9
  *(i)	private static double interestRate = 5.00; //static attribute
  *		private String name;                       //non-static attribute
  *		private double balance;                    //non-static attribute
  *
  *(ii)	error: non-static variable interestRate cannot be referenced from a static context
  *		can't be seen from another program if it is not static
  *
  *(iii)If you take all the statics out it will compile but won't run because
  *		it can't be seen from the other program
  *
  *Question 10
  *(i)	An instance of the class must be created of before a public instance method is 
  *		invoked and executed.
  *		For static methods no instance of the class is needed to run it.
  *
  *Questionn 11
  *(i)
  ***/
  
public class Account {
	private String name;                       //non-static attribute
	private double balance;                    //non-static attribute
	private static double interestRate = 5.00; //static attribute
	
	public String getName(){ return name;	}
	public double getBalance(){ return balance;	}
	/** access method for the interest rate
	 *@return the interest rate as a percentage eg 5.00 for 5%
	 */
	public static double getInterestRate(){ return interestRate;	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void lodge(double amount){
		balance += amount;
	}
	
	public static void setInterestRate(double rate){
		interestRate = rate;
	}
	/** withdraws money from the account, if there is enough money there
	 */
	public void withdraw(double amount){
		if (amount <=balance){
			balance -= amount;
		}
	}
	
	public void addInterest() {
		balance *= (1 + interestRate/100);
	}
	
	public String toString() {
		return getName() + " " + getBalance();
	}
}