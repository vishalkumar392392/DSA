package com.basic.smart.inteviews;

import java.util.Scanner;
//Given a number, reverse the bits in the binary representation
//(consider 32-bit unsigned data) of the number, and print the new number formed. 
public class ReverseBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println(reverse4(sc.nextLong()));
		}
		sc.close();
	}

	public static long reverse4(long a) {
		long rev = 0;
		for (int i = 0; i < 32; i++, a >>= 1)
			rev = (rev << 1) | (a & 1);
		return rev;
	}

}
