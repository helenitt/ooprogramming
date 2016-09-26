//MyMenu.java
/*This program will give users */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMenu extends JFrame implements ActionListener {
	private JMenu fileMenu;
	private JMenu testMenu;
	private JMenu studentMenu;
	private JMenu questionMenu;
	private JLabel title;
	private JLabel response;
	private JTextArea textArea;
	private JButton testButton; //Generates random questions
	private JButton submitButton;
	private JButton exitButton;
	
	
	
	public MyMenu() {
		Container pane;
		
		setTitle("Tutorial Test");
		setSize(400,300);
		setResizable(false);
		setLocation(600,500);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		//User methods to create two menus
		createFileMenu();
		createTestMenu();
		createStudentMenu();
		createQuestionMenu();
		
		//Create menu bar and add menus
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(testMenu);
		menuBar.add(studentMenu);
		menuBar.add(questionMenu);
		
		//Create and position title label
		title = new JLabel("Tutorial Performance Test\n");
		title.setFont(new Font("Courier", Font.PLAIN, 18));
		title.setSize(400,80);
		pane.add(title);
		
		//Create and position rsponse label
		response = new JLabel("You pressed " + response);
		response.setFont(new Font("Courier", Font.PLAIN, 14));
		response.setSize(400,50);
		pane.add(response);
		
		//Create and position the text area
        textArea = new JTextArea(8,30);
        textArea.setEditable(false);
        pane.add(textArea);
		
		//Create buttons and set event handler  
        testButton = new JButton("Take Test");
        testButton.setSize(100,80);
        testButton.addActionListener(this);
        pane.add(testButton);
        
        submitButton = new JButton("Submit Test");
        submitButton.setSize(100,80);
        submitButton.addActionListener(this);
        pane.add(submitButton);
                      
        exitButton = new JButton("Exit");
        exitButton.setSize(100,80);
	    exitButton.addActionListener(this);
        pane.add(exitButton);
	}
	
	//Response to an event
	public void actionPerformed(ActionEvent event) {
		String menuName = "nothing yet!";
		menuName = event.getActionCommand();
		
		if(menuName.equals("Quit") || menuName.equals("Exit")) {
			JOptionPane.showMessageDialog(null,"Goodbye!");
			System.exit(0);
		}
		else if (menuName.equals("Take Test")) {
			//Test tFrame = new Test();
			//tFrame.setVisible(true);
		}
		else if (menuName.equals("Submit")) {
			
		}  			
		else
			response.setText("You pressed " + menuName);		
	}
	
	//Create file menu and items
	public void createFileMenu() {
		//Re-usable object item
		JMenuItem item;
		
		//Create file menu
		fileMenu = new JMenu(" File ");
		
		//Create items
		item = new JMenuItem("Print");
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

        item = new JMenuItem("Review Test");    
        item.addActionListener(this);
        testMenu.add(item);

        item = new JMenuItem("Tests Profile");   
        item.addActionListener(this);
        testMenu.add(item);
    }
    
    //Create student menu
	private void createStudentMenu( ) {
        JMenuItem    item;

        studentMenu = new JMenu(" Students ");

        item = new JMenuItem("Add Student");     
        item.addActionListener(this);
        studentMenu.add(item);

        item = new JMenuItem("Amend Student");    
        item.addActionListener(this);
        studentMenu.add(item);

        item = new JMenuItem("Delete Student");   
        item.addActionListener(this);
        studentMenu.add(item);
    }
    
    
    //Create question menu
	private void createQuestionMenu( ) {
        JMenuItem    item;

        questionMenu = new JMenu(" Question ");

        item = new JMenuItem("Add Question");     
        item.addActionListener(this);
        questionMenu.add(item);

        item = new JMenuItem("Amend Question");    
        item.addActionListener(this);
        questionMenu.add(item);

        item = new JMenuItem("Delete Question");   
        item.addActionListener(this);
        questionMenu.add(item);
    }
}