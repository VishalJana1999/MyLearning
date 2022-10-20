package com.basics;

import java.util.Scanner;

public class Array {
	public static void getArrayElements(int a[]) {
//		for(int i=0; i<a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
		for(int n: a) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		try (Scanner sc = new Scanner(System.in)) {
			int c = sc.nextInt();
			int a[] = new int[c];
			for(int i=0; i<c; i++) {
				System.out.println("Enter the element => "+ (i+1));
				a[i] = sc.nextInt();
			}
			getArrayElements(a);
		}
		
	}
}
