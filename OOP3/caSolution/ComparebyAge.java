package com.walsh.ca16;

import java.util.Comparator;

public class ComparebyAge implements Comparator<Footballer>{

	@Override
	public int compare(Footballer f1, Footballer f2) {
		if(f1.getAge()>f2.getAge())
		return +1;
		else
			return -1;
	}

	

}
