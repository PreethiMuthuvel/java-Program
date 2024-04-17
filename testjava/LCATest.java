package com.testjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LCATest {
	@Test
	public void testFindLCA() {
		TreeNode root = new TreeNode(3);
		root.left= new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		LCA binaryTreeLCA = new LCA();
		TreeNode p = root.left;
		TreeNode q =root.left.right.right;
		TreeNode result = binaryTreeLCA.lowestCommonAncestor(root, p, q);

		assertEquals(5, result.data, "Lowest Common Ancestor is not correct");

	}
}