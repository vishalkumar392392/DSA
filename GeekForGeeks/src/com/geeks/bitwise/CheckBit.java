package com.geeks.bitwise;

public class CheckBit {

	public static void main(String[] args) {
		System.out.println(checkKthBit(39, 5));
	}

	static boolean checkKthBit(int n, int k) {
		if (((n >> k) & 1) != 0) {
			return true;
		} else {
			return false;
		}
	}
}
