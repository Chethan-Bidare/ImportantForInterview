package com.pe.Strings;

public class ReverseString {

	public void doReverse(String str) {
		char[] ch = str.toCharArray();
		for(int i=ch.length-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);
		}
	}
	
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String str = "chethan" ;
		rs.doReverse(str);
	}
}
