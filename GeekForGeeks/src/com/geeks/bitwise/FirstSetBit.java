package com.geeks.bitwise;

public class FirstSetBit {

	public static void main(String[] args) {
		System.out.println(getFirstSetBit(39));
	}

	public static int getFirstSetBit(int n) {

		for (int i = 1; i < 32; i++) {

			if ((n >> (i - 1) & 1) != 0)
				return i;
		}

		return 0;

	}
}
