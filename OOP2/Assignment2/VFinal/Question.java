//Questions.java
/*An Instantiable class to model test questions*/
import java.io.*;

/**This is an instantiable Question class to represent the questions of a test.
 *@author Helen O'Brien
 *@version 1.0*/
 
 public class Question implements Serializable {
	//Attributes
	private String questionText;
	private String ans1;
	private String ans2;
	private String ans3;
	private String correctAns;
	private int questionId;
	
	//Constructors
	/**Multi argument constructor method
	 *@param text	the text of the test question
	 *@param a1		the first option of the test question
	 *@param a2		the second option of the test question
	 *@param a3		the third option of the test question
	 *@param corAns	the coerrect answer of the test question
	 *@param qid 	unique identifier of the test question**/
	public Question(String text, String a1, String a2, String a3, String corAns, int qid) {
		questionText = text;
		ans1 = a1;
		ans2 = a2;
		ans3 = a3;
		correctAns = corAns;
		questionId = qid;
	}
	/**Single argument constructor method
	 *@param text the text of the question**/
	public Question(String text) {
		questionText = text;
	}
	/**No argument constructor method sets question details directly**/
	public Question() {
		this(" "," "," "," "," ",0);
	}
	//Accessors
	/**Accessor method to return the question text.
   	 * @return questionText the question text.**/
	public String getQuestionText(){
		return questionText;
	}
	/**Accessor method to return the first answer option.
   	 * @return ans1 the first answer option.**/
	public String getAns1() {
		return ans1;
	}
	/**Accessor method to return the second answer option.
   	 * @return ans2 the second answer option.**/
	public String getAns2() {
		return ans2;
	}
	/**Accessor method to return the third answer option.
   	 * @return ans3 the third answer option.**/
	public String getAns3() {
		return ans3;
	}
	/**Accessor method to return the correct answer.
   	 * @return correctAns the correct answer.**/
	public String getCorrectAns() {
		return correctAns;
	}
	/**Accessor method to return the question Id.
   	 * @return questionId the question Id.**/
	public int getQuestionId() {
		return questionId;
	}
	
	//Mutators
	/**Mutator method to set the question text.
     * @param text the question text.*/
	public void setQuestionsText(String text) {
		questionText = text;
	}
	/**Mutator method to set the first answer option.
     * @param a1 the first answer option.*/
	public void setAns1(String a1) {
		ans1 = a1;
	}
	/**Mutator method to set the second answer option.
     * @param a2 the second answer option.*/
	public void setAns2(String a2) {
		ans2 = a2;
	}
	/**Mutator method to set the third answer option.
     * @param a3 the third answer option.*/
	public void setAns3(String a3) {
		ans3 = a3;
	}
	/**Mutator method to set the correct answer.
     * @param corAns the correct answer.*/
	public void setCorrectAns(String corAns) {
		correctAns = corAns;
	}
	/**Mutator method to set the question Id.
     * @param qid the question Id.*/
	public void setQuestionId(int qid) {
		questionId = qid;
	}
	
	//toString
	/** toString method to return the Question Id and the Question Text.
	 *@return the Question Id and Question Text as a string.*/
	public String toString() {
		return String.format("%s%d%s%s","Question ",getQuestionId(),
							 ": ",getQuestionText());
	} 
}