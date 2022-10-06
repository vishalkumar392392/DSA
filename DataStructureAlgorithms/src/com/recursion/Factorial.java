package com.recursion;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(20));
	}

	public static long factorial(long num) {

		if (num == 0)
			return 1;
		return num * factorial(num - 1);
	}

}
