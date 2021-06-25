package com.hundred.days.ds13;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	
	
	
	public static void main(String[] args) {
		
		 TreeNode root = TreeUtils.getTree();
		
		printLevelOrder(root);
	}

	private static void printLevelOrder(TreeNode root) {
		
		if(root==null) {
			return;
		}
		
		 Queue<TreeNode> q  = new LinkedList<>();
		 q.add(root);
		 
		 while(!q.isEmpty()) {
			 
			 TreeNode node = q.poll();
			 
			 if(node!=null) {
			 System.out.println(node.data);
			 
			 q.add(node.left);
			 q.add(node.right);
			 }
			 
		 }
		
		
	}
	
	

}
