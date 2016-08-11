//VendingTest.java

import javax.swing.*;

public class VendingTest {
    public static void main (String args[]) {
    	 VendingMachine machine = new VendingMachine();
    	
    	menu();
    	
    	JOptionPane.showMessageDialog(null,"Bye!");
    	System.exit(0);
    	
    	public static void cansNeeded()
    	{
    		boolean valid = false;
    		do
    		{
    			String s =JOptionPane.showInputDialog("There are " +machine.getCanCount()+ "Cans in the machine.\nHow many cans do you want?");
    			
    			if(isDigit(s))
    			{
    				int totalToken = Integer.parseInt(s);
    				if (machine.getCanCount()>=totalToken)
    				{
    					for(int i =0; i< totalToken; i++)
    						machine.insertToken();
    						valid = true;
    				}
    			}
    		}while(!valid);
    	}
    }
    
    public static void stockNeeded()
    {
    	do
    	{
    		String s = JOptionPane.showInputDialog("How many cans do you want to fill up?");
    		
    		if(isDigit(s))
    			machine.fillUp(integer.parseInt(s));
    	} while (machine.getCanCount()<=0);
    }
    
    public static void menu (){
    	char ch;
    	do{
    		String choice = JOPtionPane.showInputDialog("Hello, what would you like to do ?\nPlease specify from these options:\n"
    			+"Purchase\nStock\nExit");
    		ch = choice.toLowercase().charAt(0);
    		
    		switch (ch) {
    			case 'p':
    				
    				if (machine.isEmpty())
    					cansRquired();
    				else{
    					int ask = JOptionPane.showConfirmDialog(null,"Vending machine is empty. Would you like to fill up?","Warning",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
    					
    					if(ask == JOptionPane.YES_OPTION)
    						stockNeeded();
    				}
    				break;
    			case 's':
    				stockNeeded();
    				break;
    			
    			case 'e':
    				JOptionPane.ShowMessageDialog(null, machine.toString(),"Vending Machine",JOptionPane.INFORMATION_MESSAGE);
    				break;
    				
    			default:
    				JOptionPane.showMessageDialog(null,"Please enter valid input");
    		}
    	} while (ch != 'e');
    }
    
    public static boolean isDigit(String s)
    {
    	for(int i = 0; i< s.Length(); i++)
    	{
    		if (Character.isDigit(s.charAt(i)))
    			return true;
    	}
    	return false;
    }
}