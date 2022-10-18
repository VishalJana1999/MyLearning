package com.basics;

import java.util.ArrayList;
import java.util.List;

public class OddWhileLoop {
	
	public static List<Integer> getFactors(int num) {
		List<Integer> l1 = new ArrayList<Integer>();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				l1.add(i);
			}
		}
		return l1;
	}

	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		while(i<=10) {
			List<Integer> l1 = getFactors(i);
			if(l1.size()>2) {
				System.out.print(i+ " ");
				count++;
			}
			i++;
		}
		System.out.println();
		System.out.println(count);
		
	}

}
