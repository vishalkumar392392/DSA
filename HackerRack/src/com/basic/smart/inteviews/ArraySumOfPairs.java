package com.basic.smart.inteviews;

import java.util.Scanner;

public class ArraySumOfPairs {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int lines = sc.nextInt();

		for (int i = 0; i < lines; i++) {
			int size = sc.nextInt();
			long arr[] = new long[size];
			long k = sc.nextLong();

			if (size >= 2) {
				for (int j = 0; j < size; j++) {
					arr[j] = sc.nextLong();
				}

				if (extracted(size, arr, k)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}

			}

		}

		sc.close();
	}

	private static boolean extracted(int size, long[] arr, long k) {
		for (int m = 0; m < size; m++) {
			for (int n = 0; n < size; n++) {
				if (m != n && (arr[m] + arr[n] == k)) {
					return true;
				}
			}
		}
		return false;
	}

}
