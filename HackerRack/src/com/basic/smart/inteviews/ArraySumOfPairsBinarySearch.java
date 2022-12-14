package com.basic.smart.inteviews;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySumOfPairsBinarySearch {

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
				Arrays.sort(arr);

				if (extracted1(arr, 0, arr.length - 1, k)) {
					System.out.println("True");
				} else {
					System.out.println("False");
				}

			}

		}
		sc.close();
	}

	private static boolean extracted1(long[] arr, int p1, int p2, long k) {

		while (p1 < p2) {
			if ((arr[p1] + arr[p2]) == k)
				return true;
			if ((arr[p1] + arr[p2]) > k) {
				p2--;
			}
			if ((arr[p1] + arr[p2]) < k) {
				p1++;
			}

		}
		return false;
	}

}
