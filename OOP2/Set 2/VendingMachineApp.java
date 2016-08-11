//VendingMachineApp.java
/*This program simulates a vending machine selling cans of pop*/
//Not cycling! while loop instead of switch?

import javax.swing.JOptionPane;

public class VendingMachineApp {
	public static void main(String[] args) {
		
		String choice;
		int cans, numCans;
		
		VendingMachine machine = new VendingMachine();
		
		choice = JOptionPane.showInputDialog("Please enter your choice: " + 
											 "\nPurchase a can: 1\nFill machine: 2" +
											 "\nStock take: 3\nExit program: 4");
		
		do {
			
			switch(choice) {
				case "1": 
					//to simulate user puting in a token to buy cans
					cans = 0;
					cans = Integer.parseInt(JOptionPane.showInputDialog("How many will you buy?: "));
					
					JOptionPane.showMessageDialog(null, "No of cans to be purchased: " + cans);
					
					//Should the if processing go in this program or the Instantiable Class????	
					if(cans<=machine.getCanCount()) {
						machine.buyCan(cans);
					choice = JOptionPane.showInputDialog("Please enter your choice: " + 
														 "\nPurchase a can: 1\nFill machine: 2" +
														 "\nStock take: 3\nExit program: 4");
					}
							
					else {
						JOptionPane.showMessageDialog(null,"Not enough cans: ","Warning",JOptionPane.WARNING_MESSAGE);
							
						choice = JOptionPane.showInputDialog("Please enter your choice: " + 
															 "\nPurchase a can: 1\nFill machine: 2" +
															 "\nStock take: 3\nExit program: 4");
						}	
						break;
						
				case "2":
					//simulates filling machine
					cans = 0;
					cans = Integer.parseInt(JOptionPane.showInputDialog("Number of cans being put in: "));
					machine.fillUp(cans);
					JOptionPane.showMessageDialog(null, "Number of cans to be put in: " + cans);
					
					choice = JOptionPane.showInputDialog("Please enter your choice: " + 
															 "\nPurchase a can: 1\nFill machine: 2" +
															 "\nStock take: 3\nExit program: 4");
					break;
					
				case "3": 
					//Simulates stock take
					JOptionPane.showMessageDialog(null, "Stock Take: \n" + machine.toString());
					
					choice = JOptionPane.showInputDialog("Please enter your choice: " + 
															 "\nPurchase a can: 1\nFill machine: 2" +
															 "\nStock take: 3\nExit program: 4");
					break;
					
				case "4":
					//exit program
					break;
				}
		}while(!choice.equals("4"));
		
		System.exit(0);
	}
}