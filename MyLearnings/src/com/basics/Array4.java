package com.basics;

public class Array4 {
	public static int[] makeMiddle(int[] a) {
		int[] b = new int[a.length*2];
		for(int i = 0; i<(b.length/2)-1; i++) {
			b[i] = 0;
		}
		for(int j = (b.length/2)+1; j<b.length; j++) {
			b[j] = 0;
		}
		b[(b.length/2)-1] = a[0];
		b[b.length/2] = a[a.length-1];
		return b;
		
	}
	public static void main(String[] args) {
		int[] b = makeMiddle(new int[] {1,2,3,4,5});
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
