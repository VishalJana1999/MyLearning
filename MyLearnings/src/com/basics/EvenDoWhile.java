package com.basics;

public class EvenDoWhile {

	public static void main(String[] args) {
		int i = 0;
		do {
			if(i%2==0){
				System.out.print(i);
				if(i<8) {
					System.out.print(",");
				}
			}
			i++;
		}while(i<10);
	}

}
