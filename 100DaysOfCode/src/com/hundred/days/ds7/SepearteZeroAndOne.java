package com.hundred.days.ds7;

/*Given an array of 0’s and 1’s 
 * in random order,
 *  you need to separate 
 *  0’s and 1’s in an array.
 * 
 */

public class SepearteZeroAndOne {
	
	public static void main(String[] args) {
		int arr[] = {0,1,0,0,1,1,1,0,1};
		
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			
			if(arr[i]==0 && arr[j]==1) {
				i++; j--;
			} else if(arr[i]!=0 && arr[j]!=1) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			} else if(arr[i]!=0 && arr[j]==1) {
				j--;
			} else if(arr[i]==0 && arr[j]!=1) {
				i++;
			}
				
			
		}
		
		for(int k:arr) {
			System.out.println(k);
		}
	}

}
