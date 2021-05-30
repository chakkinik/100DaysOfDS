package com.hundred.days.ds4;

public class SmallestAndLargestInArray {

	static int min = Integer.MAX_VALUE;

	static int max = Integer.MIN_VALUE;

	public static int smallest(int[] arr) {

		for (int i : arr) {
			if (min > i) {
				min = i;
			}
		}

		return min;

	}

	public static int higest(int[] arr) {

		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}

		return max;

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 12, 56, 76, 89, 100, 343, 21, 234 };

		int s=smallest(arr);
		
		int h =higest(arr);
		
		System.out.println("min==>"+s+"max==>"+h);

	}

}
