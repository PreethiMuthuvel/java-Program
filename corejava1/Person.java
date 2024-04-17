package com.preethi.test;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	String city;
	
	public Person(String name,int age,String city) {
		
		this.name=name;
		this.age=age;
		this.city=city;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


@Override
	public int compareTo(Person o) {
		//System.out.println(Integer.compare(this.age,o.age));
		//System.out.println(this.age+" "+o.age);
	return Integer.compare(this.age, o.age);
	//return this.name.compareTo(o.getName());
		
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	
	
	
}
