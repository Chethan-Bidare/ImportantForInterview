package com.pe.Logical;

public class Palindrome {

public boolean isPalindrome(int num) {
		
		int reverse = 0 ;
		int originalNum = num ;
		while(num != 0) {
			reverse = (reverse * 10) + (num % 10) ;
			num = num / 10 ;
		}
		System.out.println(originalNum+","+reverse);
		if (reverse == originalNum)
			return true ;
		else
			return false ;
		
	}
	
	
	public boolean isPalindrome(String str) {
		
		int i=0 ;
		int j = str.length() - 1 ;
		
		while( j > i) {
			if(str.charAt(i) == str.charAt(j)) {
				i++ ;
				j-- ;
			}
			else
				return false ;
		}
		return true ;
	}
	
	
	public void isArmStrongNumber(int num) {
		
		int remainder ;
		int temp = num ;
		int result =0 ;
		while (temp != 0) {
			remainder = temp % 10 ;
			result += Math.pow(remainder, 3);
			temp = temp / 10 ;
		}
		
		if(result == num)
			System.out.println("ARmstrong");
		else
			System.out.println("not armstrong");
	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		/*System.out.println(p.isPalindrome(456));
		String str = "abba" ;
		System.out.println(p.isPalindrome(str));*/
		p.isArmStrongNumber(371);
	}
}
