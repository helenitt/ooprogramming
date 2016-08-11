//VendingMachine.java

public class VendingMachine {
	
	private int cans;
	private int tokens;
	
	public VendingMachine() {
		cans = 0;
		tokens = 0;
	}
	
	public VendingMachine(int cans, int tokens) {
		setCans(cans);
		setTokens(tokens);
	}
	
	public void setCans(int cans)
	{
		this.cans = cans;
	}
	
	public void setTokens(int tokens)
	{
		this.tokens = tokens;
	}
	//Inserting tokens into the machine
	public void insertToken()
	{
		if (isEmpty())
		{
			cans --;
			tokens++;
		}
	}
	
	public boolean isEmpty()
	{
		return this.cans>0;
	}
	
	public void fillUp(int cans)
	{
		this.cans += cans;
	}
	
	public int getCanCount ()
	{
		return cans;
	}
	
	public int getTokenCount()
	{
		return tokens;
	}
	
	public String toString()
	{
		return "Cans: \nTokens" + getCanCount()+getTokenCount();
	}
	
}