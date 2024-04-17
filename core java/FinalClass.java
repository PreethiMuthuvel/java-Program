package com.preethi.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class FinalClass{
	private String name;
	private int age;
	private List<String> addresses;
	FinalClass(String name,int age,List<String> addresses){
		this.name=name;
		this.age=age;
		this.addresses=new ArrayList<>(addresses);
	}
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public List<String> getAddresses(){
		return new ArrayList<>(addresses);
		
	}
}
