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
	JButton submitButton;
	
	ArrayList<Question> quest = new ArrayList<Question>();
	private static int count;  //no of questions
	String mess;
	String ans1,ans2,ans3,correctAns;
	
	public static void main(String[] args) {
		
		MyMenu frame = new MyMenu();
		frame.setVisible(true);
	
	}
	
	public MyMenu() {
		Container pane;
		
		setTitle("Tutorial Test");
		setSize(400,300);
		setResizable(false);
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
		title = new JLabel("Tutorial Performance Test\n");
		title.setFont(new Font("Courier", Font.PLAIN, 18));
		title.setSize(400,80);
		pane.add(title);
		
		//Create and position rsponse label
		response = new JLabel("You didn't pressed anything yet!");
		response.setFont(new Font("Courier", Font.PLAIN, 14));
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
		String menuName = "nothing yet!";
		menuName = event.getActionCommand();
		
		if(menuName.equals("Quit")) {
			JOptionPane.showMessageDialog(null,"Goodbye!");
			System.exit(0);
		}
		else if (menuName.equals("Add Question")) {
			add();
		}
		else if (menuName.equals("Save")) {
			save();
		}
		else if (menuName.equals("Display Questions")) {
			display();
		}
		else if (menuName.equals("Take Test")) {
			takeTest();
		} 
	/*	else if (ButtonEvent("Submit")) {
			
		}  */			
		else
			response.setText("You pressed " + menuName);		
	}
	
	//User defined method to SAVE QUESTION
		public void add() {
		
		String fini = "n", text, mess = "";
		int id = 0;
		Question q;
			
		while(fini.equals("n")) { // does not = 3
			text = JOptionPane.showInputDialog("Question Text: ");
			ans1 = JOptionPane.showInputDialog("Possible Answer 1: ");
			ans2 = JOptionPane.showInputDialog("Possible Answer 2: ");
			ans3 = JOptionPane.showInputDialog("Possible Answer 3: ");
			correctAns = JOptionPane.showInputDialog("Correct Answer: ");
			
			q = new Question(text,ans1,ans2,ans3,correctAns); 
			quest.add(q);
			id++; //setQuestionId called on object 
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
	public void save() {
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
			JOptionPane.showMessageDialog(null,"Save Successful");
			oos.close();
			fos.close();
		}
		catch (IOException e){ //IOException
			e.printStackTrace();
		}			
    }
      
    //User defined method to OPEN QUESTION and read from question.dat
    public void display() {
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
	        Question[] q = new Question[3];
	        String test = "", answer;
	        String corAns;
	        int ranNum, score = 0;
	        
	        display();//need this to load the questions ... this is why John wanted you to
	                  //call the method load instead :-)
	        
	        for(int i=0; i <= 2; i++ )	{
	        	Random random = new Random(); // Create random num object
	    		ranNum = random.nextInt(quest.size()); //Generate random number
	        	q[i] = quest.get(ranNum); 
	        	//JOptionPane.showInputDialog("Random num is: " + ranNum);
	        }
	        
	        for(int i=0; i <= 2; i++ )	{
				test = q[i].getAns1() + "\n" + q[i].getAns2() + "\n" + q[i].getAns3();
				answer = JOptionPane.showInputDialog("Test Question " + (i+1) + "\n\n" + q[i].getQuestionText() +
					"\n\n\n" + test);
				
				corAns = q[i].getCorrectAns();
				
				if(answer.equals(corAns)) 
	    		    score += 33;
	        }
			
	    	//Put in answer
	    	
	    	//compare answer increment score if correct
		    // done in loop generate quest all done in same loop
	  	//	
	    //	}
	    		
	    	JOptionPane.showMessageDialog(null,"Your Score is: " + score + "%");	
        }

	
	//Create file menu and items
	public void createFileMenu() {
		//Re-usable object item
		JMenuItem item;
		
		//Create file menu
		fileMenu = new JMenu(" File ");
		
		//Create items
		item = new JMenuItem("Save");
		item.addActionListener(this);
		fileMenu.add(item);
		
		fileMenu.addSeparator();
		
		item = new JMenuItem("Quit");
		item.addActionListener(this);
		fileMenu.add(item);
	}
	
	//Create test menu
	private void createTestMenu( ) {
        JMenuItem    item;

        testMenu = new JMenu(" Test ");

        item = new JMenuItem("Take Test");     
        item.addActionListener(this);
        testMenu.add(item);

        fileMenu.addSeparator();

        item = new JMenuItem("Add Question");     
        item.addActionListener(this);
        testMenu.add(item);

        item = new JMenuItem("Display Questions");   
        item.addActionListener(this);
        testMenu.add(item);
    }
}