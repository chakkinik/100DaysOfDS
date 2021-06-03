package com.hundred.days.ds7;

import java.util.Arrays;

/*
 * Find a Pair Whose Sum is Closest to zero in Array
 * Given an array of +ve and -ve integers, 
 * we need to find a pair whose sum is closed 
 * to Zero in Array.
 * 
 */
public class PairOfCloset {

	public static void main(String[] args) {
		int array[] = { 1, 3, -5, 7, 8, 20, -40, 6 };

		Arrays.sort(array);
		int minSum = Integer.MAX_VALUE;

		int l = 0;
		int r = array.length - 1;
		int currSum = 0;
		int minLeft=l;
		int minRight=r;

		while (l < r) {

			currSum=array[l]+array[r];
			System.out.println(currSum);
			if (Math.abs(minSum) > Math.abs(currSum)) {
				minSum = currSum;
				minLeft=l;
				minRight=r;
			}

			if (currSum < 0) {
				l++;
			} else {
				r--;
			}

		}
		
		System.out.println("=="+array[minLeft]+"===="+array[minRight]);

	}

}
