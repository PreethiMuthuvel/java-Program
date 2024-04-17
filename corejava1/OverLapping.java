package com.preethi.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class OverLapping {
	static Set<Pair<Integer, Integer>> timeIntervalSet = new LinkedHashSet<Pair<Integer, Integer>>();
	static {
		timeIntervalSet.add(new Pair<>(1, 3));
		timeIntervalSet.add(new Pair<>(2, 6));
		timeIntervalSet.add(new Pair<>(8, 10));
		timeIntervalSet.add(new Pair<>(15, 18));
	}

	public static void main(String args[]) {
		Set<Pair<Integer, Integer>> isOverLap = OverLapping.overLap(timeIntervalSet);
		System.out.println(isOverLap);
	}

	private static Set<Pair<Integer, Integer>> overLap(Set<Pair<Integer, Integer>> timeIntervalSet) {
		Set<Pair<Integer, Integer>> resultSet = new LinkedHashSet<Pair<Integer, Integer>>();
		Object[] timeIntervals = timeIntervalSet.toArray();
		Pair<Integer, Integer> firstPair = (Pair<Integer, Integer>) timeIntervals[0];
		int prevStart = firstPair.getX();
		int prevEnd = firstPair.getY();
		for (int i = 1; i < timeIntervals.length; i++) {
			Pair<Integer, Integer> currentPair = (Pair<Integer, Integer>) timeIntervals[i];
			int currStart = currentPair.getX();
			int currEnd = currentPair.getY();
			if (currStart < prevEnd) {
				prevEnd = Math.max(prevEnd, currEnd);
			} else {
				Pair pair = new Pair(prevStart, prevEnd);
				resultSet.add(pair);
				prevEnd = currEnd;
				prevStart = currStart;
			}
		}
		Pair pair = new Pair(prevStart, prevEnd);
		resultSet.add(pair);
		return resultSet;
	}
}