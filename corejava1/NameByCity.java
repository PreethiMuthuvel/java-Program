package com.preethi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NameByCity {

	NameByCity() {

	}

	public void groupPersonByCity(Person[] personArr) {

		Map<String, List<Person>> nameByCityMap = new HashMap<String, List<Person>>();

		for (Person personn : personArr) {
			List<Person> personList = nameByCityMap.getOrDefault(personn.getCity(), new ArrayList<Person>());
			personList.add(personn);
			nameByCityMap.put(personn.getCity(), personList);
		}

		// System.out.println(nameByCityMap.toString());
		//Set<Map.Entry<String, List<Person>>> entrySet = nameByCityMap.entrySet();
		/*for (Map.Entry<String, List<Person>> entry : nameByCityMap.entrySet()) {
			String city = entry.getKey();
			List<Person> personList = entry.getValue();
			Collections.sort(personList);
			System.out.print(city + ":");
			for (Person person : personList) {
				System.out.print(person.name + ",");
			}
			System.out.println();
		}*/
		for(Map.Entry<String, List<Person>> entry : nameByCityMap.entrySet()) {
			String city=entry.getKey();
			List<Person> personList=entry.getValue();
			Collections.sort(personList);
			System.out.println(city +" :");
			for(Person person : personList) {
				System.out.print(person.name+ ",");
			}
			System.out.println();
			
		}
	}
}
