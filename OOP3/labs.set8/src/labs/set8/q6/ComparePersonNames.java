package labs.set8.q6;

import java.util.*;

public class ComparePersonNames implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
}
