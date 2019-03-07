package com.pe.Strings;

public class ReverseWordsInAString {

	public void doReverseWords(String str) {
		String[] temp = str.split(" ");
		/*for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}*/
		
		for(int i=0; i< temp.length; i++) {
			String temp1 = temp[i];
			char[] ch = temp1.toCharArray();
			for(int j=ch.length-1; j>=0 ; j--) {
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ReverseWordsInAString sb = new ReverseWordsInAString();
		String str = "Chethan bengaluru Karnataka India";
		sb.doReverseWords(str);
	}
}
