package com.pack1;

public class AccessModifiers {
//	What are the members of class
//	1. variables and 2. methods
//	Variables are 2 types
//	1. class variable
//	2. method variable
	
	public long i = 109897l;
	
//	private long i = 109897l;
//	protected long i = 109897l;
//	long i = 109897l;
	
	public static void main(String[] args) {
		
		AccessModifiers a1 = new AccessModifiers();
		float b = a1.i;
		System.out.println(b);
	}
}
