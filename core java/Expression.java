package com.preethi.test;

import java.util.Stack;

public class Expression {

	public static void main(String[] args) {

		String[] stringArray = { "10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		int value = Expression.calculateExpression(stringArray);
		System.out.println(value);
	}

	private static int calculateExpression(String[] stringArray) {
		Stack<Integer> stack = new Stack<Integer>();
		for (String string : stringArray) {
			if (!(string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/"))) {
				stack.push(Integer.parseInt(string));//(integer to string=Integer.toString(number);
			} else {
				try {
					if (string.equals("/")) {
						int first = stack.pop();
						int second = stack.pop();
						int result = second / first;
						stack.push(result);
					} else if (string.equals("+")) {
						int first = stack.pop();
						int second = stack.pop();
						int result = second + first;
						stack.push(result);
					} else if (string.equals("*")) {
						int first = stack.pop();
						int second = stack.pop();
						int result = second * first;
						stack.push(result);
					} else if (string.equals("-")) {
						int first = stack.pop();
						int second = stack.pop();
						int result = second - first;
						stack.push(result);
					}
				} catch (Exception e) {
					 System.out.println("Cannot evaluate the expression..because stack has only one element");
				}
			}
		}
		return stack.pop();
	}
}
