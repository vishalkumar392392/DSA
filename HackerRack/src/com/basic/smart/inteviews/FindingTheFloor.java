package com.basic.smart.inteviews;

import java.util.Arrays;
import java.util.Scanner;

public class FindingTheFloor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		long arr[] = new long[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextLong();
		}
		Arrays.sort(arr);

		int querySize = sc.nextInt();
		for (int i = 0; i < querySize; i++) {

			System.out.println(findTheFloor(arr, 0, arr.length - 1, sc.nextLong()));
		}

		sc.close();
	}

	public static long findTheFloor(long arr[], int low, int high, long q) {
		long ans = Integer.MIN_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] <= q) {
				ans = arr[mid];
				low = mid + 1;
			} else
				high = mid - 1;
		}
		return ans;
	}

}
