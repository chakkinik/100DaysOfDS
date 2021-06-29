package com.hundred.days.ds16;

import com.hundred.days.ds13.LevelOrderTraversal;
import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class InsertNodeInBinarySearchTree {
	
	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();
		TreeNode insertNode = new TreeNode(15);
		insertBinaryTree(root,insertNode);
		LevelOrderTraversal.printLevelOrder(root);
		
	}

	private static TreeNode insertBinaryTree(TreeNode root, TreeNode insertNode) {
		
		if(root==null) {
			return null;
		}
		
		if(insertNode.data>root.data) {
			root.right =insertBinaryTree(root.right, insertNode);
			
			
		} else {
			root.left =insertBinaryTree(root.left, insertNode);
		}
		
		return insertNode;
		
	}

}
