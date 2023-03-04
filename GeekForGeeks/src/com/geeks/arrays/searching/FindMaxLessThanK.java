package com.geeks.arrays.searching;

import java.util.Arrays;

public class FindMaxLessThanK {

	public static void main(String[] args) {

		int arr[] = { 8, 12, -4, -10, 5, 19, 3 };
		System.out.println(bruteForce(arr, 15));
		System.out.println(maxLessThanKinArray(arr, 15));

	}

	static int bruteForce(int arr[], int q) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= 12) {
				max = Math.max(max, arr[i]);
			}

		}

		return max;
	}

	static int maxLessThanKinArray(int arr[], int q) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;

		int max = 0;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] <= q) {
				max = arr[mid];
				low = mid + 1;
			}else {
				high = mid-1;
			}
		}
		return max;
	}

}
