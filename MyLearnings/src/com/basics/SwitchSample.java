package com.basics;

import java.util.Scanner;

public class SwitchSample {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the case number");
			int a = sc.nextInt();
			switch(a) {
			case 1: System.out.println("This is case 1");
			break;
			case 2: System.out.println("This is case 2");
			break;
			case 3: System.out.println("This is case 3");
			break;
			default : System.out.println("This is not a valid case");
			}
		}
	}
}
