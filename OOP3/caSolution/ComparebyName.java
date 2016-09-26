package com.walsh.ca16;

import java.util.Comparator;

public class ComparebyName implements Comparator<Footballer> {

	

	@Override
	public int compare(Footballer f1, Footballer f2) {
		// TODO Auto-generated method stub
		return f1.getName().compareTo(f2.getName());
	}

}
