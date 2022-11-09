package com.geeks.mathmatics;

public class CountDigits {

	public static void main(String[] args) {

		System.out.println(countDigits(22222));
		System.out.println(countDigitsLoop(22222));

	}

	public static int countDigits(int num) {

		if (num == 0)
			return 0;
		return 1 + countDigits(num / 10);
	}

	public static int countDigitsLoop(int num) {

		int res = 0;

		while (num > 0) {
			num = num / 10;
			res++;
		}

		return res;
	}

}
