package com.twopointer;

public class IsPalindrome {

	public static void main(String[] args) {
		String input = "viaiv";

		System.out.println(isplaindrome(input));
	}

	public static boolean isplaindrome(String input) {

		int p1 = 0;
		int p2 = input.length() - 1;

		while (p1 <= p2) {
			if ((input.charAt(p1) != input.charAt(p2)))
				return false;
			else {
				p1++;
				p2--;
			}
		}

		return true;
	}

}
