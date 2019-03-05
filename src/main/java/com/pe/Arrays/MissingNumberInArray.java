package com.pe.Arrays;



public class MissingNumberInArray {

	public void findMissingNumInArray(int[] arr) {
		
		int sum = 0 ;
		
		for(int i : arr) {
			sum += i ;
		}
		System.out.println(sum);
		
		int total = ((arr.length + 1) * (arr.length + 2))/2;
		System.out.println(total);
		System.out.println(" missing integer : "+( total-sum));
	}
	
	public static void main(String[] args) {
		MissingNumberInArray ma = new MissingNumberInArray();
		int[] arr= {1,2,3,4,5,6,8,9,10} ;
		ma.findMissingNumInArray(arr);
	}
}
