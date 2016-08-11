//MyMenu.java
/*This program will allow users to take a test and display the
 *results. They can also add questions, save and display them.
 *JRadioButton from https://docs.oracle.com/javase/tutorial/uiswing/components/button.html#radiobutton*/

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
	//JRadioButton opt1;
	//JRadioButton opt2;
	//JRadioButton opt3;
	//JButton submitButton; //READY TO APPEAR IN JTEXTAREA FOR TEST WITH OR AFTER Q's ANSWERED
	
	String text,ans1,ans2,ans3,correctAns;
	int questionId;
	
	ArrayList<Question> quest = new ArrayList<Question>();
	ArrayList<Test> test = new ArrayList<Test>();
		
	public static void main(String[] args) {
		
		MyMenu frame = new MyMenu();
		frame.setVisible(true);
	
	} //end main
	
	public MyMenu() {
		Container pane;
		
		setTitle("Tutorial Test");
		setSize(400,350);
		setResizable(true);
		setLocation(400,350);
		
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
		title = new JLabel("  Tutorial Performance Test  \n");
		title.setFont(new Font("Andalus", Font.PLAIN, 24));
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
        
        //Create group for Ans Radio Buttons 
 /*     ButtonGroup ansGroup = new ButtonGroup(); 
        
        //Create JRadioButtons
        opt1 = new JRadioButton(Get answer 1 here);
        opt1.setSelected(true);
        add to either pane or textarea
        ansGroup.add(opt1);
        
        opt2 = new JRadioButton(Get answer 2 here);
        add to either pane or textarea
        ansGroup.add(opt2);
        
        opt3 = new JRadioButton(Get answer 3 here);
        add to either pane or textarea
        ansGroup.add(opt3);
        	 	 
		//Create button and set event handler NOT YET VISABLE  
   		submitButton = new JButton("Submit Test");
        submitButton.setSize(100,80);
        submitButton.addActionListener(this);
        pane.add(submitButton);
        submitButton.setVisible(false);     */
	} //end constructor         
	
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
		else if (menuName.equals("Display Test")) {
			displayTest();
		}
	/*	else if (opt1.isSelected()) {
			textArea.setText(); // EITHER WRITE A METHOD OR SEE IF YOU CAN getAns1()
		}
		else if (opt2.isSelected()) {
			textArea.setText(); // SEE IF THEY CAN GO IN TEXTAREA OR IF THEY NEED A PANEL
		}
		else if (opt3.isSelected()) {
			textArea.setText(); 
		} 
		else if (ButtonEvent("Submit")) {   READY FOR WHEN TEST IS ON TEXT AREA
			
		}  */			
		else
			response.setText("System Error");		
	} //end event handler
	
	//User defined method to ADD QUESTION
	public void addQuestion() {
		
		String fini = "n", mess = "";
		int id = quest.size();
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
		} //end while
			
		Iterator<Question> iter = quest.iterator(); 
			
		while(iter.hasNext()) {						
			mess += iter.next() + "\n";
			//NEED EXCEPTION FOR CANCEL			            
		} //end while
		
		JOptionPane.showMessageDialog(null,mess);
	} //end user method add question
	
    //User defined method to SAVE QUESTION 
	public void saveQuestion() {
		String mess="";
		Iterator<Question> iter = quest.iterator(); 
			
		while(iter.hasNext()) {						
			mess += iter.next().toString() + "\n";
			//NEED TO DEAL WITH CANCEL				            
		} //end while
		
		JOptionPane.showMessageDialog(null,mess);
		
		//Writes the array of qusetions to the file questions.dat
		try {		
			File fin = new File("questions.dat");
			FileOutputStream fos = new FileOutputStream(fin);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
					
			oos.writeObject(quest);
			response.setText("Questions Saved Successfully");
			textArea.setText(""); //Clears the text area
			textArea.append(mess);
			oos.close();
			fos.close(); //Stops it over writing
		} //end try
		catch (IOException e){ //IOException
			e.printStackTrace();
		} //end catch			
    } //end save question
      
    //User defined method to DISPLAY QUESTION and read from question.dat
    public void displayQuestion() {
       
		String mess = "";

		try {
			File fin = new File("questions.dat");
			FileInputStream fis = new FileInputStream(fin);
			ObjectInputStream ois = new ObjectInputStream(fis);
					
			quest = (ArrayList<Question>)ois.readObject();
			
			//iterator reads array list 
			Iterator<Question> iter = quest.iterator(); 
			
			while(iter.hasNext()) {						
				mess += iter.next().toString() + "\n";							       
			} //end while
			
			textArea.setText(""); //Clears textArea
			textArea.append(mess);
			
			ois.close();
			fis.close();
		} //end try
		catch (Exception e){ 
			JOptionPane.showMessageDialog(null,"Unable to retrieve Data");
			e.printStackTrace();
		} //end catch
    }  //end display question
    
	//User defined method to COMPILE TEST
    public void takeTest() {
    		
	    Question[] q = new Question[3];
	    String testQuestions, answer, name;
        String corAns;
        int ranNum, score = 0;
        int testId = test.size(); 		
	        
        displayQuestion(); // Loads questions WOULD BE BETTER SEPERATED INTO TWO FUNCTIONS LOAD AND DISPLAY
	        
        name = JOptionPane.showInputDialog("Please enter your name: "); 
	        	
        for(int i=0; i <= 2; i++ )	{
        	Random random = new Random(); // Create random num object
    		ranNum = random.nextInt(quest.size()); //Generate random number
        	q[i] = quest.get(ranNum);
        	//NEED LOOP TO CHECK NUMBERS NOT THE SAME 
        } //end for
	        
/*	for(int i=0; i <= 2; i++ )	{	       
	    //Create Radio Buttons
        opt1 = new JRadioButton(q[i].getAns1());
	    opt1.setMnemonic(KeyEvent.VK_A);
	    opt1.setActionCommand(ans1);
	    opt1.setSelected(true);
	
	    JRadioButton opt2 = new JRadioButton(q[i].getAns2());
	    opt2.setMnemonic(KeyEvent.VK_B);
	    opt2.setActionCommand(ans2);
	
	    JRadioButton opt3 = new JRadioButton(q[i].getAns3());
	    opt3.setMnemonic(KeyEvent.VK_C);
	    opt3.setActionCommand(ans3);
	
	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(opt1);
	    group.add(opt2);
	    group.add(opt3);
		
		//Set a listener for the radio buttons.
	    opt1.addActionListener(this);
	    opt2.addActionListener(this);
	    opt3.addActionListener(this);
	}  */
		        
        for(int i=0; i <= 2; i++ )	{
			testQuestions = q[i].getAns1() + "\n" + q[i].getAns2() + "\n" + q[i].getAns3();
			answer = JOptionPane.showInputDialog("Test Question " + (i+1) + "\n\n" + 
								 q[i].getQuestionText() + "\n\n" + testQuestions + "\n\n");
				
			corAns = q[i].getCorrectAns();
				
			if(answer.equals(corAns)) 
    		    score += 33;
    		    if(score == 99)
    		    	score = 100;
	        } //end for
	        
	        JOptionPane.showMessageDialog(null,"Your Score is: " + score + "%");
	        
	        testId++;
			Test t = new Test(testId, name, score);                                              
			
			JOptionPane.showMessageDialog(null,t.toTestString());    
			
			test.add(t); 
		
			try {		
				File fin = new File("tests.dat");
				FileOutputStream fos = new FileOutputStream(fin);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
						
				oos.writeObject(test);
				response.setText("Test Saved Successfully");
				textArea.setText("");
				textArea.append(t.toTestString());
				oos.close();
				fos.close();
			} //end try
			catch (IOException e){ 
				e.printStackTrace();
			} //end catch			    		
    } //end take test
            
   	//User defined method to DISPLAY TEST
    public void displayTest() {
    		String mess = "";

		try {
			File fin = new File("tests.dat");
			FileInputStream fis = new FileInputStream(fin);
			ObjectInputStream ois = new ObjectInputStream(fis);
					
			test = (ArrayList<Test>)ois.readObject();
			
			//run iterator over array list 
			Iterator<Test> iter = test.iterator(); 
			
			while(iter.hasNext()) {						
				mess += iter.next().toTestString() + "\n";	//NOT SURE I'M ALLOWED TO DO toTestString() BUT SOES'T SEEM TO CAUSSE A PROBLEM			
			} //end while
			
			textArea.setText(""); 
			textArea.append(mess);
			//JOptionPane.showMessageDialog(null,test.toString());
			
			ois.close();
			fis.close();
			} //end try
			catch (Exception e){ //IOException
				JOptionPane.showMessageDialog(null,"Unable to retrieve Data");
				e.printStackTrace();
			} //end catch
    } //end display test
    
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
	} //end createFileMenu
	
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
		
        item = new JMenuItem("Display Test");   
        item.addActionListener(this);
        testMenu.add(item);
        
    } //end createTestMenu
} //end class