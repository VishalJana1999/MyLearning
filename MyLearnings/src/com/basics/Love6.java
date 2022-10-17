package com.basics;

public class Love6 {
	public boolean love6(int a, int b) {
		boolean c = false;
		if (a==6 || b==6) {
			c = true;
		}
		else if (a+b==6) {
			c = true;
		}
		else if (Math.abs(a-b)==6) {
			c = true;
			
		}
		else {
			c = false;
		}
		return c;
		  
	}
	public static void main(String[] args) {
		Love6 l6 = new Love6();
		System.out.println(l6.love6(10, 16));
	}

}
