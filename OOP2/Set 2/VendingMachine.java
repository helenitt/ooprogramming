//VendingMachine.java
/*This is the instanciable class for a program which simulates a 
 *vending machine selling cans of pop*/

public class VendingMachine {
	private int cansCount = 0;
	private int tokensCount = 0;
	
	//Constructors
	public VendingMachine(int cans, int tokens) {
		this.cansCount = cans;
		this.tokensCount = tokens;
	}
	public VendingMachine() {
		this(0,0);
	}
	
	//Accessors
	public int getCans() {
		return cansCount;
	}
	public int getTokens() {
		return tokensCount;
	}
	
	//Mutators
	public void setCans(int cans) {
		cansCount = cans;
	}
	public void setTokens(int tokens) {
		tokensCount = tokens;
	}
	
	//Methods
	//simulates buying cans
	public void buyCan(int cans) {
		tokensCount += cans;
		cansCount -= cans;
	}
	public int getCanCount() {
		return cansCount;
	}
		
	public int getTokenCount() {
		return tokensCount;
	}
	//simulates restocking cans
	public void fillUp(int cans) {
		cansCount += cans; 
	}
	
	//toString
	public String toString() {
		return String.format("Cans: %d\nTokens: %d", getCanCount(), getTokenCount());
	}
}