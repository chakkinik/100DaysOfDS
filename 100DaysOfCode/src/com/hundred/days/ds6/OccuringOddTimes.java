package com.hundred.days.ds6;

/*
 * You are given an array of integers. 
 * All numbers occur even number of times except one. 
 * You need to find the number which occurs an odd number of times.
 *  You need to solve it with o(n) time complexity and o(1) space complexity.
 */
public class OccuringOddTimes {
	public static void main(String[] args) {
		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };
	   findOddTimes(array);
	}

	private static void findOddTimes(int[] array) {
		int result=0;
		for (int i = 0; i < array.length; i++) 
	      {
	       result = result ^ array[i];
	       System.out.println("---"+result);
	      }
		System.out.println("=="+result);
	}

}
