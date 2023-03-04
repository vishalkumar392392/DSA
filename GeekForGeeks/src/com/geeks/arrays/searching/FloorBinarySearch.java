package com.geeks.arrays.searching;

public class FloorBinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 10, 10, 10, 20, 20, 40 };
		int arr1[] = { 10, 20, 30 };
		int arr2[] = { 15, 15, 15 };
		int arr3[] = { 10, 15, 20, 20, 40, 40 };
		int arr4[] = { 5, 8, 8, 10, 10 };
		int arr5[] = { 8, 10, 10, 12 };

		System.out.println(floorBinarySearch(arr, 20));
		System.out.println(floorBinarySearch(arr1, 15));
		System.out.println(floorBinarySearch(arr2, 15));
		System.out.println(floorBinarySearch(arr3, 20));
		System.out.println(floorBinarySearch(arr4, 10));
		System.out.println(floorBinarySearch(arr5, 7));

	}

	static int floorBinarySearch(int arr[], int k) {

		int low = 0;
		int high = arr.length - 1;
		int ans = -1;
		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == k) {
				ans = mid;
				low = mid + 1;
			} else if (arr[mid] > k) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}
}
