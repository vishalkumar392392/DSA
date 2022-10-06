package com.recursion;

public class SumOfNumbers {

	public static void main(String[] args) {
		System.out.println(sum(10));
	}

	public static int sum(int num) {

		if (num == 0)
			return 0;
		return num + sum(num - 1);
	}

}
