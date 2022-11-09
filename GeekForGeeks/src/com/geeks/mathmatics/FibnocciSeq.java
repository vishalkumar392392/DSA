package com.geeks.mathmatics;

public class FibnocciSeq {

	public static void main(String[] args) {

		fibnocciSeq(15);
	}

	public static void fibnocciSeq(int limit) {

		int a = 0;
		int b = 1;
		
		System.out.print(a + " ");
		System.out.print(b + " ");

		for (int i = 2; i < limit; i++) {
			
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}
	}

}
