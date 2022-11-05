package com.alo.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
	
	public static void main(String[] args) {
		
		String str = "abcaabbc";
		
		Set<Character> hs = new HashSet<Character>();
		
		for(int i=0; i<str.length();i++)
		{
			hs.add(str.charAt(i));
		}	
		for(Object b:hs) {
			System.out.print(b+" ");
		}
	}
}
