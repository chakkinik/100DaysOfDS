package com.hundred.days.ds18;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class CheckValidBST {
	
	public static void main(String[] args) {
		TreeNode root=TreeUtils.getTree();
		
		System.out.println(isValidBST(root,Integer.MAX_VALUE,Integer.MIN_VALUE));
	}

	private static boolean isValidBST(TreeNode root,Integer max,Integer min) {
		if(root==null) {
			return true;
		}
		
		boolean left =isValidBST(root.left,root.data,min);
		boolean right =isValidBST(root.right,max,root.data);
		if(max<root.data || root.data<min) {
			return false;
		} 
		
		
		
		
		return left && right;
		
	}

}
