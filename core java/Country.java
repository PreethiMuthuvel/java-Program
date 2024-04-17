package com.preethi.test;

import java.util.List;

public class Country {

	String name;
	List<State> states;

	public Country(String country, List<State> stateList) {
		
		this.name=country;
		this.states=stateList;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	@Override
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append(name + " : [");
		for (State state : states) {
			buff.append(state.name + "[");
			for (Cityy city : state.cities) {
				buff.append(city.name + ":" + city.population + " ,");
			}
			buff.append("], ");
		}
		buff.append(System.lineSeparator());

		return buff.toString();
	}

}
