package com.pe.Arrays;

public class PrintDistinctElements {

	public void isDistinct(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			boolean isDistinct = true ;
			for(int j=i+1; j<array.length; j++) {
				if(array[i] == array[j]) {
					isDistinct = false ;
					break ;
				}
			}
			if(isDistinct == true) {
				System.out.println("distinct elements : "+array[i]);
			}
		}
	}
	
	public void isDistinct2Arrays(int[] arr1,int[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			boolean isDistinct = true ;
			for(int j=0; j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					isDistinct = false ;
				}
			}
			if(isDistinct==true) {
				System.out.println("unique "+arr1[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		PrintDistinctElements pe = new PrintDistinctElements();
		int[] arr = {1,1,1,1,2,2,2,2,3,4,5,6,7,7,7,7,8,8,8,8,9,9,9,9} ;
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {3,4,5,6,7,8};
		pe.isDistinct(arr);
		pe.isDistinct2Arrays(arr1, arr2);
	}
	
}
