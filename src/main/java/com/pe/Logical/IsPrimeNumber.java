package com.pe.Logical;

public class IsPrimeNumber {

	
	public void isPrime(int num) {
		
		boolean isPrimeNumber = true ;
		for(int i=2; i<=num/2; i++) {
			
			if(num % i == 0) {
				isPrimeNumber = false ;
				
				
			}
		}
		
		if(isPrimeNumber == true) {
			System.out.println("Given Number is a prime number "+num);
		}
		else
			System.out.println("Given Number is Not a prime number "+num);
	}
	
	public static void main(String[] args) {
		IsPrimeNumber ip = new IsPrimeNumber();
		
		ip.isPrime(9);
	}
}
