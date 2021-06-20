package com.hundred.days.ds11;

public class ContiguousSubarraySum {
	 public static int subarraySum(int[] nums, int k) {
	        
	        if(nums.length==1 && k==nums[0]){
	           return 1;
	        }  
	        
	        
	        int i=0;
	            int j=1;
	            int m=nums[i];
	        
	        while(i<nums.length && j<nums.length){
	            
	            
	            if(m==k){
	            	System.out.println("==i=>"+i+"=j="+j);
	                return j+1-i;
	            }
	            if(m<k){
	            	m +=nums[j];
	                j++;
	                
	            } else {
	            	m -=nums[i];
	                i++;
	            }
	            
	            
	            
	        }
	         
	        return 0;
	        
	    }
	 
	 public static void main(String[] args) {
		int[] nums = {14, 12, 70, 15, 99, 65, 21, 90};
			int k=97;
			int subarraySum = subarraySum(nums, k);
			
			System.out.println();
	}
}
