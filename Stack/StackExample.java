package Stack;

import java.util.Stack;

public class StackExample {
	public static void main(String args[]) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(34);
		stack.push(7);
		stack.push(2);
		stack.push(46);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stackPeek(stack);
		stackSearch(stack, 34);
		stackSearch(stack, 78);
		stackcon(stack, 3);
		stackEmptyOrNot(stack);

	}

	private static void stackEmptyOrNot(Stack<Integer> stack) {
		// TODO Auto-generated method stub

		System.out.println(stack.isEmpty());

	}

	private static void stackcon(Stack<Integer> stack, int element) {
		// TODO Auto-generated method stub
		if (stack.contains(element)) {

			System.out.println(stack.contains(element));
		}

	}

	private static void stackSearch(Stack<Integer> stack, int element) {
		// TODO Auto-generated method stub

		int position = stack.search(element);
		System.out.println(position);

	}

	private static void stackPeek(Stack<Integer> stack) {
		// TODO Auto-generated method stub

		System.out.println("top element in stack " + stack.peek());

	}

}
