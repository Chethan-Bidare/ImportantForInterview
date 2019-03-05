package com.pe.Strings;

import java.util.Stack;

public class ParenthesisChecker {

	public String isBalanced(String str) {
		String openParenthesis = "[({" ;
		String closeParenthesis = "})]" ;
		
		Stack<Character> st = new Stack<Character>();
		
		for(Character ch : str.toCharArray()) {
			if(openParenthesis.indexOf(ch) != -1) {
				st.push(ch);
			}
			else {
				int index = closeParenthesis.indexOf(ch);
				if(index != -1 && st.isEmpty() && index == openParenthesis.indexOf(st.peek()))
					st.pop();
				else
					st.push(ch);
			}
		}
		
		return st.isEmpty()? "Balanced" : "Not Balanced" ;
	}
	
	public static void main(String[] args) {
		ParenthesisChecker pc = new ParenthesisChecker();
		System.out.println(pc.isBalanced("{([])}"));
	}
}
