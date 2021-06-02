package com.hundred.days.ds6;

/*
 * Question 20: Find second largest number in an array
You are given a sorted and rotated array as below:
 */
public class SecondHighest {

	public static void main(String[] args) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };

		System.out.println(findSecondLargest(arr1));
		// Second largest element in the array: 6
	}

	private static int findSecondLargest(int[] arr) {

		int h = Integer.MIN_VALUE;
		int h2 = Integer.MIN_VALUE;
		for (int i : arr) {

			if (i > h) {
				h = i;
			}
		}

		for (int j : arr) {
			if (j > h2 && j < h) {
				h2 = j;
			}
		}

		return h2;
	}

}
