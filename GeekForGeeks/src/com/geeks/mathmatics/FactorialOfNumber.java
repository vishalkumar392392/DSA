package com.geeks.mathmatics;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println(factorial(6));
		System.out.println(recursiveSolution(6));

	}

	public static int factorial(int num) {

		int res = 1;
		for (int i = 1; i <= num; i++) {
			res = res * i;
		}
		return res;
	}

	public static int recursiveSolution(int num) {

		if (num == 1)
			return 1;

		return num * recursiveSolution(num - 1);
	}

}
