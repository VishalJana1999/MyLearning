package com.basics;

public class CtrlStmts {
	static int a = 40;
	public static void main(String[] args) {
		if(a<=100 && a>0) {
			
			if(a<10) {
				System.out.println("Childhood");
			}
			else if(a>=10 && a<=25) {
				System.out.println("Teen age");
			}
			else if(a>25 && a<=50) {
				System.out.println("Adult age");
			}
			else {
				System.out.println("Senior citizen");
			}
		}
		else {
			System.out.println("Enter the correct age");
		}
	}
}
