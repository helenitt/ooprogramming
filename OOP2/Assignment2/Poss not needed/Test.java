//Test.java
/*An Instanciable class to model a test*/

public class Test {
	private int testId;
	private int testScore;
	
	//Constructors
	public Test(int id, int score) {
		testId = id;
		testScore = score;
	}
	public Test() {
		this(0,0);
	}
	//Accessors
	public int getTestId() {
		return testId;
	}
	public int getTestScore(){
		return testScore;
	}
	//Mutators
	public void setTestId(int id) {
		testId = id;
	}
	public void setTestScore(int score) {
		testScore = score;
	}
	//toString
	public String toString() {
		return String.format("%s%d\n%s%d","Test Id: ",getTestId(),
							 "Test Score: ",getTestScore());
	}
}