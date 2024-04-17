package com.preethi.test;

import java.util.List;

public class CountrySet {

	public void findPopulation(List<Country> countries) {
		Long populationCount=0L;
		for (Country country : countries) {
			List<State> stateList = country.getStates();
			for(State state : stateList) {
				
				List<Cityy> cityList =state.getCities();
				
				for(Cityy city : cityList) {
					populationCount=populationCount+city.getPopulation();
				}
			}
			System.out.println(country.getName()+" "+populationCount);
		}
	}

}
