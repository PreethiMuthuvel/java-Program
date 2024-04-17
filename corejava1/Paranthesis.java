package com.preethi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Paranthesis {
  static Map<Character,Character> paranthesisMap=new HashMap<Character,Character>();
  static {
	  paranthesisMap.put('{', '}');
	  paranthesisMap.put('[', ']');
	  paranthesisMap.put('(', ')');
  }
	public static void main(String[] args) {
		String string="{[]}";
		boolean isValid=Paranthesis.isValidParanthesis(string);
		System.out.println(isValid);

	}
	private static boolean isValidParanthesis(String string) {
		Stack<Character> stack=new Stack<Character>();
		char[] charArr=string.toCharArray();
		for(char character : charArr) {
			if(paranthesisMap.containsKey(character)) {
				stack.push(character);
			}
			else if(stack.isEmpty() || paranthesisMap.get(stack.pop())!=character) {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
