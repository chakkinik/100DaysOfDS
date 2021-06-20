package com.hundred.days.ds12;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	
	
	public static void buildPowerSet(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		
		for(int i:arr) {
		   int n = result.size();
			for(int j=0; j<n; ++j) {
				ArrayList<Integer> list = new ArrayList(result.get(j));
				list.add(i);				
				//System.out.println(list);

				
				result.add(list);
			}
		}
		
		System.out.println(result);
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		buildPowerSet(arr);
		
		
	}
	
static {
	ArrayList<Integer> list = new ArrayList();
	list.add(1);
	list.add(2);
	ArrayList<Integer> list1 = new ArrayList(list);
	
	list1.add(4);
	
	System.out.println(list1);
	
}
	

}
