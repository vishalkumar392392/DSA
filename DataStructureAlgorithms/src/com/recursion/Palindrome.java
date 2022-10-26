package com.recursion;

public class Palindrome {

	public static void main(String[] args) {

		String input = "viaiv";

		System.out.println(palindrome(input, 0, input.length() - 1));
		System.out.println(isplaindrome(input));

	}

	public static boolean palindrome(String st, int start, int end) {

		if (start >= end)
			return true;

		return (st.charAt(start) == st.charAt(end)) && palindrome(st, start + 1, end - 1);

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
