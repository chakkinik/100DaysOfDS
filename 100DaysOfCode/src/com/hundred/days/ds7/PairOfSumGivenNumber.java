package com.hundred.days.ds7;
/*
 *  Find all pairs of elements 
 *  from an array whose sum is equal to given number
 * 
 * 
 */

public class PairOfSumGivenNumber {
	public static void main(String[] args) {
		int array[]={ -40, -5, 1, 3, 6, 7, 8, 20 };
		//Pair of elements whose sum is equal to 15:  7, 8 and -5, 20
		
		int k=15;
		
		int i=0;
		int j=array.length-1;
		
		while(i<j) {
			
			int sum=array[i]+array[j];
			
			if(sum==k) {
				System.out.println("=="+array[i]+"=="+array[j]);
			}
			
			if(sum>k) {
				j--;
			} else {
				i++;
			}
			
		}
		
	}

}
