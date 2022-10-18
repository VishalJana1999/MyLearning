package com.basics;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		String goAhead = "";
		
		try (Scanner sc = new Scanner(System.in)) {
			do {
			Sample s1 = new Sample();
			System.out.println("---------------------------------------------------------------");
			System.out.println("|1. Addition |2. Substraction |3. Multiplication |4. Division |");
			System.out.println("---------------------------------------------------------------");
			System.out.println("Please select one of the operations");
			int option = sc.nextInt();
			System.out.println("Enter the value of a : ");
			int a = sc.nextInt();
			System.out.println("Enter the value of b : ");
			int b = sc.nextInt();

				switch (option){
				  case 1:
					  System.out.println(s1.addition(a, b));
					  break;
				  case 2:
					  System.out.println(s1.substraction(a, b));
					  break;
				  case 3:
					  System.out.println(s1.multiplication(a, b));
					  break;
				  case 4:
					  System.out.println(s1.division(a, b));
					  break;
				  default:
					  System.out.println("No such operation...");
				} 
				
				System.out.println("Do you want to continue...[y/n] => ");
				goAhead = goAhead + sc.next();
				if(!(goAhead.equalsIgnoreCase("Y") || goAhead.equalsIgnoreCase("YES"))) {
					System.out.println("Exiting...");
				}
			}while(goAhead.equalsIgnoreCase("YES") || goAhead.equalsIgnoreCase("Y"));
		}
		
	}
	
}
