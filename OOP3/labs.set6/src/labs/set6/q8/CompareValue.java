package labs.set6.q8;

import java.util.*;

public class CompareValue implements Comparator<Bicycle> {

	@Override
	public int compare(Bicycle bike1, Bicycle bike2) {
		if(bike1.getValue() > bike2.getValue())
			return 1;
		else if(bike1.getValue() == bike2.getValue())
			return 0;
		else
			return -1;
	}

}
