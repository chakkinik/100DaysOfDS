package com.hundred.days.ds14;

import java.util.LinkedList;
import java.util.Queue;

import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds13.TreeUtils;

public class FindLevelOfGivenNode {
	
	static int level=0;
	public static void main(String[] args) {
		TreeNode root = TreeUtils.getTree();
		
		printLevelOfNode(root,70);
	}

	private static void printLevelOfNode(TreeNode root,int e) {
		
		if(root==null) {
			return;
		}
		
		Queue<LevelNode> q = new LinkedList<>();
		LevelNode levelNode = new LevelNode(root, 0);
		q.add(levelNode);
		
		while(!q.isEmpty()) {
			
			
			LevelNode node = q.poll();			
			if(node.node.data==e) {
				System.out.println(node.level);
			}
			
			if(node.node.left!=null) {
				LevelNode left = new LevelNode(node.node.left, node.level+1);

				q.add(left);
			}
			if(node.node.right!=null) {
				LevelNode right = new LevelNode(node.node.right, node.level+1);
				q.add(right);
			}
			
		}
		
	}

}

class LevelNode{
 
	public TreeNode node;
	public int level;
	
	public LevelNode(TreeNode node,int level ) {
		this.node=node;
		this.level=level;
	}
}
