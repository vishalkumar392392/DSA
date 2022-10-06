package com.recursion;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println(reverseNumber(75429));
	}

	public static String reverseNumber(int num) {

		if (num == 0)
			return "";

		return "" + num % 10 + reverseNumber(num / 10);
	}

}
