package com.hundred.days.ds17;

import java.util.Stack;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class InOrderSuccessor {
	
	public static void main(String[] args) {
		TreeNode root =TreeUtils.getTree();
		inOrderSuccessor(root,50);
	}

	static Stack<TreeNode> stk= new Stack<>();
	private static TreeNode inOrderSuccessor(TreeNode root, int k) {
		if(root==null) {
			return null;
		}
			TreeNode left = inOrderSuccessor(root.left,k);
			TreeNode right= inOrderSuccessor(root.right,k);
		    
			System.out.println(root.data);
			/*if(left!=null)
			System.out.println("left=>"+left.data);
			
			if(right!=null)
			System.out.println("right=>"+right.data);	*/
        
			
			return root;
		
		
	}

}
