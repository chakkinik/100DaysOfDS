package com.hundred.days.ds10;

public class BuySellStockMaxProfit {
	
	public static void main(String[] args) {
		int arr[]={14, 12, 70, 15, 99, 65, 21, 90};
		
		int bp=arr[0];
		int profit=0;
		int buyDay=0;
		int sellDay=0;
		for(int i=1; i<arr.length; i++) {
			int sp=arr[i]-bp;
			if(sp>profit) {
				sellDay=i;
				profit=sp;
			}
			if(bp>arr[i]) {
				buyDay=i;
				bp=arr[i];
			}
			
		}
		
		System.out.println("==profit-->  "+profit+" buyday==>  "+buyDay+" sellDay==> "+sellDay);
	}

}
