package com.hundred.days.ds7;

import java.util.Arrays;

/*
 * Given a sorted array and a number x,
 *  find the pair in array whose sum is closest 
 *  to xGiven a sorted array, we need to 
 *  find a pair whose sum is closed to number X in Array. 
 */
public class PairOfClosettok {
	
	
	public static void main(String[] args) {
		int array[]={-40,-5,1,3,6,7,8,20};
		
		int k=5;
		
		findPairToK(array,k);

	}

	private static void findPairToK(int[] array, int k) {
		
		Arrays.sort(array);
		
		int i=0;
		int j=array.length-1;
		
		int maxVal = Integer.MAX_VALUE;
		int maxLeft=i;
		int maxRight=j;
		
		while(i<j) {
			
			int sum=array[i]+array[j];
			
			System.out.println(sum);
			
			int diff=k-Math.abs(sum);
			if(maxVal>Math.abs(diff)) {
				maxVal=Math.abs(diff);
				maxLeft=i;
				maxRight=j;
				
			}
			
			if(sum>k) {
				j--;
			} else {
				i++;
			}
			
			
		}
		
		System.out.println("=="+array[maxLeft]+"==="+array[maxRight]);
		
		
	}

}
