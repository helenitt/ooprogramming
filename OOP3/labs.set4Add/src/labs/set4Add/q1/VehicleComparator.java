package labs.set4Add.q1;

import java.util.Comparator;

public class VehicleComparator implements Comparator<Q1Vehicle> {
	public int compare(Q1Vehicle v1, Q1Vehicle v2) {
		return v1.toString().compareTo(v2.toString());
	}
}
