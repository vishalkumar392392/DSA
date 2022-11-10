package com.geeks.mathmatics;

public class GCD {

	public static void main(String[] args) {
		System.out.println(gcd(10, 15));
		System.out.println(euclideanGcd(10, 15));
		System.out.println(optEuclidGCD(100, 200));

	}

	public static int gcd(int a, int b) {
		int res = Math.min(a, b);

		while (res > 0) {
			if (a % res == 0 && b % res == 0) {
				return res;
			}

			res--;
		}

		return res;
	}

	public static int euclideanGcd(int a, int b) {

		while (a != b) {
			if (a > b) {
				a = a - b;

			} else {
				b = b - a;
			}
		}
		return a;
	}

	// optimized euclid solution
	// TC -> log(min(a,b))
	public static int optEuclidGCD(int a, int b) {

		if (b == 0)
			return a;

		return optEuclidGCD(b, a % b);
	}

}
