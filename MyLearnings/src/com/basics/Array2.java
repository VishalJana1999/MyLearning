package com.basics;

public class Array2 {
	public static int[] plusTwo(int[] a, int[] b) {
		  int c[] = new int[a.length+b.length];
		  for(int i = 0; i<a.length; i++) {
			  c[i] = a[i];	  
		  }
		  for(int j = a.length; j<c.length; j++) {
			  c[j] = b[j-b.length];
		  }
		  return c;
	}
	public static void main(String[] args) {
		int a[] = {3,4};
		int b[] = {1,2};
		int c[] = plusTwo(a, b);
//		This is for retriving
		for(int i = 0; i<c.length; i++){
			
			System.out.println(c[i]);
		}
	}

}
