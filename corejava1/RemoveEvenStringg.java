package com.preethi.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveEvenStringg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList();
		names.add("preethi");
		names.add("sarann");
		names.add("kavitha");
		names.add("muthuvel");
		names.add("kavi");
		Iterator<String> nameIterator = names.iterator();
		while (nameIterator.hasNext()) {
			String name = nameIterator.next();
			int nameOfLength = name.length();
			if (nameOfLength % 2 == 0) {
				nameIterator.remove();
			}
		}
		System.out.println(names);
	}
}