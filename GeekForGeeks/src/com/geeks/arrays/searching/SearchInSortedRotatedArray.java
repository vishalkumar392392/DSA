package com.geeks.arrays.searching;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50, 8, 9 };

		System.out.println(search(arr, arr.length, 8));
	}

	public static int search(int arr[], int n, int x) {

		int low = 1;
		int high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x)
				return mid;

			// Left half sorted
			if (arr[low] < arr[mid]) {

				if (x >= arr[low] && x < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
			// Right Half Sorted
			else {

				if (x > arr[mid] && x <= arr[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}
		}

		return -1;
	}

}
