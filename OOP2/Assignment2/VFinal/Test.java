//Test.java
/*An Instanciable class to model a test*/

import java.io.*;

public class Test implements Serializable { 
	private int testId;
	private String testTaker;
	private int testScore;
	
	//Constructors
	public Test(int testId, String testTaker, int testScore) { 
		this.testId = testId;
		this.testTaker = testTaker;
		this.testScore = testScore;
	}
	public Test() { //not sure I need it
		this(0,"",0);
	}  
	//Accessors
	public int getTestId() {
		return testId;
	}
	public String getTestTaker() {
		return testTaker;
	}
	public int getTestScore(){
		return testScore;
	}
	//Mutators
	public void setTestTaker(String tTaker) {
		testTaker = tTaker;
	}
	
	public void setTestScore(int score) {
		testScore = score;
	}
	//toString
	public String toTestString() {
		return String.format("%s%d\n%s%s\n%s%d%s","Test Id: ",getTestId(),
							 "Test Taker: ",getTestTaker(),"Test Score: ",getTestScore(),"%");
	}
}