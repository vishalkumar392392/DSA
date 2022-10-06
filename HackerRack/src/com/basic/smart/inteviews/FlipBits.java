package com.basic.smart.inteviews;

import java.util.Scanner;

public class FlipBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int count = 0;
		for (int i = 0; i < size; i++) {
			count = 0;
			long a = sc.nextLong();
			long b = sc.nextLong();

			for (int j = 0; j < 31; j++) {

				if (checkBit(a, j) != checkBit(b, j)) {
					count++;
				}
			}

			System.out.println(count);

		}
		sc.close();
	}

	public static boolean checkBit(long a, int pos) {
		return ((a >> pos) % 2 == 1);
	}
}
