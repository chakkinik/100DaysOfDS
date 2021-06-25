package com.hundred.days.ds13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagPrint {

	public static boolean leftToRight = true;

	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();

		zigZag(root);
	}

	private static void zigZag(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> currentLevel = new Stack<>();
		Stack<TreeNode> nextLevel = new Stack<>();
		
		currentLevel.add(root);
		
		while(!currentLevel.isEmpty()) {
			
			
			TreeNode node = currentLevel.pop();
			System.out.print(node.data+"=>");
			
			if(leftToRight) {
				if(node.left!=null) {
					nextLevel.add(node.left);
				}if(node.right!=null) {
					nextLevel.add(node.right);
				}
			} else {
				if(node.right!=null) {
					nextLevel.add(node.right);
				}if(node.left!=null) {
					nextLevel.add(node.left);
				}
				
			}
			
			if(currentLevel.isEmpty()) {
				leftToRight=!leftToRight;
				currentLevel=nextLevel;
				nextLevel= new Stack<TreeNode>();
				
			}
			
		}
	}

}
