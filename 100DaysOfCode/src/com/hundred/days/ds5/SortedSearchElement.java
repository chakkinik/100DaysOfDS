package com.hundred.days.ds5;

public class SortedSearchElement {

	public static void main(String[] args) {
		int arr[] = { 10, 16, 19, 21, 25, 3, 5, 8 };

		boolean findElement = SortedSearchElement.findElement(arr, arr.length - 1, 0, 22);
		System.out.println(findElement);
	}

	private static boolean findElement(int[] arr, int high, int low, int e) {
		
		while(low<high) {
			
			int mid= (low+high)/2;
			
			if(arr[mid]==e) {
				return true;
			}
			
			if(arr[mid]>arr[high]) {
				
				if(e>arr[mid]) {
					low=mid+1;
				}
				
				
			}
			
		}
		
		return false;
	}

}
