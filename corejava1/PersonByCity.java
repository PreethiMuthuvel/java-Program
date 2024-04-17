package com.preethi.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonByCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Person[] person=new Person[8];
		Person person1=new Person("kavitha",44,"namakkal");
		person[0]=person1;
		Person person2=new Person("santhosh",20,"chennai");
		person[1]=person2;
		Person person3=new Person("preethi",24,"namakkal");
		person[2]=person3;
		
		Person person4=new Person("saran",22,"chennai");
		person[3]=person4;
		Person person5=new Person("amirtha",8,"usa");
		person[4]=person5;
		Person person6=new Person("krish",10,"usa");
		person[5]=person6;
		Person person7=new Person("muthuvel",54,"namakkal");
		person[6]=person7;
		Person person8=new Person("dhino",50,"namakkal");
		person[7]=person8;
		NameByCity city=new NameByCity();
		city.groupPersonByCity(person);
	
	
	}

}
