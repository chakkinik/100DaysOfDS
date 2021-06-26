package com.hundred.days.ds14;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class PrintPathFromRootToLeaf {
	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();
		Deque<Integer>  q = new ArrayDeque<Integer>();
		printThePath(root,q);
	}

	private static void printThePath(TreeNode root,Deque<Integer>  q) {
		
		if(root==null) {
			return;
		}
		
		q.addLast(root.data);
		if(root.left==null && root.right==null) {
			System.out.println(q);
		}
		
		printThePath(root.left,q);

		printThePath(root.right,q);
		q.removeLast();
		
		
	}

}
