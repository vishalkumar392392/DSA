package com.geeks.mathmatics.practice;

public class DigitsInFactorial {

	public static void main(String[] args) {

		System.out.println(digitsInFactorial(120));
		System.out.println(Math.floor(Math.log10(2888)) + 1);
	}

	public static int digitsInFactorial(int N) {
		// code here
		if (N <= 0) {
			return 1;
		}
		double digits = 0;
		for (int i = 2; i <= N; i++)
			digits += Math.log10(i);
		return (int) (Math.floor(digits)) + 1;
	}
}
