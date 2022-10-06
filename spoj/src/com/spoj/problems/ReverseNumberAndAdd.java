package com.spoj.problems;

import java.util.Scanner;

public class ReverseNumberAndAdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String line = sc.nextLine();
		for (int i = 0; i < size; i++) {
			line = sc.nextLine();
			System.out.println(reverseNum(Long.parseLong(line.split(" ")[0]), Long.parseLong(line.split(" ")[1])));
		}
		sc.close();
	}

	private static long reverseNum(long num1, long num2) {
		return reverse(reverse(num1) + reverse(num2));
	}

	private static long reverse(long num) {
		String res = "";
		while (num > 0) {
			res = res + num % 10;
			num = num / 10;
		}
		return Long.parseLong(res);
	}

}
