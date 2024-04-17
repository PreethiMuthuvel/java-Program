package com.preethi.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class CountryTest {

	public Map<String, List<String>> countryMap = new HashMap<>();
	public Map<String, List<String>> stateMap = new HashMap<>();

	public Random random = new Random();

	{
		// countryMap.put("India", List.of("Tamilnadu", "Karnataka", "Kerala", "Andhra",
		// "Telungana", "Maharastra"));
		countryMap.put("India", List.of("Maharastra", "Kerala"));
		countryMap.put("America", List.of("Newyork", "NewJersey"));
		// countryMap.put("America", List.of("Newyork", "NewJersey", "Washington",
		// "Texas", "Atlanta"));
		stateMap.put("Tamilnadu", List.of("Namakkal", "Salem", "Chennai", "Coimbatore", "Madurai", "Trichy"));
		stateMap.put("Karnataka", List.of("Bangalore", "Mysore", "Uduppi", "Humpi"));
		stateMap.put("Kerala", List.of("Ernakkulam", "Cochin", "Trivandrum", "Wayand"));
		stateMap.put("Andhra", List.of("Tripathi", "Kundoor"));
		stateMap.put("Telungana", List.of("Hyderabad", "Vijayawada"));
		stateMap.put("Maharastra", List.of("Pune", "Mumbai"));
		stateMap.put("NewJersey", List.of("Edison", "Parsippany", "Wayne"));
		stateMap.put("Newyork", List.of("Buffalo", "Downtown", "Brooklyn"));
	}

	public static void main(String[] args) {
		CountryTest test = new CountryTest();
		List<Country> countries = test.createCountries();
		System.out.println(countries);
		test.cityNamesOrder(countries);
		test.findPopulation(countries);
		test.MaxPopCityByState(countries);
		// test.MaxPopCityByCountry(countries);
		
		test.avgPopCountry(countries);
		

	}

	private void avgPopCountry(List<Country> countries) {

		for (Country country : countries) {
			long totalPopulation = 0L;
			List<Cityy> allCityList = new ArrayList<>();
			List<State> stateList = country.getStates();
			for (State state : stateList) {
				List<Cityy> cityList = state.getCities();
				for (Cityy city : cityList) {
					totalPopulation = totalPopulation + city.getPopulation();
				}

			}

			int size = stateList.size();
			double avg = totalPopulation / size;
			System.out.println(country + " ," + avg);
		}

	}

	private void cityNamesOrder(List<Country> countries) {

		for (Country country : countries) {
			Map<Country, List<Cityy>> allCityMap = new HashMap<>();
			List<Cityy> allCityList = new ArrayList<>();
			List<State> stateList = country.getStates();
			for (State state : stateList) {
				List<Cityy> cityList = state.getCities();
				for (Cityy city : cityList) {
					allCityList.add(city);
				}
			}
			nameComparator nameComparator = new nameComparator();
			Collections.sort(allCityList, nameComparator);
			for (Cityy city : allCityList) {
				System.out.println(city.name);
			}

		}

	}

	private void MaxPopCityByState(List<Country> countries) {
		/*for (Country country : countries) {

			List<State> stateList = country.getStates();
			List<Cityy> maxPopCity = new ArrayList<>();
			PopulationComparatorr populationComparator=new  PopulationComparatorr();
			for (State state : stateList) {
				List<Cityy> cityList = state.getCities();
				Collections.sort(cityList,populationComparator);
				Cityy minPopulationCity = cityList.get(0);
				Cityy maxPopulationCity = cityList.get(cityList.size() - 1);
				maxPopCity.add(maxPopulationCity);
				System.out.println("minPopulationCity"+" "+minPopulationCity.name + " " + minPopulationCity.population);
				System.out.println("maxPopulationCity"+" "+maxPopulationCity.name + " " + maxPopulationCity.population);

			}
			Collections.sort(maxPopCity,populationComparator);
			Cityy maxByCountry = maxPopCity.get(maxPopCity.size() - 1);
			//Cityy minByCountry = maxPopCity.get(0);
			System.out.println("maxByCountry"+maxByCountry.name + " " + maxByCountry.population);}*/
		
	/*	Map<String, String> highestPopulationCityMap = countries.stream()
                .collect(Collectors.toMap(
                        Country::getName,
                        country -> country.getStates().stream()
                                .flatMap(state -> state.getCities().stream())
                                .max(Comparator.comparing(Cityy::getPopulation))
                                .map(Cityy::getName)
                                .orElse("No cities")));
		System.out.println(highestPopulationCityMap);*/
		Map<String,String> highestPopulationCityMap=countries.stream()
				.collect(Collectors.toMap(Country::getName, country->country.getStates().stream()
						.flatMap(state->state.cities.stream())
						.max(Comparator.comparing(Cityy::getPopulation))
						.map(Cityy::getName)
						.orElse("No Cities")));
		System.out.println(highestPopulationCityMap);
		
		Map<String,String> maxCityByState=countries.stream()
				.flatMap(country->country.getStates().stream())
			    .collect(Collectors.toMap(State::getName, state->state.getCities().stream()
			    		.max(Comparator.comparing(Cityy::getPopulation))
			    		.map(Cityy::getName)
			    		.orElse("No cities")
			    		));
		System.out.println("maxCityByState"+maxCityByState);
	}

	public void findPopulation(List<Country> countries) {
		for (Country country : countries) {
			long populationCount = 0L;
			List<State> stateList = country.getStates();
			for (State state : stateList) {
				long stateCount = 0;
				List<Cityy> cityList = state.getCities();
				for (Cityy city : cityList) {
					//// Map<Cityy, Long> citycount = new HashMap<>();
					// citycount.put(city, city.getPopulation());
					populationCount = populationCount + city.getPopulation();
					stateCount = stateCount + city.getPopulation();
				}
				System.out.println(state.getName() + " " + stateCount);
			}
			System.out.println(country.getName() + " " + populationCount);
		}

	}

	public List<Country> createCountries() {

		List<Country> countries = new ArrayList<>();
		for (String country : countryMap.keySet()) {
			List<String> states = countryMap.get(country);

			List<State> stateList = new ArrayList<>();
			for (String state : states) {
				List<String> cities = stateMap.get(state);
				if (cities == null || cities.isEmpty()) {
					continue;
				}
				List<Cityy> cityList = new ArrayList<>();
				for (String city : cities) {
					long population = random.nextInt(50) * 1000;
					cityList.add(new Cityy(city, population));
				}

				stateList.add(new State(state, cityList));
			}

			countries.add(new Country(country, stateList));

		}
		return countries;
	}
}
