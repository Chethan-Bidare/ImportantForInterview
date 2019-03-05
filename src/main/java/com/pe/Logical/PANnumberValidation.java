package com.pe.Logical;

public class PANnumberValidation {

	public void panNumber(String str) {
		if(str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid pan number ");
			
		}
		else
			System.out.println("Invalid Pan number");
	}
}
