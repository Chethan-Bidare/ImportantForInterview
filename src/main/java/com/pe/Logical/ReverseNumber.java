package com.pe.Logical;

public class ReverseNumber {

	
	public void doReverse(int n) {
		int reverse = 0 ;
		
		while(n != 0) {
			reverse = (reverse * 10) + (n % 10); 
			n = n / 10 ;
			System.out.println(n);
		}
		
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		ReverseNumber rn = new ReverseNumber();
		rn.doReverse(45);
	}
}
