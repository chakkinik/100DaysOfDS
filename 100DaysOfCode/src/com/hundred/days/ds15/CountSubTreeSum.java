package com.hundred.days.ds15;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class CountSubTreeSum {
	
	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();
		
		int count = getSubTreeCount(root, 0,45);
		System.out.println(count);
	}

	private static int getSubTreeCount(TreeNode root, int cnt, int k) {
		if(root==null) {
			return 0;
		}
		
		if(root.data==k) {
			cnt++;
		}
		int r = k-root.data;
		if(root.left!=null && root.right!=null) {
			int v=root.left.data+root.right.data+root.data;
			if(v==k) {
				cnt++;
			}
		}
		
		if(root.left!=null && (root.left.data==k || root.left.data==r)){
			cnt++;
		}
		if(root.right!=null && (root.right.data==k || root.right.data==r)){
			cnt++;
		}
		
		return getSubTreeCount(root.left,cnt,k) + getSubTreeCount(root.right,cnt,k);
		
	}

}
