package com.testjava;

public class LCA {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null || root == p || root == q) {
			return root;
		}

		// Recursively search for the LCA in the left and right subtrees
		TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
		TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

		// If both nodes are found in different subtrees, the current root is the LCA
		if (leftLCA != null && rightLCA != null) {
			return root;
		}

		// If one of the nodes is found, return that node
 		//return (leftLCA != null) ? leftLCA : rightLCA;
		if (leftLCA != null) {
		    return leftLCA;
		} else {
		    return rightLCA;
		}
	}

}
