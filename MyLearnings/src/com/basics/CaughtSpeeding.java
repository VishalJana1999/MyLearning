package com.basics;

public class CaughtSpeeding {
	public int caughtSpeeding(int a, boolean isBirthday) {
		int c = 0;
		if (isBirthday) {
			if (a<=65) {
				c = 0;
			}
			else if (a>65 && a<=85) {
				c = 1;
			}
			else if (a>85) {
				c = 2;
			}
		}
		else {
			if (a<=60) {
				c = 0;
			}
			else if (a>60 && a<=80) {
				c = 1;
			}
			else if (a>80) {
				c = 2;
			}
		}
		return c;
		  
	}
	public static void main(String[] args) {
		CaughtSpeeding cs = new CaughtSpeeding();
		System.out.println(cs.caughtSpeeding(65, false));
	}

}
