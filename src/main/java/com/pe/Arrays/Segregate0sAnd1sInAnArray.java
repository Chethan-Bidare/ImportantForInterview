package com.pe.Arrays;

public class Segregate0sAnd1sInAnArray {

	
	public void segregate(int[] arr) {
		
		int count = 0 ;
		for(int i=0 ; i <arr.length ; i++) {
			if(arr[i] == 0) {
				count++ ;
			}
		}
		
		for(int i=0 ; i<count ; i++) {
			arr[i]=0 ;
		}
		
		for(int i=count ; i<arr.length ; i++) {
			arr[i]=1 ;
		}
		
		
		for(int i=0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) {
		Segregate0sAnd1sInAnArray sa = new Segregate0sAnd1sInAnArray();
		int[] arr = {1,0,0,1,1,1,0,1,0,1,1,1,1,1,0};
		sa.segregate(arr);
	}
}
