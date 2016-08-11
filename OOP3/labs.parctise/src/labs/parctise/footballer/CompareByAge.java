package labs.parctise.footballer;

import java.util.Comparator;

public class CompareByAge implements Comparator<Footballer> {
	public int compare(Footballer age1, Footballer age2) {
		return age1.getAge() - age2.getAge();
	}
}
