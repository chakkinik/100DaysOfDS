package com.hundred.days.ds15;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class TreeLCA {

	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();

		TreeNode lca = getLCA(root, 20, 50);
		System.out.println(lca.data);
	}

	private static TreeNode getLCA(TreeNode root, int i, int j) {

		if (root == null) {
			return null;
		}
		
		if(root.data==i || root.data==j) {
			return root;
		}
		
		 TreeNode left = getLCA(root.left, i, j);
		  TreeNode right = getLCA(root.right, i, j);
		  
		  if(left!=null && right!=null)
	            return root;
		  
		  if(left==null) {
			 return right;
		  } else {
			  return left;
		  }

	}

}
