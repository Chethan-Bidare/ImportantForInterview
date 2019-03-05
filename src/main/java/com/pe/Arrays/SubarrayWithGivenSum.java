package com.pe.Arrays;

public class SubarrayWithGivenSum {

	
	public void getSubArrayWithGivenSum(int[] arr, int targetSum) {
		
		int start = 0 ;
		int end = 0;
		int currentSum = 0 ;
		
		while(start < arr.length && end <= arr.length) {
			if(currentSum == targetSum) {
				System.out.println("Starting Index " + start + "," + "Ending Index " + (end-1));
				
				if(end<=arr.length-1) {
					currentSum+=arr[end] ;
				}
				end++ ;
			}
			
			else {
				if(currentSum > targetSum) {
					currentSum-=arr[start];
					start++ ;
				}
				else {
					if(end<=arr.length-1) {
						currentSum+=arr[end] ;
					}
					end++ ;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		SubarrayWithGivenSum sgs = new SubarrayWithGivenSum();
		int[] arr= {1,2,3,4,5,6,3,3,9};
		sgs.getSubArrayWithGivenSum(arr, 6);
	}
	
	public void getSubArray(int[] arr , int targetSum) {
		int start = 0, end = 0 ;
		int currentSum = 0 ;
		
		
		while(start < arr.length && end <= arr.length) {
			if(currentSum == targetSum) {
				System.out.println("Starting index " + start + "," + " ending index "+end);
				
				
				if(end <=arr.length-1) {
					currentSum+=arr[end];
				}
				end++ ;
			}
			else {
				if(currentSum > targetSum) {
					currentSum-=arr[start];
					start ++ ;
				}
				else {
					if(end<=arr.length-1) {
						currentSum+=arr[end];
					}
					end++ ;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
