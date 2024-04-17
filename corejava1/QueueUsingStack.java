package com.preethi.test;

import java.util.Stack;

public class QueueUsingStack {
	public static void main(String args[]) {
		Queue stack = new Queue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		stack.push(5);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());

	}
}

class Queue {
	Stack<Integer> stack;
	Stack<Integer> queue;

	public Queue() {
		this.stack = new Stack();
		this.queue = new Stack();
	}

	public void push(int element) {
		stack.push(element);
	}

	public boolean empty() {

		return queue.isEmpty();
	}

	public int pop() {
		if (queue.isEmpty()) {
		while (!stack.isEmpty()) {
			queue.push(stack.pop());
		}
		
	}
		return queue.pop();
	}
	public int peek() {
		if (queue.isEmpty()) {
		while (!stack.isEmpty()) {
			queue.push(stack.pop());
		}
		
	}
		return queue.peek();
}}
