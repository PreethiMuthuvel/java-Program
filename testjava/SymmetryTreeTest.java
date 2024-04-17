package com.testjava;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SymmetryTreeTest {

	SymmetryTree binarySearch = new SymmetryTree();

	@Test
	public void symmetricSearch() {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.left.left = new TreeNode(3);
		root1.left.right = new TreeNode(4);
		root1.right = new TreeNode(2);
		root1.right.left = new TreeNode(4);
		root1.right.right = new TreeNode(3);
		TreeNode leftRoot = root1.left;
		TreeNode rightRoot = root1.right;

		boolean actual = binarySearch.isSymmetricTree(leftRoot, rightRoot);
		boolean expected = true;
		assertEquals(expected, actual);
	}
	@Test
	public void symmetricSearchWithNull() {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.left.right = new TreeNode(3);
		root1.right = new TreeNode(2);
		root1.right.right = new TreeNode(3);
		TreeNode leftRoot = root1.left;
		TreeNode rightRoot = root1.right;

		boolean actual = binarySearch.isSymmetricTree(leftRoot, rightRoot);
		boolean expected = false;
		assertEquals(expected, actual);
	}
}
