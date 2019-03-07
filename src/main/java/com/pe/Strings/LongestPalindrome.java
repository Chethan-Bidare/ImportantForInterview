package com.pe.Strings;

public class LongestPalindrome {

	
	public String longestPalindrome(String str) {
		
		int maxPalinLength = 0 ;
		String longestPalindrome = null ;
		int length = str.length() ;
		 
		
		
		for(int i=0 ; i< length ; i++) {
			for(int j=i+1 ; j < length ; j++) {
				int len = j - i ;
				String curr = str.substring(i, j + 1);
				if(isPalindrome(str)) {
					if(len > maxPalinLength) {
						longestPalindrome = curr ;
						maxPalinLength = len ;
					}
				}
			}
		}
		return longestPalindrome ;
	}
	
	
	
	
	public boolean isPalindrome(String str) {
		int i = 0 ;
		int j = str.length() - 1 ;
		
		while(j > i) {
			if(str.charAt(i) == str.charAt(j)) {
				i++ ;
				j-- ;
			}
			else
				return false ;
		}
		return true ;
	}
	
	
	
	public void getFibonacciNumbers(int number) {
		int fib0 = 0 ;
		int fib1 = 1 ;
		System.out.println(fib0);
		System.out.println(fib1);
		
		for(int i=2; i<= number; i++) {
			int fib2 = fib0 + fib1 ;
			fib0 = fib1 ;
			fib1 = fib2 ;
			System.out.println(fib2);
		}
	}
	
	public void isPrimeNumber(int num) {
			boolean isPrimeNum = true ;
		for(int i=2 ; i<= num/2 ; i++) {
			if(num % i == 0) {
				isPrimeNum = false ;
			}
		}
		
		if(isPrimeNum == true) {
			System.out.println(" Prime number");
		}
		else
			System.out.println("Not a prime");
	}
	
	
	public void integerPalindrome(int num) {
		
		int reverse = 0 ;
		while(num != 0) {
			reverse = (reverse * 10 ) + (num % 10) ;
			num = num / 10 ;
		}
		
		if(reverse == num) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
	}
	
	public static void main(String[] args) {
		LongestPalindrome lp = new LongestPalindrome();
		lp.getFibonacciNumbers(5);
		lp.isPrimeNumber(7);
	}
}
