package com.pe.Logical;

public class Factorial {

	public int getFactorial(int num) {
		
		if(num == 0)
			return 1 ;
		
		return num * getFactorial(num - 1); 
	}
	
	public int getfact(int num) {
		int result = 1 ;
		while(num != 0) {
			result = result * num ;
			num -- ;
		}
		return result ;
	}
	
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.println(f.getFactorial(5));
		System.out.println(f.getfact(5));
		int[] array = {1,2,2,2,2,3};
		f.removeDuplicatesFromArray(array);
	}
	
	
	public void removeDuplicatesFromArray(int[] array) {
		int[] nonDuplictaeArray = new int[array.length];
		for(int i=0; i< array.length; i++) {
			boolean isDistinct = true ;
			for(int j= i+1; j<array.length; j++) {
				if(array[i] == array[j]) {
					isDistinct = false ;
					break ;
				}
			}
			if(isDistinct == true) {
				System.out.println(array[i]);
				nonDuplictaeArray[i] = array[i];
			}
		}
		
		for(int i=0 ; i< nonDuplictaeArray.length; i++) {
			System.out.println(nonDuplictaeArray[i]);
		}
	}
}
