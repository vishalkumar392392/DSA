package com.geeks.mathmatics;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println(isPalindrome(7678));
	}

	public static boolean isPalindrome(int num) {

		int sum = 0;
		int temp = num;
		while (num > 0) {
			int res = num % 10;
			num = num / 10;
			sum = sum * 10 + res;
		}
		return temp == sum;
	}

}
