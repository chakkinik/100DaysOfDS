package com.hundred.days.ds18;

import com.hundred.days.ds13.LevelOrderTraversal;
import com.hundred.days.ds13.TreeNode;
import com.hundred.days.ds14.FindLevelOfGivenNode;

public class ConvertSortedArrayIntoBST {
	
	public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        
       TreeNode root= convertIntoBST(arr,0,arr.length-1);
       LevelOrderTraversal.printLevelOrder(root);

	}

	private static TreeNode convertIntoBST(int[] arr, int start, int end) {
		
		if(start>end) {
			return null;
		}
		
		int mid =(start+end)/2;
		
		TreeNode node  = new TreeNode(arr[mid]);
		
		node.left = convertIntoBST(arr,start,mid-1);
		node.right =convertIntoBST(arr,mid+1,end);
		
		return node;
	}

}
