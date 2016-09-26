//Questions.java
/*An Instanciable class to model test questions*/
import java.io.*;

public class Question implements Serializable {
	
	private String questionText;
	private String ans1;
	private String ans2;
	private String ans3;
	private String correctAns;
	private static int questionId;
	
	//Constructors
	public Question(String text, String a1, String a2, String a3, String corAns) {
		questionText = text;
		ans1 = a1;
		ans2 = a2;
		ans3 = a3;
		correctAns = corAns;
		questionId++;
	}
	public Question(String text) {
		questionText = text;
	}
	public Question() {
		this(" "," "," "," "," ");
	}
	//Accessors
	public String getQuestionText(){
		return questionText;
	}
	public String getAns1() {
		return ans1;
	}
	public String getAns2() {
		return ans2;
	}
	public String getAns3() {
		return ans3;
	}
	public String getCorrectAns() {
		return correctAns;
	}
	public static int getQuestionId() {
		return questionId;
	}
	
	//Mutators
	
	public void setQuestionsText(String text) {
		questionText = text;
	}
	public void setAns1(String a1) {
		ans1 = a1;
	}
	public void setAns2(String a2) {
		ans2 = a2;
	}
	public void setAns3(String a3) {
		ans3 = a3;
	}
	public void setCorrectAns(String corAns) {
		correctAns = corAns;
	}
	//toString
	public String toString() {
		return String.format("%s%d%s%s","Question ",getQuestionId(),
							 ": ",getQuestionText());
	}
}