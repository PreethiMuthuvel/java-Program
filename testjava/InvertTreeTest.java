package com.testjava;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Arrays;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class InvertTreeTest {
	InvertTree invertTree = new InvertTree();

	@Test
	public void sameTree() {
		TreeNode root1 = new TreeNode(4);
		root1.left = new TreeNode(2);
		root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);
		root1.right = new TreeNode(7);
		root1.right.left = new TreeNode(6);
		root1.right.right = new TreeNode(9);
		TreeNode actual = invertTree.invertTree(root1);
		TreeNode root2 = new TreeNode(4);
		root2.left = new TreeNode(7);
		root2.left.left = new TreeNode(9);
		root2.left.right = new TreeNode(6);
		root2.right = new TreeNode(2);
		root2.right.left = new TreeNode(3);
		root2.right.right = new TreeNode(1);
		TreeNode expected = root2;
		assertEquals(expected, actual);
	}
	

	/*@Test
	public void sametree1() {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		TreeNode root2 = new TreeNode(1);
		root2.right = new TreeNode(2);
		boolean actual = binarySearch.isSameTree(root1, root2);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void sametree2() {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(1);
		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(2);
		boolean actual = binarySearch.isSameTree(root1, root2);
		boolean expected = false;
		assertEquals(expected, actual);
	}*/
}
