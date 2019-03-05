package com.pe.Arrays;

public class EquillibriumPoint {

	public void getEquillibriumPoint(int[] arr) {
		
		int startIndex = 0 ;
		int endIndex = arr.length -1;
		int leftSum = 0 ;
		int rightSum = 0 ;
		
		while(true) {
			if(leftSum < rightSum ) {
				leftSum = leftSum + arr[startIndex];
				startIndex ++ ;
						
			}
			else {
				rightSum = rightSum + arr[endIndex];
				endIndex-- ;
			}
			
			if(startIndex > endIndex) {
				if(leftSum==rightSum) {
					System.out.println(startIndex);
					break ;
				}
				else {
				System.out.println("not a valid array");
				break ;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		EquillibriumPoint ep = new EquillibriumPoint();
		int[] arr = {1,2,3,4,5,0} ;
		ep.getEquillibriumPoint(arr);
	}
}
