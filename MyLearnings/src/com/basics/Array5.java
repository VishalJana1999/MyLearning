package com.basics;

public class Array5 {
	public static int maxArray(int[] a) {
		int[] b = {a[0],a[a.length/2],a[a.length-1]};
		int highest = b[0];
		if(a.length%2!=0) {	
			for(int i = 0; i<b.length; i++) {
				if(b[i]>=highest) {
					highest=b[i];
				}
			}
			
		}
		return highest;
	}
	public static int[] maxEnd3(int[] b) {
		int highest = 0;
		for(int i = 0; i<b.length; i++) {
			for(int j = 1; j<b.length; j++) {
				if (b[i]>b[j]) {
					highest = b[i];
				}
			}
		}
		
		int[] s = new int[b.length];
		for(int k = 0; k<b.length; k++) {
			s[k] = highest;
		}
		return s;
	}
	
	
	public static int[] maxEnd32(int[] b) {
		int highest = 0;
		if (b[0]>b[b.length-1]) {
			highest = b[0];
		}
		else {
			highest = b[b.length-1];
		}
		
		int[] s = new int[b.length];
		for(int k = 0; k<b.length; k++) {
			s[k] = highest;
		}
		return s;
	}
	
	public static void main(String[] args) {
		int d = maxArray(new int[] {5, 3, 2});
		System.out.print(d);
//		int[] t = maxEnd32(new int[] {1,2,3,4,44});
//		for(int i = 0; i<d.length;i++) {
//			System.out.println(d[i]);
//		}
			
	}
}
