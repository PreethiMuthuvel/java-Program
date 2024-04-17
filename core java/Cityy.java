package com.preethi.test;

public class Cityy implements Comparable<Cityy>{

	String name;
	long population;

	public Cityy(String name, long population) {
		this.name = name;
		this.population = population;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	
	
	@Override
	public String toString() {
		return "Cityy [name=" + name + ", population=" + population + "]";
	}

	@Override
	public int compareTo(Cityy o) {
		System.out.println(Long.compare(this.population, o.getPopulation()));
		System.out.println("preethi"+this.population+ " "+o.population);
		return Long.compare(this.population, o.getPopulation());
	}

}
