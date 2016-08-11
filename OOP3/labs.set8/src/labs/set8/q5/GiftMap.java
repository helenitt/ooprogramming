package labs.set8.q5;

import java.util.*;
import javax.swing.*;

/* This program declares and populates a collection of Gift recipient 
 * Gift record pairs, where the recipient is a String holding the person’s 
 * name, and the gift record is a full Gift object
 */
public class GiftMap {
	public static void main(String[] args) {
		//Gift gift;
		Map<String, Gift> giftMap = new HashMap<String, Gift>();
		
		giftMap.put("Helen", new Gift("Car", 5.00));
		giftMap.put("Sean", new Gift("Computer", 500.00));
		giftMap.put("Pete", new Gift("Book", 20.00));
		giftMap.put("Mark", new Gift("Computer", 10.00));
		
		//(a) display a list of all the gift items you need to get (including any duplicates)
		Set<Map.Entry<String, Gift>> entrySet = giftMap.entrySet();
		Iterator<Map.Entry<String, Gift>> it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Gift> entry = it.next();
			System.out.println(entry.getKey() + " will get " + entry.getValue());
		}
		
		//(b) display the details of the gift you are going to get for a 
		//particular person, if that person is in the map, or an appropriate 
		//message if not 
		while(JOptionPane.showConfirmDialog(null, "Search?") == JOptionPane.YES_OPTION) {
			String name = JOptionPane.showInputDialog("Name: ");
			if(giftMap.containsKey(name)) {
				JOptionPane.showMessageDialog(null, name + "'s gift will be a " + giftMap.get(name));
			}
			else
				JOptionPane.showMessageDialog(null, "That person is not on your list!");
		}
		
		//(c) add another pair to the map
		giftMap.put("Jean", new Gift("Flat", 20.000));
		giftMap.put("Tree", new Gift("Dog", 20.00));
		
		//(d) display a list of all the people for whom you have allocated Gifts
		System.out.println("\nGift List");
		for(String g: giftMap.keySet()) {
			System.out.println(g);
		}
	}
}
