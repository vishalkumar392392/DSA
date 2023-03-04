package com.geeks.arrays.searching;

public class CeilBinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 10, 10, 10, 20, 20, 40 };
		int arr1[] = { 10, 20, 30 };
		int arr2[] = { 15, 15, 15 };

		System.out.println(ceilBinarySearch(arr, 20));
		System.out.println(ceilBinarySearch(arr1, 15));
		System.out.println(ceilBinarySearch(arr2, 15));

	}

	static int ceilBinarySearch(int arr[], int k) {

		int low = 0;
		int high = arr.length - 1;

		int ans = -1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == k) {
				ans = mid;
				high = mid - 1;
			} else if (arr[mid] > k) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}

}
