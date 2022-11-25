package com.geeks.bitwise;

public class RightMostDifferentBit {

	public static void main(String[] args) {
		System.out.println(posOfRightMostDiffBit(11, 9));
	}

	public static int posOfRightMostDiffBit(int m, int n) {
		for (int i = 1; i <= 32; i++) {
			int res1 = (m >> (i - 1) & 1) % 2;
			int res2 = (n >> (i - 1) & 1) % 2;
			if (res1 != res2) {
				return i;
			}
		}

		return -1;
	}

}
