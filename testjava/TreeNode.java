package com.testjava;

import java.util.Objects;

public class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		TreeNode other = (TreeNode) obj;
		return this.data == other.data && Objects.equals(this.left, other.left)
				&& Objects.equals(this.right, other.right);
	}
}
