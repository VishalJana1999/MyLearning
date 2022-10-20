package com.basics;

public class Array3 {
	public static int[] makeLast(int[] a) {
		int[] result = new int[a.length*2];
		for(int i = 0; i<result.length-1; i++) {
			result[i]=0;
			
		}
		result[result.length-1] = a[a.length-1];
		return result;
		  
	}
	public static void main(String[] args) {
		int[] res = makeLast(new int[] {1,2,3,4,5});
		for(int i=0; i<res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
