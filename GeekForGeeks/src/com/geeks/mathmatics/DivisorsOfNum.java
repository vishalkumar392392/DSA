package com.geeks.mathmatics;

public class DivisorsOfNum {

	public static void main(String[] args) {

		divisors(30);
	}

	public static void divisors(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				if (i != n / i) {
					System.out.print(n / i + " ");

				}

			}
		}
	}

}
