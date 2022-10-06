package com.recursion;

public class Fibnoci {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			System.out.println(i == 1 ? 0 : fib(i));
		}
	}

	public static int fib(int n) {
		if (n <= 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

}
