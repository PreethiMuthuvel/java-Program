package Tree;

import java.util.Stack;

public class CheckBinarySearch {
	static TreeNode mainRoot;

	public static void main(String args[]) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(0);
		boolean isCheck = CheckBinarySearch.isBinaryTree(root);
		System.out.println(isCheck);
	}

	private static boolean isBinaryTree(TreeNode root) {
		if (root == null)
			return true;

		Stack<TreeNode> stack = new Stack<>();
        TreeNode prev = null;

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            
            if (prev != null && root.data <= prev.data)
                return false;

            prev = root;
            root = root.right;
        }
        return true;
    }
}