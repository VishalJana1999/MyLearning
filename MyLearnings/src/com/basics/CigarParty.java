package com.basics;

public class CigarParty {
	static boolean b;
	public boolean cigarParty(int a, boolean isWeekend){
		if (isWeekend) {
			if(a>=40 && a<=60 || a>60) {
				b=true;
			}
			else {
				b=false;
			}
		}
		else {
			if(a<40) {
				b=false;
			}
			else {
				b=true;
			}
		}
		return b;
		  
	}

	public static void main(String[] args) {
		CigarParty cp = new CigarParty();
		System.out.println(cp.cigarParty(30, true));
	}

}
