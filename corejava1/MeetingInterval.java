package com.preethi.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class MeetingInterval {
	static Set<Pair<Integer,Integer>> intervalSet=new LinkedHashSet<>();
	static {
		intervalSet.add(new Pair<>(7,10));
		intervalSet.add(new Pair<>(2,4));
		//intervalSet.add(new Pair<>(1,1));
	}

	public static void main(String[] args) {
		boolean isOverLap=MeetingInterval.isOverLapping(intervalSet);
		System.out.println(isOverLap);
	}

	private static boolean isOverLapping(Set<Pair<Integer, Integer>> intervalSet) {
		Object[] intervalArr=intervalSet.toArray();
		Pair<Integer,Integer> firstVal=(Pair<Integer, Integer>) intervalArr[0];
		int prevStart=firstVal.getX();
		int prevEnd=firstVal.getY();
		for(int i=1;i<intervalArr.length-1;i++) {
			Pair<Integer,Integer> interval=(Pair<Integer,Integer>) intervalArr[i];
			int currStart=interval.getX();
			int currEnd=interval.getY();
			if(prevStart>currStart && prevEnd>currStart) {
			    return false;
			}
			else {
				prevStart=currStart;
				prevEnd=currEnd;
			}
		}
		return true;
	}
}
