package com.geeks.mathmatics.practice;

public class TermOfGP {

	public static void main(String[] args) {
		System.out.println(termOfGP(1, 2, 5));
	}

	public static double termOfGP(int A, int B, int N) {
		double r = ((double) B / (double) A);
		return A * (Math.pow(r, (N - 1)));
	}

}
