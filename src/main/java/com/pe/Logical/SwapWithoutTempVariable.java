package com.pe.Logical;

public class SwapWithoutTempVariable {

	public void doSwap(int a , int b) {
		a = a + b ;
		b = a - b ;
		a = a - b ;
		System.out.println(" a : "+a);
		System.out.println(" b : "+b);
	}
	
	public static void main(String[] args) {
		SwapWithoutTempVariable stv = new SwapWithoutTempVariable();
		int a = 10, b = 20 ;
		stv.doSwap(a,b);
	}
}
