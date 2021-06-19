package com.hundred.days.ds11;

public class MaxSubArray {
	
public static int maxSubArray(int[] nums) {
        
	 int maxVal=Integer.MIN_VALUE;
     int curVal=Integer.MIN_VALUE;
     for(int i:nums){
         if(curVal<0){
             curVal=i;
         } else {
           curVal +=i;

         }
         if(maxVal<curVal){
             maxVal=curVal;
         }
     }
     
     return maxVal;
     
 }
public static void main(String[] args) {
	int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
	System.out.println(maxSubArray(nums));
	
} 


}
