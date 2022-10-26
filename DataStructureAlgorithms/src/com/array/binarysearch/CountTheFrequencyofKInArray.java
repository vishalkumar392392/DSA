package com.array.binarysearch;

import java.util.Arrays;

public class CountTheFrequencyofKInArray {

	public static void main(String[] args) {

		int arr[] = { 8, 10, 10, -4, 2, 2, 6, 2, 2, 10, 8, 3, 2, 10, 2, -4 };

		Arrays.sort(arr);
		int floor = floor(arr, 0, arr.length - 1, 2);
		int ceil = ceil(arr, 0, arr.length - 1, 2);
		System.out.println(floor - ceil + 1);
	}

	public static int floor(int arr[], int low, int high, int k) {

		int ans = Integer.MIN_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {
				ans = mid;
				low = mid + 1;
			}
			if (arr[mid] < k)
				low = mid + 1;
			else
				high = mid - 1;

		}
		return ans;
	}

	public static int ceil(int arr[], int low, int high, int k) {

		int ans = Integer.MIN_VALUE;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {
				ans = mid;
				high = mid - 1;
			}
			if (arr[mid] < k)
				low = mid + 1;
			else
				high = mid - 1;

		}
		return ans;
	}

}
