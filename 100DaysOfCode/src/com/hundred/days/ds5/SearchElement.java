package com.hundred.days.ds5;

public class SearchElement {

	// binary search

	public static boolean findElement(int[] arr, int high, int low, int e) {

		
		
		
		if (low < high) {

			int mid = (high + low) / 2;
			
			if(e==arr[mid]) {
				return true;
			}
			
			if (e > arr[mid]  ) {

				return findElement(arr, high, mid + 1, e);
			} else if (e < arr[mid]) {
				return findElement(arr, mid, low, e);
			} 

		}

		return false;
	}
	
	
	public boolean isArraySorted(int[] arr,  int low, int high) {
		
		return (arr[low]<arr[high])?
			 true:false;
	}

	public static void main(String[] args) {
		int arr[] = {  3, 5, 8, 10, 16, 19, 21, 25 };
		
		boolean findElement = SearchElement.findElement(arr, arr.length-1, 0, 22);
		System.out.println(findElement);
	}

}
