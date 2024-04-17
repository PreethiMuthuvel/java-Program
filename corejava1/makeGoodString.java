package com.preethi.test;

import java.util.Stack;

public class makeGoodString {
	public static void main(String[] args) {
		String string = "LleEeetcode";
		StringBuilder resultString = new StringBuilder();
		Stack<Character> stack = new Stack<Character>();
		char[] charArr = string.toCharArray();
		for (char character : charArr) {
			if (!stack.isEmpty() && Math.abs(stack.peek() - character) == 32) {
				stack.pop();
			} else {
				stack.push(character);
			}
		}
		while (!stack.isEmpty()) {
			resultString = resultString.append(stack.pop());
		}
		resultString.reverse();
		System.out.print(resultString);
	}
}
