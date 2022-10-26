package com.array.binarysearch;

import java.util.Arrays;

public class MaxElelementAfterK {

	public static void main(String[] args) {

		int arr[] = { 5, 67, 1, 8, 22, 99, 23 };
		Arrays.sort(arr);
		System.out.println(maxElementLessThanK(arr, 0, arr.length - 1, 25));

	}

	public static int maxElementLessThanK(int arr[], int low, int high, int k) {

		int ans = Integer.MIN_VALUE;

		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] <= k) {
				low = mid + 1;
			} else {
				ans = arr[mid];
				high = mid - 1;
			}

		}
		return ans;
	}

}
