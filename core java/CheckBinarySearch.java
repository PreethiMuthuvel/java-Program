package com.preethi.test;

import java.util.Stack;

public class CheckBinarySearch {
	static TreeNode mainRoot;

	public static void main(String args[]) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(1);
		boolean isCheck = CheckBinarySearch.isBinaryTree(root);
		System.out.println(isCheck);
	}

	private static boolean isBinaryTree(TreeNode root) {
		if (root == null)
			return true;

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();

			if (node.left != null) {
				if (node.left.data >= node.data) {
					return false;
				}
				stack.push(node.left);
			}
			if (node.right != null) {
				if (node.right.data <= node.data) {
					return false;
				}
				stack.push(node.right);
			}
		}
		return true;
	}
}
