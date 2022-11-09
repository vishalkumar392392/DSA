package com.geeks.mathmatics;

public class TrailingZerosInFactorial {

	public static void main(String[] args) {

		System.out.println(trailingZeros(10));
		System.out.println(trailingZerosEffecientMethod(100));

	}

	public static int trailingZerosEffecientMethod(int num) {

		int res = 0;

		for (int i = 5; i <= num; i = i * 5) {
			res = res + num / i;
		}

		return res;
	}

	public static int trailingZeros(int num) {
		long number = factorial(num);
		int count = 0;
		while (number > 0) {

			if (number % 10 == 0)
				count++;
			else {
				break;
			}

			number = number / 10;
		}
		return count;

	}

	public static long factorial(long num) {

		if (num == 1)
			return 1;
		return (num * factorial(num - 1));
	}

}
