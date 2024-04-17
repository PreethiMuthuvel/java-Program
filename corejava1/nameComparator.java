package com.preethi.test;

import java.util.Comparator;

public class nameComparator implements Comparator<Cityy> {
	public int compare(Cityy o1, Cityy o2) {
		return o1.name.compareTo(o2.name);//if +1 ,it will swap in ascending,if -1 it will swap in decending.If 0 ,won't swap.
	}

}
