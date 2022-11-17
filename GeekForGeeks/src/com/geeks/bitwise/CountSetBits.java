package com.geeks.bitwise;

public class CountSetBits {

	public static void main(String[] args) {

		System.out.println(countSetBits(7));
	}

	public static int countSetBits(int n) {

		int count = 0;
		for (int i = 1; i <= 32; i++) {

			if ((n >> (i - 1) & n) != 0) {
				count++;
			}
		}

		return count;
	}

}
