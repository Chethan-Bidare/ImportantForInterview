package com.pe.Logical;

public class ArmstrongNumber {

	public void isArmstrongNumber(int num) {
		
		int remainder ;
		int result = 0 ;
		int temp = num ;
		while (temp != 0) {
			remainder = temp % 10 ;
			result += Math.pow(remainder, 3);
			temp = temp / 10 ;
		}
		
		if(result == num)
			System.out.println("it is armstrong number");
		else
			System.out.println("not armstrong");
	}
	
	
	public static void main(String[] args) {
		ArmstrongNumber an = new ArmstrongNumber();
		an.isArmstrongNumber(371);
		System.out.println(an.isPalindrome("abba"));
		System.out.println(an.isPalindrome("bidare"));
		System.out.println(an.isPalindrome(222));
		System.out.println(an.isPalindrome(334));
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
}
