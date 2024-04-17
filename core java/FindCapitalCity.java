package com.preethi.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindCapitalCity {

	public static void main(String[] args) {
		List<CapitalCity> cities = new ArrayList<CapitalCity>();
		CapitalCity city1 = new CapitalCity(1, "City1", "C1", 1500000);
		CapitalCity city2 = new CapitalCity(2, "City2", "C2", 1200000);
		CapitalCity city3 = new CapitalCity(3, "City3", "C3", 1800000);
		CapitalCity city4 = new CapitalCity(4, "City4", "C4", 900000);
		CapitalCity city5 = new CapitalCity(5, "City5", "C5", 2000000);

		cities.add(city1);
		cities.add(city2);
		cities.add(city3);
		cities.add(city4);
		cities.add(city5);
		CapitalCity city = cities.stream().max(Comparator.comparingInt(CapitalCity::getPopulation)).orElseThrow();
		System.out.println(city);
	}

}
