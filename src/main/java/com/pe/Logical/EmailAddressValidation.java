package com.pe.Logical;

import java.util.Scanner;

public class EmailAddressValidation {

	public void validateEmail(String emailID) {
		
		if(emailID.matches("[a-z0-9.!_]{1,100}[@]{1}[a-z0-9]{1,100}[.]{1}[a-z]{1,10}")) {
			System.out.println("valid email ID");
		}
		else {
			System.out.println("invalid email ID");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter email ID : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		EmailAddressValidation eav = new EmailAddressValidation();
		eav.validateEmail(str);
		
	}
	
	
	public void getMiddleIndex(int[] arr) {
		int startIndex = 0;
		int endIndex = arr.length -1 ;
		int leftSum = 0 ;
		int rightSum = 0 ;
		int index = 0 ;
		
		while(true) {
			if(leftSum < rightSum) {
				leftSum += arr[startIndex++];
				index ++ ;
			}
			else
				rightSum += arr[endIndex--];
			
			if(startIndex > endIndex) {
				if(leftSum == rightSum) {
					System.out.println(index);
					System.out.println(" Valid Array : left sum and right sum are equal");
					break ;
				}
				else
					System.out.println("invalid array");
				
			}
		}
		
	}
}
