package com.basics;

public class Array1 {
	public static boolean firstLast6(int[] a) {
		if (a[0]==6 || a[a.length-1]==6) 
			
			return true;
		else 
			return false;
		
		  
	}
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		System.out.println(firstLast6(a));
	}

}
