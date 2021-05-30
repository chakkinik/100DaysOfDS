package com.hundred.days.ds4;

public class MissingNumber {

	
	public static int missingNumber(int[] arr) {
		int total_val=0;
		int  max=Integer.MIN_VALUE;
		for(int i:arr) {
			total_val +=i;
			if(max<i) {
				max=i;
			}
		}
		
		int totalSum= (max *(max+1))/2;
		
		int result =totalSum-total_val;
		
		
		
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr1={5,3,1,2};
		int missingNumber = missingNumber(arr1);
		
		System.out.println(missingNumber);

	}
}
