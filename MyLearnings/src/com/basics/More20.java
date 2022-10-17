package com.basics;

public class More20 {
	public boolean more20(int a) {
		boolean b = false;
		if (a%20==1 || a%20==2) {
			b = true;
		}
		else {
			b = false;
		}
		return b;
		  
	}
	public static void main(String[] args) {
		More20 m20 = new More20();
		System.out.println(m20.more20(43));
	}

}
