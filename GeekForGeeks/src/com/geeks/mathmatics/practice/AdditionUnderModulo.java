package com.geeks.mathmatics.practice;

public class AdditionUnderModulo {
	public static void main(String[] args) {
		System.out.println(sumUnderModulo(5,9));
	}

	public static long sumUnderModulo(long a, long b) {
		long M = 1000000007;
		a = a % M;
		b = b % M;
		return (a + b) % M;
	}

}
