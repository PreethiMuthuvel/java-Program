package Tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ZigZagBinarytree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		List<List<Integer>> levels = zigzagLevelOrder(root);
		System.out.println("Level order traversal:");
		for (List<Integer> level : levels) {
			System.out.println(level);
		}
	}

	private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		Stack<TreeNode> oddStack = new Stack<TreeNode>();
		Stack<TreeNode> evenStack = new Stack<>();
		List<Integer> curLevel = null;
		int level=0;
		evenStack.push(root);
		while(!evenStack.isEmpty() || !oddStack.isEmpty()) {
					curLevel = new ArrayList<Integer>();
					 int size = (level%2==0) ? evenStack.size() : oddStack.size();
					 for (int i = 0; i < size; i++) {
			                TreeNode node;
			                if (level%2==0) {
			                    node = evenStack.pop();
			                    curLevel.add(node.data);
			                    if (node.left != null) 
			                    	oddStack.push(node.left);
			                    if (node.right != null) 
			                    	oddStack.push(node.right);
			                } else {
			                    node = oddStack.pop();
			                    curLevel.add(node.data);
			                    if (node.right != null)
			                    	evenStack.push(node.right); 
			                    if (node.left != null) 
			                    	evenStack.push(node.left);
			                }
			            }
			 result.add(curLevel);
			 level++;
		}
		return result;
	}
}
