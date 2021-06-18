package com.hundred.days.ds10;

/*
 *  N=6 and k=2
If Arr[] = {1, 2, 3, 4, 5, 6} and k=2
then rotated array will be  {5, 6, 1, 2,  3,  4}
 * 
 */

public class RotateArrayByKposition {

	public static void longApproach(int[] arr, int k) {
		int[] temp = new int[k];
		int j = 0;
		for (int i = arr.length - k; i < arr.length; i++) {
			temp[j++] = arr[i];
		}

		for (int m = arr.length - k - 1, n = arr.length - 1; m >= 0; m--, n--) {
			arr[n] = arr[m];
		}

		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}

		for (int i : arr) {
			System.out.print(i);
		}
	}
	
	public static void optimiseApproach(int[] arr, int k) {
		/*
		 *  swap(n-2, n)
		 *  swap(n-1,n-1-2)
		 *  { 1, 2, 3, 4, 5, 6 }
		 *   
		 */
		
		for(int n=arr.length-1; n>0; n-- ) {
			
			if(n-2>0) {
				//swap
				int temp=arr[n];
				arr[n]=arr[n-2];
				arr[n-2]=temp;
			}
		}
		
		for(int i:arr) {
			System.out.print(i);
		}
		
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int k = 2;
		longApproach(arr, k);

	}

}
