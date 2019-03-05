package com.pe.Strings;

import java.util.HashMap;

public class LongestSubString {

	public int getLongestSubstring(String str) {
		
		char[] ch = str.toCharArray();
		int length = 0;
		HashMap<Character, Integer> chmap = new HashMap<Character, Integer>();
		for(Character chr : ch) {
			if(!chmap.containsKey(chr)) {
				chmap.put(chr, 1);
			}
			else {
				length = Math.max(length, chmap.size());
				chmap.clear();
			}
		}
		return length ;
	}
	
	public static void main(String[] args) {
		LongestSubString ls = new LongestSubString();
		String str = "chethan bidare";
		System.out.println(ls.getLongestSubstring(str));
	}
}
