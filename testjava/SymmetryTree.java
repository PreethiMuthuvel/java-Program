package com.testjava;

public class SymmetryTree {
	TreeNode root;
	public boolean isSymmetricTree(TreeNode root1,TreeNode root2) {
		if(root1==null && root2==null) {
			return true;
		}
		if(root1==null || root2==null) {
			return false;
		}
		if(root1.data==root2.data) {
			return isSymmetricTree(root1.left,root2.right)
			&& isSymmetricTree(root1.right,root2.left);
			
		}
		return false;
	}

}
