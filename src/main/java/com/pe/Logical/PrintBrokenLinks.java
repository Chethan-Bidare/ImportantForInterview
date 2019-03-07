
package com.pe.Logical;

public class PrintBrokenLinks {
	
	public void tryCatch() {
	
		try {
			
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		PrintBrokenLinks p = new PrintBrokenLinks();
		//System.out.println(p.tryCatch());
		p.tryCatch();
	}
}
