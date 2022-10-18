package com.basics;

public class WhileLoop {
	public static void main(String[] args) {
		int i = 0;
		while (i<10){
			System.out.print(i);
			if(i!=9) {
				System.out.print(",");
			}
			i++;
		}
	}

}
