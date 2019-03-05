package com.pe.Arrays;

public class PrintCommonElements {

	/*
	 * prints commons elements for Single Array
	 */
	
	public void printDuplicate(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			boolean isDuplicate = false ;
			for(int j=0 ; j<i; j++) {
				if(arr[i] == arr[j]) {
					isDuplicate = true ;
					break ;
				}
			}
			if(isDuplicate == true) {
				System.out.println("duplicate element : "+arr[i]);
			}
		}
	}
	
	/*
	 * prints commons elements for 2 Array
	 */
	
	public void printDuplicateFor2Arrays(int[] arr1, int[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			boolean isCommon = false ;
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					isCommon = true ;
					break ;
				}
				
			}
			if(isCommon == true) {
				System.out.println("common element : "+arr1[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		PrintCommonElements pe = new PrintCommonElements();
		int[] arr = {2,2,2,2,3,3,4,4,4,5,6,7};
		int[] arr2 = {2,3,4,8,9} ;
		pe.printDuplicate(arr);
		pe.printDuplicateFor2Arrays(arr, arr2);
	}
}
