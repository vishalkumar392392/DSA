package com.week1;

public class IsPowerofTwo {

	public static void main(String args[]) {

		System.out.println(isPowerOfTwoMethod1(64));
		System.out.println(isPowerOfTwoMethod1(100));
		System.out.println(isPowerOfTwoMethod2(64));
		System.out.println(isPowerOfTwoMethod2(100));
		System.out.println(isPowerOfTwoMethod3(64));
		System.out.println(isPowerOfTwoMethod3(100));

	}

	public static String isPowerOfTwoMethod1(int num) {
		int ans = 1;
		int temp = 0;

		for (int i = 0; i < num; i++) {
			ans = ans * 2;
			if (ans == num) {
				temp = 1;
				return "Given number is power of 2";
			}
		}
		if (temp == 0)
			return "Given number is not a power of 2";
		return "";
	}

	public static String isPowerOfTwoMethod2(int num) {
		int res = 0;
		while (num > 0) {
			res = num % 2;
			num = num / 2;
			// checking quotient is 1 and reminder is zero
			if (num == 1 && res == 0) {
				return "Given number is power of 2";
			}
		}
		return "Given number is not a power of 2";
	}

	public static String isPowerOfTwoMethod3(int n) {

		if ((n & (n - 1)) == 0) {
			return "Given number is power of 2";
		} else {
			return "Given number is not a power of 2";
		}
	}

}
