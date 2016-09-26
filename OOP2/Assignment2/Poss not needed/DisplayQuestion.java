//DisplayQuestion.java
//QuestionApp.java
/**/
import javax.swing.*;
import java.util.*;
import java.io.*;

public class DisplayQuestion { 
	
	public static void displayQuestions() {
		ArrayList<Question> quest = new ArrayList<Question>();

		String mess = "";

		try {
			File fin = new File("questions.dat");
			FileInputStream fis = new FileInputStream(fin);
			ObjectInputStream ois = new ObjectInputStream(fis);
					
			quest = (ArrayList)ois.readObject();
			JOptionPane.showMessageDialog(null,quest.toString());
			ois.close();
		}
		catch (Exception e){ //IOException
			JOptionPane.showMessageDialog(null,"Unable to retrieve Data");
			e.printStackTrace();
		}
		Iterator<Question> iter = quest.iterator(); 
			
		while(iter.hasNext()) {						
			mess += iter.next().toString() + "\n";
			//Needs printing to text area anyway!			            
		}//end while
		
		JOptionPane.showMessageDialog(null,mess);		
	}
}