package labs.parctise.footballer;

import java.util.Comparator;

public class ComparebyName implements Comparator<Footballer> {
	public int compare(Footballer name1, Footballer name2) {
		return name1.getName().compareTo(name2.getName());
	}
}
