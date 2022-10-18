package com.basics;

import java.util.Scanner;

public class EvenOdd {
	int a;
	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			eo.a = sc.nextInt();
			if (eo.a<=1000 && eo.a>=0) 
			{
				if (eo.a%2==0) {
					System.out.println("The number is Even");
				}
				else {
					System.out.println("The number is Odd");
				}	
			}
			else {
				System.out.println("The number exceeds 1000 or less than 0");
			}
		}
	}

}
