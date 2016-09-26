//AddQuestion.java
/**/
import javax.swing.*;
import java.util.*;
import java.io.*;

public class AddQuestion { 
	public static void createQuestions() {
		
		ArrayList<Question> quest = new ArrayList<Question>();
		
		String fini = "n", text, mess = "";
		int id = 0;
		Question q;
		
		while(fini.equals("n")) {
			//id = Integer.parseInt(JOptionPane.showInputDialog("Question Id: "));
			text = JOptionPane.showInputDialog("Question Text: ");
			q = new Question(text); 
			quest.add(q); 
			fini = JOptionPane.showInputDialog("Finished? y/n ");
		}//end while
			
		Iterator<Question> iter = quest.iterator(); 
			
		while(iter.hasNext()) {						
			mess += iter.next().toString() + "\n";
			//NEED EXCEPTION FOR CANCEL	
			//Needs printing to text area anyway!			            
		}//end while
		
		JOptionPane.showMessageDialog(null,mess);
		
		//Writes the array of qusetions to the file questions.dat
		try {		
			File fin = new File("questions.dat");
			FileOutputStream fos = new FileOutputStream(fin);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
					
			oos.writeObject(quest);
			oos.close();
		}
		catch (Exception e){ //IOException
			e.printStackTrace();
		}					
	}//end add method
}//end class