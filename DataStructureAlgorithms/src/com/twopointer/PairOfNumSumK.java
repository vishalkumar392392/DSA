package com.twopointer;

import java.util.Arrays;

public class PairOfNumSumK {

	public static void main(String[] args) {

		int arr[] = { 8, 12, 20, -5, 10, -3, 6 };
		int k = 1;
		Arrays.sort(arr);
		System.out.println(containsSumKTwoPointer(arr, k));
		System.out.println(containsSumKBinarySearch(arr, k));
		System.out.println(binarySearch(arr, -5, 0, arr.length));

	}

	public static boolean containsSumKBinarySearch(int arr[], int k) {

		for (int i = 0; i < arr.length; i++) {
			if (binarySearch(arr, (k - arr[i]), 0, arr.length - 1)) {
				return true;
			}
		}

		return false;
	}

	private static boolean binarySearch(int[] arr, int k, int low, int high) {

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {
				return true;
			}
			if (arr[mid] < k)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return false;

	}

	public static boolean containsSumKTwoPointer(int arr[], int k) {

		int p1 = 0;
		int p2 = arr.length - 1;

		while (p1 < p2) {

			if ((arr[p1] + arr[p2]) == k)
				return true;
			if ((arr[p1] + arr[p2]) < k)
				p1++;
			else if ((arr[p1] + arr[p2]) > k)
				p2--;

		}

		return false;
	}

}
