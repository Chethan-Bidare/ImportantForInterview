package com.pe.Logical;

public class FindMiddleIndexWhereRightSumIsEqualToLeftSum {

	public void getIndex(int[] arr) {
		int startIndex = 0 ;
		int endIndex = arr.length -1 ;
		int leftSum = 0 ;
		int rightSum = 0 ;
		int index = 0 ;
		
		while(true) {
			if(leftSum < rightSum) {
				leftSum +=arr[startIndex++];
				index = index + 1 ;
				
			}
			else {
				rightSum += arr[endIndex--];
				
			}
			if(startIndex > endIndex) {
				if( leftSum == rightSum ) {
					System.out.println(index);
					break ;
				}
				else {
					System.out.println("invalid array");
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		FindMiddleIndexWhereRightSumIsEqualToLeftSum fm = new FindMiddleIndexWhereRightSumIsEqualToLeftSum();
		int[] arr = {1,2,3,4,2,0} ;
		fm.getIndex(arr);
	}
}
