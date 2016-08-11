package labs.set5.q5;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

@SuppressWarnings("serial")
public class JComboClubs extends JFrame implements ActionListener {
	TreeSet<String> clubs;
	Container cont;
	JComboBox<String> jcc;
	JList<String> list;
	DefaultListModel<String> dflist;
	DefaultComboBoxModel<String> cbm;
	JScrollPane scroll;
	JButton addButton;
	JButton deleteButton;
	
	public JComboClubs() {
		setTitle("Clubs Wish List");
		setSize(250,300);
		setLocation(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cont = getContentPane();
		cont.setLayout(new FlowLayout());
		
		// Create a DefaultComboBoxModel and associate it with
		// a combo box; this seperates the data for the gui element 
		// and the gui element.
		// Data is manipulated via the DefaultComboBoxModel
		
		cbm = new DefaultComboBoxModel<String>();
		jcc = new JComboBox<String>(cbm);
		jcc.setPreferredSize(new Dimension(200,20));
		cont.add(jcc);
		
		addButton = new JButton("Add a Club");
		addButton.addActionListener(this);
		cont.add(addButton);
		
		deleteButton = new JButton("Delete a Club");
		deleteButton.addActionListener(this);
		cont.add(deleteButton);
	}
	
	public static void main(String[] args) {
		JComboClubs cb = new JComboClubs();
		cb.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == addButton) {   //either
			addClub();
		}
		
		if(e.getActionCommand().equals("Delete a Club")) {   //or
			deleteClub();
		}
	}
	
	// Add Club method
	public void addClub() {
		Collection<String> clubs = new TreeSet<String> ();
		
		int choice = JOptionPane.showConfirmDialog(null,"Add Club", "Add a Club? ",JOptionPane.YES_NO_OPTION);
		
		do {
			String cName = JOptionPane.showInputDialog("Club Name: ");
			clubs.add(cName);
			cbm.addElement(cName);
			choice = JOptionPane.showConfirmDialog(null,"Add Club", "Add a Club? ",JOptionPane.YES_NO_OPTION);
		}while(choice == JOptionPane.YES_OPTION);
		
		if(choice == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, clubs);
			
			Set<String> hashClubs = new HashSet<String>(clubs); // Most probably already sorted by TreeSet
			JOptionPane.showMessageDialog(null, hashClubs);
			
			LinkedList<String> llClubs = new LinkedList<String>(clubs);
			JOptionPane.showMessageDialog(null, llClubs);
			ArrayList<String> alClubs = new ArrayList<String>(clubs);
			JOptionPane.showMessageDialog(null, alClubs);
		}
	}
	
	//Delete Club
	public void deleteClub() {
		if(jcc.getSelectedIndex() >= 0) {
			cbm.removeElementAt(jcc.getSelectedIndex());
		}
	}
}
