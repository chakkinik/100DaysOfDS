package com.hundred.days.ds6;

public class NumberOfPlatformRequired {
	
	public static void main(String[] args) {
		int arrival[] = {100, 140, 150, 200, 215, 400}; 
		int depature[] = {110, 300, 220, 230, 315, 600};
		
		System.out.println(findPlatform(arrival,depature));
	}

	private static int findPlatform(int[] arrival, int[] depature) {
		// TODO Auto-generated method stub
		
		int  p=0;
		int maxP=0;
		int i=0; int j=0;
		
		while(i<arrival.length && j<depature.length) {
			if(arrival[i]<=depature[j]) {
				p++;
				i++;
			} else if(arrival[i]>depature[j]) {
				//p--;
				j++;
				p=0;
			}
			if(p>maxP) {
				maxP=p;
			}
			
		
			
		}
		
		return maxP;
	}

}
