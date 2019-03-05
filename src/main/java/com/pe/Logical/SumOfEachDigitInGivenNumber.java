package com.pe.Logical;

public class SumOfEachDigitInGivenNumber {

	public void getSum(int num) {
		int sum = 0 ;
		
		while(num != 0) {
			sum += num % 10 ;
			num = num / 10 ;
		}
		System.out.println("sum of digits : "+sum);
	}
	
	public static void main(String[] args) {
		SumOfEachDigitInGivenNumber sd = new SumOfEachDigitInGivenNumber();
		sd.getSum(345);
	}
}
