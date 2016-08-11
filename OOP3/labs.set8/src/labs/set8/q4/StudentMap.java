package labs.set8.q4;

import java.util.*;
import javax.swing.*;

public class StudentMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Sean", "Halo");
		map.put("Helen", "Snap");
		map.put("Kate", "Pokamon");
		map.put("Jean", "Whist");
		map.put("Tree", "Manopoly");
		
		Set<Map.Entry<String, String>> mapSet = map.entrySet();
		Iterator<Map.Entry<String, String>> it = mapSet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + " plays " + entry.getValue());
		}
		
		while(JOptionPane.showConfirmDialog(null, "Search Student?") == JOptionPane.YES_OPTION) {
			String name = JOptionPane.showInputDialog(null, "Name: ");
			if(map.containsKey(name))
				JOptionPane.showMessageDialog(null, name + " plays " + map.get(name));
			else
				JOptionPane.showMessageDialog(null, "Name not found!");
		}
	}
}
