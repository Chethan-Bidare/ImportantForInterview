package com.pe.OopsConcepts;

/* This operator
 * 1. This can be used to refer current class instance variable
 * 2. This can be used to invoke current class method
 */
public class This {
int a = 10 ;

public void test() {
	System.out.println(a);
}

public void check(int a) {
	this.test();
	 this.a = a ;
	System.out.println(a);
}

public static void main(String[] args) {
	This t = new This();
	t.check(20);
}
}
