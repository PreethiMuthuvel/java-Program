package com.testjava;

public class SameTree {
	TreeNode root;
	public boolean isSameTree(TreeNode root1,TreeNode root2) {
		if(root1==null && root2==null) {
			return true;
		}
		if(root1==null || root2==null) {
			return false;
		}
		if(root1.data==root2.data) {
			return isSameTree(root1.left,root2.left)
			&& isSameTree(root1.right,root2.right);
			
		}
		return false;
	}

}
