package labs.ca1;

/* A Comparitor Class which will sort the players by name */

import java.util.Comparator;

public class CompareByName implements Comparator<Footballer> {
	public int compare(Footballer name1, Footballer name2) {
		return name1.getName().compareTo(name2.getName());
	}

}
