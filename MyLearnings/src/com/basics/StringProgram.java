package com.basics;

public class StringProgram {
	
	public static String helloName(String name) {
		String a = "";
		a = a.concat("Hello " + name + "!");
		return a;
	}

	public static void main(String[] args) {
		
//		1: declaring a variable and assigning
		String result = helloName("Vittu");
		System.out.println(result);
		
		
//		2. Directly printing the value which the calling method returns 
//		System.out.println(helloName("vittu"));
		
	}

}
