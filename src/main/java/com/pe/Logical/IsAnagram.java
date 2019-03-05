package com.pe.Logical;

public class IsAnagram {

	public boolean isAnagram(String str1, String str2) {
		char[] ch = str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		
		for(Character c : ch) {
			int index = sb.indexOf(""+c);
			
			if(index != -1) {
				sb.deleteCharAt(index);
			}
		}
		
		if(sb.length() == 0) {
			return true ;
		}
		else {
			return false ;
		}
		
	}
	
	public static void main(String[] args) {
		String s1 = "chethan" ;
		String s2 = "thanche" ;
		IsAnagram ia = new IsAnagram();
		System.out.println(ia.isAnagram(s1, s2));
	}
}
