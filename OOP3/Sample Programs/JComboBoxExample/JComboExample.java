import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.*;

import java.util.*;

public class JComboExample extends JFrame implements ActionListener {

	Container cp;
	JComboBox<String> jcc;
	JList<String> list;
	DefaultListModel<String> dflist;
	DefaultComboBoxModel<String> cbm;
	JScrollPane pane;
	Set<String> clubs;
	TreeSet<String> sortedClubs;
	JButton additionButton;
	JButton displayButton;
	
	public JComboExample(){
		
		setTitle("ComboBox Example");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(350, 430);
	   
	 	Container cp=getContentPane();
	    
	    cp.setLayout(new FlowLayout());
	    
	    
	    //create a DefaultComboBoxModel object and associate it with a combo box
	    //the reason to do this is to separate the data for the gui element
	    // and the gui element itself. We manipulate the data via the DefaultComboBoxModel object.
	  	cbm= new  DefaultComboBoxModel();
		jcc = new JComboBox(cbm);
		cp.add(jcc);
		
		
		additionButton = new JButton("Add a Club");
		additionButton.addActionListener(this);
		additionButton.setBackground(Color.GREEN);
		cp.add(additionButton);
		
		displayButton = new JButton("Delete");
		displayButton.addActionListener(this);
		displayButton.setBackground(Color.MAGENTA);
		cp.add(displayButton);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
	JComboExample le=new JComboExample();
	le.setVisible(true);
	

	}
	
	// Add a club  Method
	
	public void getClubs(){
		
		
		Set<String> clubs = new HashSet<String>();
//	Collection<String> clubs = new HashSet<String>();
//List<String> clubs = new LinkedList<String>();
	
		int choice = JOptionPane.showConfirmDialog(null,"Message", "Do you wish to Add a Name of A Club",JOptionPane.YES_NO_OPTION);
		
	    
	    	
	    	do{
	    	String x = JOptionPane.showInputDialog("Please enter a Club you wish to Join?");
	    	clubs.add(x);
	       	cbm.addElement(x);
	     	choice = JOptionPane.showConfirmDialog(null,"Message", "Do you wish to Add a Name of A Club",JOptionPane.YES_NO_OPTION);
	    	
	    	}while(choice == JOptionPane.YES_OPTION);
	    
	    	if(choice == JOptionPane.NO_OPTION){
	    	
	    	System.out.println(clubs); //// tests the hashset
	    	TreeSet<String> sortedClubs = new TreeSet <String>(clubs);
	    	System.out.println(sortedClubs); // tests the binary sorted treeset//
	    	
	   
	    }  // end of no option
		
		
	}    // end of method ///
	
// Delete method
	public void DeleteClubs(){
		
		
		
		if(jcc.getSelectedIndex()>=0){
			
			cbm.removeElementAt(jcc.getSelectedIndex());
		}

		
		
	}
	
// Delete method 	


	public void actionPerformed(ActionEvent e){
		
		
		if(e.getActionCommand().equals("Add a Club")){
			
			getClubs();
		}
		
		
		
		if(e.getActionCommand().equals("Delete")){
			
			DeleteClubs();
		}
		
	}





}