package com.pe.Arrays;

public class GetPairsBasedOnCondition {

	
	/*
	 * condition  A=2A   (A,2A)
	 * 
	 */
	
	public void getPairs(int[] arr) {
		
		for(int i=0 ; i< arr.length ; i++) {
			
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[j] == (2 * arr[i])) {
					System.out.println("Pairs : "+arr[i]+","+arr[j]);
					//break ;
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10} ;
		GetPairsBasedOnCondition codeCheck = new GetPairsBasedOnCondition();
		codeCheck.getPairs(arr);
		
	}
}
