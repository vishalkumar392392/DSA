package com.basic.smart.inteviews;

import java.util.Scanner;

public class FindingCubeRoot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			long num = sc.nextLong();
			long cube = cube(num < 0 ? -(num) : num);
			System.out.println(num < 0 ? -(cube) : cube);
		}
		sc.close();

	}

	public static long cube(long num) {

		long p1 = 0;
		long p2 = num;
		long ans = Integer.MIN_VALUE;

		while (p1 <= p2) {
			long mid = (p1 + p2) / 2;
			if (mid * mid * mid == num) {
				return mid;
			} else if (mid * mid * mid > num) {
				p2 = mid - 1;
			} else {
				p1 = mid + 1;
			}
		}

		return ans;
	}
}
