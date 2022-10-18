package com.basics;

public class DoWhileLoop {

	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.print(i+" ");
			i++;
			if (i<10) {
				System.out.print(",");
			}
		} while (i<10);
	}

}
