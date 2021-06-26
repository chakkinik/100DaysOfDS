package com.hundred.days.ds14;

import java.util.LinkedList;
import java.util.Queue;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class PrintPathFromRootToLeaf {
	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();
		Queue<Integer>  q = new LinkedList<>();
		printThePath(root,q);
	}

	private static void printThePath(TreeNode root,Queue<Integer>  q) {
		
		if(root==null) {
			return;
		}
		
		if(root.left==null && root.right==null) {
			
		}
		
		printThePath(root.left,q);

		printThePath(root.right,q);
		
		
		
	}

}
