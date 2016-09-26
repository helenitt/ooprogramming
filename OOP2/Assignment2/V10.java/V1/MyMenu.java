//MyMenu.java
/*This program will give users */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class MyMenu extends JFrame implements ActionListener {
	JMenu fileMenu;
	JMenu testMenu;
	JLabel title;
	JLabel response;
	JTextArea textArea;
	JButton submitButton; //READY TO APPEAR IN JTEXTAREA FOR TEST AFTER Q's ANSWERED
	
	ArrayList<Question> quest = new ArrayList<Question>();
	ArrayList<Test> test;
	
	String mess;
	String text, ans1,ans2,ans3,correctAns;
	int questionId;
	
	public static void main(String[] args) {
		
		MyMenu frame = new MyMenu();
		frame.setVisible(true);
	
	}
	
	public MyMenu() {
		Container pane;
		
		setTitle("Tutorial Test");
		setSize(400,350);
		setResizable(true);
		setLocation(400,300);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		//User methods to create two menus
		createFileMenu();
		createTestMenu();
		
		//Create menu bar and add menus
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);		
		menuBar.add(testMenu);
		
		//Create and position title label
		title = new JLabel(" **** Tutorial Performance Test **** \n");
		title.setFont(new Font("Andalus", Font.PLAIN, 22));
		title.setSize(400,80);
		pane.add(title);
		
		//Create and position rsponse label
		response = new JLabel("");
		response.setFont(new Font("Andalus", Font.PLAIN, 18));
		response.setSize(400,50);
		pane.add(response);
		
		//Create and position the text area
        textArea = new JTextArea(8,30);
        textArea.setEditable(false);
        pane.add(textArea);
		
		//Create button and set event handler NOT YET VISABLE  
        submitButton = new JButton("Submit Test");
        submitButton.setSize(100,80);
        submitButton.addActionListener(this);
        pane.add(submitButton);
        submitButton.setVisible(false);
	}
	
	//Response to an event
	public void actionPerformed(ActionEvent event) {
		String menuName = "";
		menuName = event.getActionCommand();
		
		if(menuName.equals("Quit")) {
			JOptionPane.showMessageDialog(null,"Goodbye!");
			System.exit(0);
		}
		else if (menuName.equals("Add Question")) {
			addQuestion();
		}
		else if (menuName.equals("Save Question")) {
			saveQuestion();
		}
		else if (menuName.equals("Display Questions")) {
			displayQuestion();
		}
		else if (menuName.equals("Take Test")) {
			takeTest();
		}
		else if (menuName.equals("Save Test")) {
			saveTest();
		}
		else if (menuName.equals("Display Test")) {
			displayTest();
		} 
	/*	else if (ButtonEvent("Submit")) {   READY FOR WHEN TEST IS ON TEXT AREA
			
		}  */			
		else
			response.setText("System Error");		
	}
	
	//User defined method to ADD QUESTION
	public void addQuestion() {
		
		String fini = "n", mess = "";
		int idCount = quest.size();
		int id = idCount;
		Question q;
		
		while(fini.equals("n")) { 
			text = JOptionPane.showInputDialog("Question Text: ");
			ans1 = JOptionPane.showInputDialog("Possible Answer 1: ");
			ans2 = JOptionPane.showInputDialog("Possible Answer 2: ");
			ans3 = JOptionPane.showInputDialog("Possible Answer 3: ");
			correctAns = JOptionPane.showInputDialog("Correct Answer: ");
			
			id++;
			q = new Question(text,ans1,ans2,ans3,correctAns,id); 
			quest.add(q);
			  
			fini = JOptionPane.showInputDialog("Finished? y/n ");
		}//end while
			
		Iterator<Question> iter = quest.iterator(); 
			
		while(iter.hasNext()) {						
			mess += iter.next() + "\n";
			//NEED EXCEPTION FOR CANCEL	
			//Needs printing to text area anyway!			            
		}//end while
		
		JOptionPane.showMessageDialog(null,mess);
	}
	
    //User defined method to SAVE QUESTION 
	public void saveQuestion() {
		mess="";
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
			response.setText("Questions Saved Successfully");
			textArea.append(mess);
			oos.close();
			fos.close();
		}
		catch (IOException e){ //IOException
			e.printStackTrace();
		}			
    }
      
    //User defined method to DISPLAY QUESTION and read from question.dat
    public void displayQuestion() {
        //textArea = new JTextArea(); put in tarea later
		String mess = "";

		try {
			File fin = new File("questions.dat");
			FileInputStream fis = new FileInputStream(fin);
			ObjectInputStream ois = new ObjectInputStream(fis);
					
			quest = (ArrayList<Question>)ois.readObject();
			
			//run iterator over array list 
			Iterator<Question> iter = quest.iterator(); 
			
			while(iter.hasNext()) {						
				mess += iter.next().toString() + "\n";
				//Needs printing to text area anyway!			            
			}//end while
			
			JOptionPane.showMessageDialog(null,mess);
			
			//JOptionPane.showMessageDialog(null,quest.toString());
			ois.close();
			fis.close();
			}
			catch (Exception e){ //IOException
				JOptionPane.showMessageDialog(null,"Unable to retrieve Data");
				e.printStackTrace();
			}
    }
    
	//User defined method to COMPILE TEST
    public void takeTest() {
    		Test t; //just create a reference to a single Test object
	        Question[] q = new Question[3];
	        String testQuestions, answer;
	        String corAns;
	        int ranNum, score = 0;// testId = 0; don't need testId really 
	        
	        displayQuestion(); // Loads questions BETTER SEPERATED INTO TWO FUNCTIONS LOAD AND DISPLAY
	        
	        for(int i=0; i <= 2; i++ )	{
	        	Random random = new Random(); // Create random num object
	    		ranNum = random.nextInt(quest.size()); //Generate random number
	        	q[i] = quest.get(ranNum);
	        	//NEED LOOP TO CHECK NUMBERS NOT THE SAME 
	        }
	       
	        // RADIO BUTTONS HERE 
	        
	        for(int i=0; i <= 2; i++ )	{
				testQuestions = q[i].getAns1() + "\n" + q[i].getAns2() + "\n" + q[i].getAns3();
				answer = JOptionPane.showInputDialog("Test Question " + (i+1) + "\n\n" + 
							q[i].getQuestionText() + "\n\n" + testQuestions + "\n\n");
				
				corAns = q[i].getCorrectAns();
				
				if(answer.equals(corAns)) 
	    		    score += 33;
	    		    if(score == 99)
	    		    	score = 100;
	        }
	        
	        JOptionPane.showMessageDialog(null,"Your Score is: " + score + "%");
	        
	        //testId++; auto-increment this
			t = new Test(score);
			
			JOptionPane.showMessageDialog(null,t);
			//System.out.println(t);
			
			//left out other file-handling code here - test details stored in file called tests.dat say
			
			//test =  (ArrayList<Test>)ois.readObject();
			
			test.add(t); //add new test object to array list of tests
			
			//Now save the updated array list of tests to a file for future retrieval
			
			//other file-handling code omitted
			
			//oos.writeObject(test);

	    		
        }
        
	//User defined method to SAVE TEST
    public void saveTest() {
    	
    }
    
    	//User defined method to DISPLAY TEST
    public void displayTest() {
    	
    }
    
	//Create file menu and items
	public void createFileMenu() {
		//Re-usable object item
		JMenuItem item;
		
		//Create file menu
		fileMenu = new JMenu(" File ");
		
		//Create items
		item = new JMenuItem("Quit");
		item.addActionListener(this);
		fileMenu.add(item);
	}
	
	//Create test menu
	private void createTestMenu( ) {
        JMenuItem    item;

        testMenu = new JMenu(" Test ");

        item = new JMenuItem("Add Question");     
        item.addActionListener(this);
        testMenu.add(item);
        
		item = new JMenuItem("Save Question");
		item.addActionListener(this);
		testMenu.add(item);
		
        item = new JMenuItem("Display Questions");   
        item.addActionListener(this);
        testMenu.add(item);

        testMenu.addSeparator();

        item = new JMenuItem("Take Test");     
        item.addActionListener(this);
        testMenu.add(item);

		item = new JMenuItem("Save Test");
		item.addActionListener(this);
		testMenu.add(item);
		
        item = new JMenuItem("Display Test");   
        item.addActionListener(this);
        testMenu.add(item);
    }
}