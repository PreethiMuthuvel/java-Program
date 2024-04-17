package com.testjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;



public class RemoveValidParanthesis {

	public String removeValidParanthesis(String string) {
		Stack<Character> stack = new Stack<>();
		Map<Character,List<Integer>> map=new HashMap<Character,List<Integer>>();
		List<Character> characterList=new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			characterList.add(string.charAt(i));
			List<Integer> numList=new ArrayList<>();
			List<Integer> numberList = map.getOrDefault(string.charAt(i),
				new ArrayList<Integer>());
			numberList.add(i);
			map.put(string.charAt(i), numberList);
			if (string.charAt(i) == '(') {
				stack.push(string.charAt(i));
			} else if (string.charAt(i) == ')') {
				if (stack.peek() == ')') {
					stack.pop();
				} else {
					stack.push(string.charAt(i));
				}
			}
		}
		int value=stack.pop();
		int index=0;
		for(Map.Entry<Character, List<Integer>> entry : map.entrySet()) {
			if(map.containsKey(value)) {
				List<Integer> numList1=map.get(value);
					for(int i=0;i<numList1.size();i++) {
						if(i==0) {
						 index=i;}
						else {
							break;
						
				}
			}
			
		}}
		if(characterList.contains(index)) {
			characterList.remove(index);
		}
		StringBuilder sb = new StringBuilder();

		for (int number : characterList) {
		    sb.append(number);
		}

		return sb.toString();
	}

}
