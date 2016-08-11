package labs.set6.q8;

import java.util.*;

public class CompareMake implements Comparator<Bicycle> {

	@Override
	public int compare(Bicycle bike1, Bicycle bike2) {
		return bike1.getMake().compareTo(bike2.getMake());
	}

}
