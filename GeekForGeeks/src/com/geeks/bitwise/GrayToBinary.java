package com.geeks.bitwise;

public class GrayToBinary {

	public static void main(String[] args) {
		System.out.println(grayToBinary(4));
	}

	// TC -> logn
	public static int grayToBinary(int n) {

		int res = 0;
		while (n > 0) {
			res = res ^ n;
			n = n >> 1;
		}
		return res;
	}

}
