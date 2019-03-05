package com.pe.Arrays;

/*
 * Print all the leaders in the array
 * An element is leader if it is greater than all the elements to its right side. 
 * And the rightmost element is always a leader. 
 * For example array {6, 7, 4, 3, 5, 2}, leaders are 7, 5 and 2.
 */

public class LeaderInAnArray {

	
	public void findLeader(int[] arr) {
		//int highestOnRight = 0 ;
	
		for(int i=0; i<arr.length; i++) {
			int j ;
			for( j=i+1; j<arr.length; j++) {
				if(arr[i]<=arr[j]) {
					break ;
				}
			}
			if(j==arr.length) {
				System.out.println(arr[i]);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		LeaderInAnArray la = new LeaderInAnArray();
		int[] arr = {6,7,3,5,2};
		la.getLeaders(arr);
	}
	
	
	
	public void getLeaders(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int j ;
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					break ;
				}
			}
			if(j== arr.length) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
