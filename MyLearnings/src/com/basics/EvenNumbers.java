package com.basics;

public class EvenNumbers {
	
	public static void main(String[] args) {
		String space = "  ";
		for (int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--)
			{
				System.out.print("* ");
			}
			System.out.println("");
			System.out.print(space);
			space = space + "  ";
		}
	}

}
