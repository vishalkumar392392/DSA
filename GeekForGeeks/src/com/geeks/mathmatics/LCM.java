package com.geeks.mathmatics;

public class LCM {

	public static void main(String[] args) {

		System.out.println(lcmTwoNumbers(3, 7));
		System.out.println(lcmGeeks(3, 7));
		System.out.println(efficientLCM(3, 7));
	}

	public static int lcmTwoNumbers(int a, int b) {
		int res = 1;
		for (int i = 2; i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				a = a / i;
				b = b / i;
				res = res * i;
			}
		}

		if (res == 1) {
			res = a * b;
		} else {
			res = res * a * b;

		}

		return res;
	}

	public static int lcmGeeks(int a, int b) {

		int res = Math.max(a, b);

		while (true) {

			if (res % a == 0 && res % b == 0) {
				return res;
			}

			res++;
		}

	}

	// euclid algorithm recursive approch
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// formula a * b = gcd(a,b) * lcm (a,b)
	public static int efficientLCM(int a, int b) {

		return (a * b) / gcd(a, b);
	}

}
