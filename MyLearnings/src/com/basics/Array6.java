package com.basics;

public class Array6 {
	public int[] frontPiece(int[] a) {
		int[] b = new int[2];
		if(a.length>1) {
			b[0] = a[0];
			b[1] = a[1];
		}
		else {
			b = a;
		}
		return b;
	}
	public static void main(String[] args) {
		
	}

}
