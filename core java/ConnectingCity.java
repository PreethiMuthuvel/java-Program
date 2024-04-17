package com.preethi.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class City {
	String city;
	Set<City> connection = new HashSet<City>();

	public City(String city) {
		this.city = city;

	}

	/*
	 * public void addConnection(City city) {
	 * 
	 * this.connection.add(city); city.connection.add(this); }
	 * 
	 * public Collection<City> getConnections() {
	 * 
	 * return connection; }
	 * 
	 * public boolean isConnected(City city) { return connection.contains(city); }
	 */

	@Override
	public String toString() {
		return this.city;
	}

	public void addConnection(City salerno) {
		this.connection.add(salerno);
		salerno.connection.add(this);
	}

	public Collection<City> getConnections() {
		// TODO Auto-generated method stub
		return connection;
	}

	public boolean isConnected(City city) {
		if (this.connection.contains(city)) {
			return true;
		}
		for (City connectedCity : this.connection) {
			if (connectedCity.isConnected(city)) {
				return true;
			}
		}
		return false;
	}
}

public class ConnectingCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City napoli = new City("Napoli");
		City roma = new City("Roma");
		City salerno = new City("Salerno");
		City parigai = new City("Parigi");
		napoli.addConnection(salerno);
		salerno.addConnection(roma);
		//parigai.addConnection(roma);
		//napoli.addConnection(roma);

		Collection<City> napoli_connection = napoli.getConnections();
		Collection<City> roma_connection = roma.getConnections();
		System.out.println(roma_connection.toString());
		System.out.println(napoli_connection.toString());
		System.out.println(parigai.isConnected(roma));
		//System.out.println(salerno.isConnected(parigai));
		System.out.println(roma.isConnected(napoli));
		//System.out.println(napoli.isConnected(roma));

	}

}



