//Friends.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Friends extends JFrame implements ActionListener {
	JMenu friendsMenu;
	JLabel response; //ready for when there is a response
	
	public static void main(String[] args) {
		Friends frame = new Friends();
        frame.setVisible(true);
	}
	
	//Constructor
	public Friends() {
		setTitle("JMenuFrame");
		setSize(300,200);
		setLocation(800,400);
		setResizable(false);
		
		Container pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Create menu with user method
		createFriendsMenu();
		
		//Add menu to menu bar
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		menubar.setBackground(new Color(200,200,240));
		menubar.add(friendsMenu);
		
		//Create and position reponse label
		response = new JLabel("Hello! Welcome to my Friend Menu tester.");
		pane.add(response);
	}
	
	//Response for when item is clicked
	public void actionPerformed(ActionEvent event) {
		String  menuName;       
		//Gets what's written on the clicked item 
		menuName = event.getActionCommand();
		response.setText("I really really like " + menuName);
	}
	
	//Create Friends Menu and items
	private void createFriendsMenu() {
		JMenuItem item; //Declare a re-usable JMenuItem object
		
		//Create the menu
		friendsMenu = new JMenu("Friends");
		
		//Create the first friend
		item = new JMenuItem("Martine");
		//set listener: handle in this class
		item.addActionListener(this);
		//attatch item to menu
		friendsMenu.add(item);
		item.setBackground(new Color(240,240,160));
		
		//Create the second friend
		item = new JMenuItem("Mandy");
		//set listener: handle in this class
		item.addActionListener(this);
		//attatch item to menu
		friendsMenu.add(item);
		item.setBackground(new Color(240,200,240));
		
		//Create the third friend
		item = new JMenuItem("Jack");
		//set listener: handle in this class
		item.addActionListener(this);
		//attatch item to menu
		friendsMenu.add(item);
		item.setBackground(new Color(200,240,240));
	}		
}