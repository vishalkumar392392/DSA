package com.geeks.recursion;

import java.util.Scanner;

public class PowerOfA {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(power(sc.nextInt(), sc.nextInt()));
		sc.close();

	}

	public static int power(int a, int n) {

		if (n == 0)
			return 1;

		return a * power(a, n - 1);
	}

}
