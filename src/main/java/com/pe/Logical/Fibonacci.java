package com.pe.Logical;

public class Fibonacci {

	public void getFibonacciNumbers(int num) {
		int fib0 = 0 ;
		int fib1 = 1 ;
		
		
		System.out.println(fib0);
		System.out.println(fib1);
		for(int i=0; i<num ; i++) {
			int fib2 = fib1 + fib0 ;
			fib0 = fib1 ;
			fib1 = fib2 ;
			
			System.out.println(fib2);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fb = new Fibonacci();
		fb.getFibonacciNumbers(5);
	}
}
