package com.hundred.days.ds9;

public class SubArrayWithGivenSumForUnsortedArray {

	public static void findSubArray(int[] arr, int k) {
		int start = 0;
		int end = 0;
		int l = arr.length - 1;
		int curr_sum = 0;

		while (start <= l && end <= l) {
			curr_sum += arr[end];

			if (curr_sum > k) {
				curr_sum -= arr[start++];
			}
			if (curr_sum == k) {
				System.out.println("s->" + start + "e-->" + end);
			}
			end++;

		}

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 4, 9, 0, 11 };
		int target = 9;
		findSubArray(arr, target);
	}

}
