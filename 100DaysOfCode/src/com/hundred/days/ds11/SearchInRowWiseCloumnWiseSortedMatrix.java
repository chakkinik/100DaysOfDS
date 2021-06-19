package com.hundred.days.ds11;

public class SearchInRowWiseCloumnWiseSortedMatrix {
	
	public static void main(String[] args) {
		int[][] sortedMatrix = 
			 { 
			 { 1, 6, 10, 12, 20 }, 
			 { 4, 8, 15, 22, 25 }, 
			 { 5, 20, 35, 37, 40 },
			 { 10, 28, 38, 45, 55 } 
			 };
		
		
		int k=46;
		
		boolean hasValue = isPresent(sortedMatrix, k);
		System.out.println(hasValue);
		
		
		/*
		 *  so algo will  take element at right top
		 *  int begin= sortedMatrix[0][sortedMatrix[0].length-1]
		 * 
		 * 
		 */
		
		
	}
	
	public static boolean isPresent(int[][] sortedMatrix, int k ) {
		
		int m=0;
		int n=sortedMatrix[0].length-1;
		//int begin = sortedMatrix[m][n];
		
	    while(m<=sortedMatrix.length-1 && n>=0) {
	    	//System.out.println("==m==>"+m+"==n=="+n);
	    	if(sortedMatrix[m][n]==k) {
	    		return true;
	    	}
	    	if(sortedMatrix[m][n]<k) {
	    		m=m+1;
	    	} else {
	    	if(sortedMatrix[m][n]>k) {
	    		n=n-1;
	    	}
	    	}
	    }
		
		
		return false;
	}

}
