package com.preethi.test;

public class BinaryTree {
    TreeNode root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(3);
        binaryTree.insert(9);
        binaryTree.insert(20);
        binaryTree.insert(15);
        binaryTree.insert(7);
       
    }

    public void insert(int data) {
        root = insertRecursive(root, data);
        System.out.print(data + " ");
    }

    private TreeNode insertRecursive(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }

        if (root.left == null) {
            root.left = insertRecursive(root.left, data);
        } else if (root.right == null) {
            root.right = insertRecursive(root.right, data);
        } else {
            // You can choose how to handle cases where both left and right children are not null.
            // For simplicity, in this example, we insert to the left in such cases.
            root.left = insertRecursive(root.left, data);
        }

        return root;
    }
}