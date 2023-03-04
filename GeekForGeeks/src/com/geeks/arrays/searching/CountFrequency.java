package com.geeks.arrays.searching;

public class CountFrequency {

	public static void main(String[] args) {
		int arr[] = { 1, 10, 10, 10, 10, 10, 10, 10, 10, 20, 20, 40 };
		int arr1[] = { 10, 20, 30 };
		int arr2[] = { 15, 15, 15 };
		int arr3[] = { 10, 15, 20, 20, 40, 40 };
		int arr4[] = { 5, 8, 8, 10, 10 };
		int arr5[] = { 8, 10, 10, 12 };

		System.out.println(countFrequency(arr, 10));
		System.out.println(countFrequency(arr1, 15));
		System.out.println(countFrequency(arr2, 15));
		System.out.println(countFrequency(arr3, 20));
		System.out.println(countFrequency(arr4, 10));
		System.out.println(countFrequency(arr5, 7));
	}

	static int countFrequency(int arr[], int k) {

		return floor(arr, k) - ceil(arr, k) == 0 ? 0 : floor(arr, k) - ceil(arr, k) + 1;
	}

	static int ceil(int arr[], int k) {
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

	static int floor(int arr[], int k) {
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
