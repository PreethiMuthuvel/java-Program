package com.preethi.test;

import java.util.ArrayList;
import java.util.List;

public class FinalClassExample {
	
public static void main(String args[]) {
	List<String> address=new ArrayList();
	address.add("namakkal");
	address.add("cbee");
	FinalClass preethi=new FinalClass("preethi", 24, address);
	address.add("bvc");
	System.out.println(preethi.getAddresses());
	address.add("cbe");
	System.out.println(preethi.getAddresses());
	List<String> result=preethi.getAddresses();
	result.add("chennai");
	System.out.println(address);
}
}
