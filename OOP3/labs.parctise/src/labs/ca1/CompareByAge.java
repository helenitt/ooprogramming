package labs.ca1;

/* A Comparitor Class which will sort the players by name */

import java.util.Comparator;

public class CompareByAge implements Comparator<Footballer> {
	public int compare(Footballer age1, Footballer age2) {
		return age1.getAge() - age2.getAge();
	}
}