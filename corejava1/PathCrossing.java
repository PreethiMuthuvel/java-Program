 package com.preethi.test;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
	public static void main(String[] args) {
		String path = "NESWW";
		boolean isPathCheck = PathCrossing.isPathCrossing(path);
		System.out.println(isPathCheck);
	}

	private static boolean isPathCrossing(String path) {
		int x = 0;
		int y = 0;
  		Set<Pair<Integer, Integer>> coOrdinatesSet = new HashSet<>();
		coOrdinatesSet.add(new Pair<>(x, y));
		char[] characterArray = path.toCharArray();
		for (char characterPath : characterArray) {
			if (characterPath == 'N') {
				y++;
			} else if (characterPath == 'S') {
				y--;
			} else if (characterPath == 'E') {
				x++;
			} else if (characterPath == 'W') {
				x--;
			}
			Pair<Integer, Integer> coOrdinates = new Pair<>(x, y); 
			if(coOrdinatesSet.contains(coOrdinates)) {
				return true;
			}
			coOrdinatesSet.add(coOrdinates);
			System.out.println(coOrdinates.toString());
		}
		return false;
	}
}
