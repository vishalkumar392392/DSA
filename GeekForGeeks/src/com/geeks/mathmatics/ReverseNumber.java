package com.geeks.mathmatics;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println(reverseNumber(7865));

	}

	public static int reverseNumber(int num) {

		int sum = 0;

		while (num > 0) {
			int res = num % 10;
			num = num / 10;
			sum = sum * 10 + res;
		}

		return sum;
	}

}
