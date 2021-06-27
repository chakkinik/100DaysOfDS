package com.hundred.days.ds15;

import java.util.HashMap;
import java.util.Map;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class PrintVertical {
	
	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();
		
		Map<Integer,Integer> path = new HashMap<>();
		path.put(root.data, 0);
		
		populatePath(root,path);
		
		System.out.println(path);
	}

	private static void populatePath(TreeNode root, Map<Integer, Integer> path) {
		if(root==null) {
			return;
		}
		
		if(root.left!=null) {
			path.put(root.left.data, path.get(root.data)+1);
			populatePath(root.left,path);
		} 
		if(root.right!=null) {
			path.put(root.right.data, path.get(root.data)-1);
			populatePath(root.right,path);
		}
	}

}
