package com.testjava;

import java.util.Stack;

public class DepthParanthesis {
	public int maxDepth(String s) {
    Stack<Character> stack=new Stack<>();
    int max=0;
    char[] charArray=s.toCharArray();
    for(char character : charArray){
        if(character=='('){
            stack.push(character);
        }
        if(character==')'){
            max=Math.max(max,stack.size());
            stack.pop();
        }
    }
    return max;
}
}