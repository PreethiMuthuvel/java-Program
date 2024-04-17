package com.preethi.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class RemoveDuplicates {
	public void removeDuplicates() {
		List<String> colorList = new ArrayList();
		colorList.add("yellow");
		colorList.add("red");
		colorList.add("blue");
		colorList.add("yellow");
		colorList.add("green");
		colorList.add("red");
		Set<String> removedDuplicates=new LinkedHashSet<String>(colorList);
		System.out.println(removedDuplicates);
	}
}

public class RemoveDuplicateElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates duplicateElements = new RemoveDuplicates();
		duplicateElements.removeDuplicates();
	}
}
