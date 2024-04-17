package com.preethi.test;

import java.util.Comparator;

public class PopulationComparatorr implements Comparator<Cityy> {

	@Override
	public int compare(Cityy o1, Cityy o2) {
	
		return Long.compare(o1.population, o2.population);
	}

}
