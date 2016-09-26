package com.walsh.ca16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class FootballDriver {

	public static void main(String []args){
		Footballer footballer;
		HashSet<Footballer> team= new HashSet<Footballer>();
		String name;
		int age;
		while(JOptionPane.showConfirmDialog(null, "Another")==JOptionPane.YES_OPTION){
			name=JOptionPane.showInputDialog("Enter name");
			age=Integer.parseInt(JOptionPane.showInputDialog("enter age"));
			footballer=new Footballer(name,age);
			team.add(footballer);
		}
		
		String message="Team \n";
		
		Iterator<Footballer>it = team.iterator();
		while (it.hasNext()){
			message+=it.next().toString()+"\n";
		
		}
		
		JOptionPane.showMessageDialog(null, message);
		
		TreeSet<Footballer> sortedbyname= new TreeSet<Footballer>(new ComparebyName());
		sortedbyname.addAll(team);
		JOptionPane.showMessageDialog(null, sortedbyname);
		
		
		TreeSet<Footballer> sortedbyage= new TreeSet<Footballer>(new ComparebyAge());
		sortedbyage.addAll(team);
		JOptionPane.showMessageDialog(null, sortedbyage);
		
		filterFootballers(team);
		
		
		
	}

	private static void filterFootballers(HashSet<Footballer> team) {
		
		for(Footballer f:team){
			if (f.getAge()>30)
				System.out.println(f.toString());
		}
		
	}

}
