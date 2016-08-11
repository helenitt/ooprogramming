package labs.set5.q6;

import java.util.*;

public class q6 {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		//Set<int> num = new ArrayList<int>();
		
		names.add("Tom");
		names.add("Liz");
		names.add("Jean");
		names.add("Sean");
		names.add("Tree");
		names.add("Beth");
		
		Set<String> friends = new HashSet<String>();
		
		friends.add("Tim");
		friends.add("Liz");
		friends.add("Janet");
		friends.add("Sue");
		friends.add("Trey");
		friends.add("Beth");
		
		System.out.println(names);
		System.out.println(friends);
		
		// TreeSet - sorted
		TreeSet<String> sortedNames = new  TreeSet<String>(names);
		System.out.println(sortedNames);
		System.out.println("First Name: " + sortedNames.first());
		
		TreeSet<String> sortedFriends = new  TreeSet<String>(friends);
		System.out.println(sortedFriends);
		System.out.println("First Name: " + sortedFriends.first());
		
		// containsAll()
		System.out.println(sortedNames.containsAll(sortedFriends));
		
		// removeAll() example
		System.out.println(sortedNames.removeAll(sortedFriends));
		System.out.println(sortedFriends);
		System.out.println(sortedNames);
		
		// remove(int index) example
		names.remove("Liz");
		System.out.println(names);  
		System.out.println(sortedNames);
		
		// Say how many friends
		System.out.println(sortedFriends.size());
		
		
		
	    // with numbers
		/*
		num.add(9);
		num.add(5);
		num.add(6);
		num.add(8);
		num.add(2);
		num.add(1);
		
		System.out.println(num);
		*/
		
		//System.out.println("First Number: " + sortedNum.first());    
	}
}
