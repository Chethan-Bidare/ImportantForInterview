package com.pe.Strings;

import java.util.HashMap;

public class DistinctCharactersInString {

	public void getDistinctCharacters(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> chmap = new HashMap<Character, Integer>();
		for(Character chr : ch) {
			if(chmap.containsKey(chr)) {
				chmap.put(chr, chmap.get(chr)+1);
			}
			else {
				chmap.put(chr, 1);
			}
		}
		for (Character chr : ch) {
			if (chmap.get(chr) == 1) {
				System.out.println("distinct characters : " +chr);
			} 
		}
	}
	
	public static void main(String[] args) {
		DistinctCharactersInString ds = new DistinctCharactersInString();
		String str = "chethanBidare" ;
		ds.getDistinctCharacters(str);
	}
}
