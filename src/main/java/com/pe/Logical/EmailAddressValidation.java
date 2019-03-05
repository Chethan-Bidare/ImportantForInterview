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
}
