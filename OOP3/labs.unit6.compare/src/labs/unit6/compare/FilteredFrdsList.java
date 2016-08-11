package labs.unit6.compare;

import java.util.*;

public class FilteredFrdsList {
	public static void main(String[] args) {
		Person person;
		List<Person> friends = new ArrayList<Person>();
		
		//Populate the list
		person = new Person("Sean", 21, 'M');
		friends.add(person);
		person = new Person("Helen", 25, 'F');
		friends.add(person);
		person = new Person("Paul", 16, 'M');
		friends.add(person);
		person = new Person("Jean", 85, 'F');
		friends.add(person);
		person = new Person("Lola", 10, 'F');
		friends.add(person);
		
		//Remove anyone under 20
		Iterator<Person> it = friends.iterator();
		
		while(it.hasNext())
			if(it.next().getAge() < 20)
				it.remove();
		
		System.out.println(friends);
	}
}
