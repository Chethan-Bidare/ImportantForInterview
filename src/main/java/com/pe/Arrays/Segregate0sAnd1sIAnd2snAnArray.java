package com.pe.Arrays;

public class Segregate0sAnd1sIAnd2snAnArray {

	
	public void segregate(int[] arr) {
		int countOf_0 = 0 ;
		int countOf_1 = 0 ;
		for(int i : arr) {
			if(i==0) {
				countOf_0 ++ ;
			}
			else if(i==1) {
				countOf_1 ++ ;
			}
		}
		
		System.out.println(countOf_0);
		System.out.println(countOf_1);
		
		for(int i=0 ; i< countOf_0; i++) {
			arr[i]=0 ;
		}
		
		for(int i=countOf_0 ; i< (countOf_0 + countOf_1); i++) {
			arr[i]=1 ;
		}
		
		for(int i=(countOf_0 + countOf_1) ; i< arr.length; i++) {
			arr[i]=2 ;
		}
		
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		Segregate0sAnd1sIAnd2snAnArray sa = new Segregate0sAnd1sIAnd2snAnArray();
		{}
		int[] arr = {2,2,0,2,1,1,2,2,2,2,0,2,2,2,0,0,0,2,0,0,0,1,1,1,1} ;
		sa.segregate(arr);
	}
}
