package com.hundred.days.ds13;

public class TreeUtils {
	
	public static TreeNode getTree() {
		TreeNode root = new TreeNode(40);
		root.left = new TreeNode(20);
		root.right = new TreeNode(60);
		root.right.right = new TreeNode(70);
		root.right.left = new TreeNode(50);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(80);
		//root.left.right.left = new TreeNode(15);
		
		return root;
	}

}
