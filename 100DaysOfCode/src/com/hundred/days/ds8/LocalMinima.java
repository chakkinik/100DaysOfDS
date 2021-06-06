package com.hundred.days.ds8;

public class LocalMinima {

	public static void main(String[] args) {

		int[] arr = { 23, 8, 15, 2, 3 }; // {9, 6, 3, 14, 5, 7, 4};

		int x = localMinUtil(arr, 0, arr.length - 1, arr.length);
		System.out.println(x);
		System.out.println(findLocalMinima(arr));
	}

	private static int findLocalMinima(int[] arr) {

		int result = arr[0];
		for (int i = 1; i < arr.length; i++) {

			int left = arr[i - 1];
			if (i + 1 <= arr.length - 1) {
				int right = arr[i + 1];
				if (arr[i] < left && arr[i] < right) {
					result = arr[i];
					break;
				}
			} else if (arr[i] < left) {
				result = arr[i];
				break;
			}

		}

		return result;
	}

	private static int findLocalMiniamaOnBinarySearch(int[] arr, int low, int high, int n) {

		int mid = low + (high - low) / 2;

		if (mid == 0 || arr[mid - 1] > arr[mid] && mid == n - 1 || arr[mid + 1] > arr[mid]) {
			return arr[mid];
		} else if (mid > 0 && arr[mid - 1] < arr[mid]) {
			return findLocalMiniamaOnBinarySearch(arr, low, mid - 1, n);
		}

		return findLocalMiniamaOnBinarySearch(arr, mid + 1, high, n);
	}

	public static int localMinUtil(int[] arr, int low, int high, int n) {

// Find index of middle element
		int mid = low + (high - low) / 2;

// Compare middle element with its neighbours
// (if neighbours exist)
		if (mid == 0 || arr[mid - 1] > arr[mid] && mid == n - 1 || arr[mid] < arr[mid + 1])
			return mid;

// If middle element is not minima and its left
// neighbour is smaller than it, then left half
// must have a local minima.
		else if (mid > 0 && arr[mid - 1] < arr[mid])
			return localMinUtil(arr, low, mid - 1, n);

// If middle element is not minima and its right
// neighbour is smaller than it, then right half
// must have a local minima.
		return localMinUtil(arr, mid + 1, high, n);
	}

}
