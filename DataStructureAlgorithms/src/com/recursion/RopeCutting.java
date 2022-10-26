package com.recursion;

public class RopeCutting {

	public static void main(String[] args) {

		int a = maxPieces(23, 11, 9, 12);
		System.out.println(a);
	}

	private static int maxPieces(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		if (n < 0)
			return -1;
		int res = max(maxPieces(n - a, a, b, c), maxPieces(n - b, a, b, c), maxPieces(n - c, a, b, c));
		if (res == -1)
			return -1;
		return res + 1;
	}

	private static int max(int a, int b, int c) {
		return Math.max(Math.max(a, b), Math.max(b, c));
	}

}
