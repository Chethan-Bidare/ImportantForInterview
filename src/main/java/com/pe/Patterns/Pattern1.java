package com.pe.Patterns;

public class Pattern1 {
/*
	*
	* *
	* * *
	* * * *
	* * * * *
	
	*/
	
	public void printPattern1() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/*
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	
	*/
	
	public void pattern2() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	/*
	1
	2 2
	3 3 3
	4 4 4 4 
	5 5 5 5 5
	
	*/
	
	public void pattern3() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	/*
	   *
	 * * *
	* * * *
   * * * * *
   
   */
   
	public void pattern4() {
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern1 p = new Pattern1();
		p.printPattern1();
		p.pattern2();
		p.pattern3();
		p.pattern4();
	}
}
