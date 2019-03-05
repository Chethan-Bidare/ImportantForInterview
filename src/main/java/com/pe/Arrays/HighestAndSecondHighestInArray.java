package com.pe.Arrays;

public class HighestAndSecondHighestInArray {

	
	public void getHighest(int[] array) {
		int highest = 0 ;
		int secondHighest = 0 ;
		
		for(int i=0; i<array.length; i++) {
			if(highest < array[i]) {
				secondHighest = highest ;
				highest = array[i];
			}
			else if(secondHighest < array[i]) {
				secondHighest = array[i];
			}
		}
		
		System.out.println("highest : "+highest);
		System.out.println("second highest : "+secondHighest);
	}
	
	public static void main(String[] args) {
		HighestAndSecondHighestInArray hs = new HighestAndSecondHighestInArray();
		int[] array = {1,2,3,5,8,10,15,25,30};
		hs.getHighest(array);
	}
}
