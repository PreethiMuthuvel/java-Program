package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InvertBinaryTree {
	static List<Integer> resultList = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(4);
		root1.left = new TreeNode(2);
		root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);
		root1.right = new TreeNode(7);
		root1.right.left = new TreeNode(6);
		root1.right.right = new TreeNode(9);
		TreeNode root = InvertBinaryTree.invertTree(root1);
		// printTree(root);
		while(root!=null) {
			System.out.println(root.data);
		}

	}

	private static TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return root;
		}

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);
		return root;
	}

}
