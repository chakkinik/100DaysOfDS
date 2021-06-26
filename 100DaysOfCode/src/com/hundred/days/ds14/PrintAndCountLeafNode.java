package com.hundred.days.ds14;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class PrintAndCountLeafNode {
	
	static int leafNodeCount=0;
	public static void main(String[] args) {
		 TreeNode root = TreeUtils.getTree();
		 
		 countLeafNode(root);
		 System.out.println(leafNodeCount);
	}

	private static void countLeafNode(TreeNode root) {
		
		if(root==null) {
			leafNodeCount++;
			return;
		}
		
		countLeafNode(root.left);
		countLeafNode(root.right);
	}
	

}
