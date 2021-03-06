package com.pe.Strings;

import java.util.HashMap;
import java.util.Set;

public class CompressString {

	public String bid = "bidare " ;
	public void doCompress(String str) {
		char[] chr = str.toCharArray();
		
		HashMap<Character,Integer> chmap = new HashMap<Character, Integer>();
		for(Character ch : chr) {
			
			if(chmap.containsKey(ch)) {
				chmap.put(ch, chmap.get(ch)+1);
			}
			else {
				chmap.put(ch, 1);
			}
			
		}
		
		Set<Character> keySet = chmap.keySet();
		for(Character ch : keySet) {
			System.out.println(""+ch+chmap.get(ch));
		}
	}
	
	
	public static void main(String[] args) {
		CompressString cs = new CompressString();
		String str = "aaaaaaaaaabbbbbbssss" ;
		cs.doCompress(str);
		//cs.bid ;
	}
	
	
	public boolean isAnagram(String str1, String str2) {
		char[] ch = str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		int index=0 ;
		for(Character c : ch) {
			index = sb.indexOf(""+c);
			if(index != -1) {
				sb.deleteCharAt(index);
			}
		}
		
		if(sb.length() == 0)
			return true ;
		else
			return false ;
		
	}
}
