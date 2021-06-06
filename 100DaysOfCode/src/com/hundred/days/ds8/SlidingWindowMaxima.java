package com.hundred.days.ds8;

public class SlidingWindowMaxima {

	// basic

	public static void main(String[] args) {
		int[] arr = { 2, 6, -1, 2, 4, 1, -6, 5 };
		int k = 3;
		// 664445

		findMaximumInSubArray(arr, k);
		int p = arr.length%2;
		if(p==0) {
			
		}
		//buildCompositeArray(arr, com, 0, arr.length, 0);
		

	}

	private static void buildCompositeArray(int[] arr, int[] com, int low, int high, int pos) {

		if (low == high) {
			com[pos] = arr[low];
			return;
		}
		int mid = (high + low) / 2;
		buildCompositeArray(arr, com, 0, mid, 2 * pos + 1);
		buildCompositeArray(arr, com, mid + 1, high, 2 * pos + 2);

		com[pos] = Math.max(com[2 * pos + 1], com[2 * pos + 2]);

	}

	private static void findMaximumInSubArray(int[] arr, int k) {

		int l = 0;
		int loop = 0;
		for (int i = k - 1; i < arr.length; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = l; j <= i; j++) {
				max = Math.max(max, arr[j]);
				System.out.println(loop++);
			}
			l++;
			// System.out.print(max);
			// System.out.println("");

			// timeComplexity 0(n*k)
			// O(n) (logk)
		}

	}

}
