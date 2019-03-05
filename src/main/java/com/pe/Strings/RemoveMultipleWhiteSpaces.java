package com.pe.Strings;

import java.util.StringTokenizer;

public class RemoveMultipleWhiteSpaces {

	public void removeWhiteSpace(String str) {
		
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()).append(" ");
		}
		
		System.out.println("Actual String : "+str);
		System.out.println("Processed String : "+sb.toString().trim());
		
	}
	
	
	public static void main(String[] args) {
		RemoveMultipleWhiteSpaces rm = new RemoveMultipleWhiteSpaces();
		String input = "This       removes      all the     white spaces               " ;
		rm.removeWhiteSpace(input);
	}
}
