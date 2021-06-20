package com.hundred.days.ds12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubStringString {
	
	public static void findSubString(char[] s) {
		
		Set<String> set = new HashSet<>();
		set.add(String.valueOf(s[0]));
		
		for(int j=1; j<s.length;j++) {
			int n=set.size();
			StringBuilder builder = new StringBuilder();
			for(int i=0;i<n;++i) {
				String k = set.get(i);
				builder.append(k).append(s[j]);
				set.add(String.valueOf(s[j]));
				set.add(builder.toString());
			}
		}
		System.out.println(set);

		
	}
	
	public static void main(String[] args) {
		String s="abb";
		//a,b,ab,ba,bb,
		findSubString(s.toCharArray());
		
		
		/*
		 *  
		 * 
		 */
		
		
	}

}
