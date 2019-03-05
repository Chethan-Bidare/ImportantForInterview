package com.pe.Logical;

public class Palindrome {

	public void isPalindrome(int number) {
		boolean isPalindromeNumber = false ;
		int reverse = 0 ;
		while(number != 0) {
			reverse = (reverse * 10) + (number % 10) ;
			number = number / 10 ;
		}
		
		if(reverse == number) {
			isPalindromeNumber = true ;
		}
		
		if(isPalindromeNumber == true) {
			System.out.println(reverse +" is a palindrome");
		}
		else
			System.out.println(reverse + " is not a palindrome");
		
	}
	
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		p.isPalindrome(456);
	}
}
