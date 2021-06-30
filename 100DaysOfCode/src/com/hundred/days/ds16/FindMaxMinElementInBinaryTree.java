package com.hundred.days.ds16;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class FindMaxMinElementInBinaryTree {

	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {

		TreeNode root = TreeUtils.getTree();

		findMaxMin(root);
		
		System.out.println("===>"+max+"==="+min);
	}

	private static void findMaxMin(TreeNode root) {

		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {

			if (root.data > max) {
				max = root.data;
			} 
			if (root.data < min) {
				min = root.data;
			}
			// System.out.println("data==>"+root.data);
		}

		findMaxMin(root.left);
		findMaxMin(root.right);

	}

}
