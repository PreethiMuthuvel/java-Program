package com.preethi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ExtraParanthesisRemove {
	public static void main(String args[]) {
		String string =   "((a)b(c)d";
		Stack<Integer> stack = new Stack<>();
        List<Integer> removeIndices = new ArrayList<>();
        for (int i = 0; i<string.length();i++) {
            char c =string.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                } else {
                    removeIndices.add(i); 
                }
            }
        }
        while (!stack.isEmpty()) {
            removeIndices.add(stack.pop()); 
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length();i++) {
            if (!removeIndices.contains(i)) {
                sb.append(string.charAt(i));
            }
        }
       System.out.println(sb.toString());
    }
}